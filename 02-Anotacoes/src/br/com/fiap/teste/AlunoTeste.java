package br.com.fiap.teste;

import br.com.fiap.anotacao.Tabela;
import br.com.fiap.bean.Aluno;

public class AlunoTeste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		// Recuperar a anotação
		Tabela anotacao = aluno.getClass().getAnnotation(Tabela.class);
		System.out.println("SELECT * FROM " + anotacao.nome());
		
	}
}
