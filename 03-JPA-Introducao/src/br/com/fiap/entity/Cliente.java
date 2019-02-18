package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="T_CLIENTE")
@SequenceGenerator(name="cliente", sequenceName="SQ_T_CLIENTE", allocationSize=1)
public class Cliente {
	
	@Id
	@Column(name="cd_cliente")
	@GeneratedValue(generator="cliente", strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_cliente", nullable=false, length=100)
	private String nome;
	
	@Column(name="dt_nascimento")
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	
	@Column(name="nr_cpf", nullable=false, length=14)
	private String cpf;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_genero", nullable=false)
	private Genero genero;
	
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Column(name="dt_cadastro", updatable=false)
	private Calendar dataCadastro;
	
	@Lob
	@Column(name="fl_foto")
	private byte[] foto;
	
	@Column(name="st_vip")
	private boolean vip;
	
	@Transient
	private int numeroCartao;
	
	public Cliente() {
		super();
	}


	public Cliente(String nome, Calendar dataNascimento, String cpf, Genero genero, byte[] imagem,
			boolean vip) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.genero = genero;
		this.foto = imagem;
		this.vip = vip;
	}

	public Cliente(int codigo, String nome, Calendar dataNascimento, String cpf, Genero genero,
			byte[] imagem, boolean vip) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.genero = genero;
		this.foto = imagem;
		this.vip = vip;
	}



	public int getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
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

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public byte[] getImagem() {
		return foto;
	}

	public void setImagem(byte[] imagem) {
		this.foto = imagem;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}
	
	
}
