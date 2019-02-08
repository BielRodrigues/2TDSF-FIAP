package br.com.fiap.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Mantem a anotação até a execução.
@Target(ElementType.FIELD) // Somente para os atributos.
public @interface Coluna {
	
	String nome();
	
	boolean obrigatorio();
	
	
}
