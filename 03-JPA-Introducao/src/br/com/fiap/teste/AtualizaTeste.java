package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Genero;

public class AtualizaTeste {

	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		//Atualizar um cliente
		//Instanciar um cliente com um Id que existe no Banco
		Cliente cliente = new Cliente(1, "Bolsonaro", 
		new GregorianCalendar(1970, Calendar.AUGUST, 14), "456-789-111-12", Genero.MASCULINO, null, false);
		
		em.merge(cliente);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		fabrica.close();
		
		//Atualizar um cliente
	}

}
