package br.com.fiap.bean;

import java.util.Calendar;

public class Carro {
	
	//Constante
	public final static String EXEMPLO_TESTE = "teste";
	
	
	//public, private
	//protected -> no mesmo pacote, e nas filhas
	//default/package -> no mesmo pacote
	
	private String cor;

	private Transmissao cambio;
	
	private Calendar dataLancamento;

	public Transmissao getCambio() {
		return cambio;
	}

	public void setCambio(Transmissao cambio) {
		this.cambio = cambio;
	}

	public static String getExemploTeste() {
		return EXEMPLO_TESTE;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return this.cor;
	}
	
	public void setCor() {
		this.cor = cor;
	}

	public Calendar getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Calendar dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
}
