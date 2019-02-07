package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.bean.Carro;

//Uma interface pdoe herdar de uma uma ou mais interfaces
public interface CarroDAO {
	
	//somente as assinaturas dos métodos
	List<Carro> buscarCarros();	
	
	void criar(Carro carro);
	
	
}
