package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_PROFESSOR")
@SequenceGenerator(name="professor", sequenceName="SQ_T_PROFESSOR", allocationSize=1)
public class Professor {
	
	@Id
	@Column(name="cd_professor")
	@GeneratedValue(generator="professor", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_professor", nullable=false)
	private String nome;
	
	@Lob
	@Column(name="fl_professor")
	private byte[] foto;
	
	@Column(name="cd_cpf", length=11)
	private String cpf;
	
	
	public Professor() {
		super();
	}

	public Professor(int codigo, String nome, byte[] foto, String cpf) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.foto = foto;
		this.cpf = cpf;
	}

	public Professor(String nome, byte[] foto, String cpf) {
		super();
		this.nome = nome;
		this.foto = foto;
		this.cpf = cpf;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
