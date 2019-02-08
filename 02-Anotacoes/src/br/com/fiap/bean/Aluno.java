package br.com.fiap.bean;

import br.com.fiap.anotacao.Tabela;

@Tabela(nome="TAB_ALUNO")
public class Aluno {
	
	private int id;
	private String nome;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
