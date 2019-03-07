package br.com.fiap.teste;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.fail;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.fiap.dao.ProfessorDAO;
import br.com.fiap.dao.impl.ProfessorDAOImpl;
import br.com.fiap.entity.Professor;
import br.com.fiap.exception.CodigoInexistenteException;
import br.com.fiap.exception.CommitException;

class ProfessorDAOTest {
	
	private static ProfessorDAO dao;
	
	//método que será executado
	@BeforeAll
	public static void inicializar() {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("teste");
		EntityManager em = fabrica.createEntityManager();
		
		dao = new ProfessorDAOImpl(em);
	}
	//Teste Cadastrar
	@Test
	void test() {
		//Arrange = instanciar os objetos
		
		Professor prof = new Professor("Parducci", null, "123456789");
		
		//Act - realizar a ação (chamar o método para teste)
		try {
			dao.cadastrar(prof);
			dao.commit();
		} catch (CommitException e) {
			e.printStackTrace();
			fail("Falha no teste...");
		}
		
		//Assert - validar o resultado
		//valida se foi gerado um código pela sequence
		assertNotEquals(0, prof.getCodigo());
	}
	
	//Teste Atualizar
	@Test
	void atualizarTest() {
		
		Professor prof = new Professor(3, "Fernanda", null, "123456789");
		
		try {
			dao.atualizar(prof);
			dao.commit();
		}catch (CommitException e) {
			e.printStackTrace();
			fail("Falha no teste.");
		}
	}

	//Teste Pesquisa
	@Test
	void pesquisarTest() {
		
		try {
			Professor prof = dao.pesquisar(1);
		} catch (CodigoInexistenteException e) {
			e.printStackTrace();
			fail("Falha no teste.");
		}
	}
	
	//Teste Excluir
	@Test
	void excluirTest() {
		try {
			Professor prof = dao.pesquisar(1);
			dao.excluir(1);
			dao.commit();
		} catch (CodigoInexistenteException e) {
			e.printStackTrace();
		} catch(CommitException e) {
			e.printStackTrace();
		}
		
	}
}

