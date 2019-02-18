package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Estado;
import br.com.fiap.entity.Produto;

public class Exercicio 
	public static void main(String[] args) {
		//Realizar o CRUD para o produto
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		em.getTransaction().begin();
		
		//Cadastrar
		Produto produto = new Produto("Chocolate", 2, Estado.NOVO, new GregorianCalendar(2019, Calendar.DECEMBER, 5), new GregorianCalendar(2019, Calendar.JANUARY, 22), 8, null);
		em.persist(produto);
		//Pesquisar
		
		//Atualizar
		
		//Remover
		
	
		em.getTransaction().commit();
		em.close();
		fabrica.close();
	}
}
