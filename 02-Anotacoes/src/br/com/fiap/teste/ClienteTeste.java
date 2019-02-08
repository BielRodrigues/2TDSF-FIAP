package br.com.fiap.teste;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.bean.Cliente;

public class ClienteTeste {

	public static void main(String[] args) {
		// Instanciar um cliente.
		Cliente c1 = new Cliente();
		c1.setId(84);
		c1.setNome("Mario");
		
		//API de Reflection para recuperar os métodos
		Method[] metodos = c1.getClass().getDeclaredMethods();
		
		for (int i = 0; i < metodos.length; i++) {
			System.out.println(metodos[i].getName());
		}
		
		System.out.println("--------------------------------------------------");
		
		//Recuperar os atributos
		Field[] atributos = c1.getClass().getDeclaredFields();
		for (Field item : atributos) {
			System.out.println(item.getName());
			//recuperar a anotação @Coluna
			Coluna anotacao = item.getAnnotation(Coluna.class);
			System.out.println("Coluna: " + anotacao.nome());
			System.out.println("Obrigatório: " + anotacao.obrigatorio());
		}
		
		System.out.println("--------------------------------------------------");
		
		//Exibir o nome da classe
		System.out.println(c1.getClass().getName());
	}
}
