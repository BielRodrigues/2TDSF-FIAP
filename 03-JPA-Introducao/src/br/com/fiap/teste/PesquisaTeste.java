package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cliente;

public class PesquisaTeste {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		
		//Pesquisar um cliente com o código 1
		Cliente cliente = em.find(Cliente.class, 1);
		
		//Modificar o nome no banco de dados
		em.getTransaction().begin();
		cliente.setNome("Gabriel");
		
		System.out.println(cliente.getNome());
		
		em.getTransaction().commit();
		em.close();
		fabrica.close();
	}

}
