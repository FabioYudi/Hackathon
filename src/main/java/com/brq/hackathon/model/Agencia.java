package com.brq.hackathon.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Agencia {
	
	@JsonProperty("codigo")
	private long codigo;
	
	@JsonProperty("local")
	private String local;
	
	@JsonProperty("descricao")
	private String descricao;
	
	@JsonProperty("telefone")
	private String telefone;
	
	@JsonProperty("logradouro")
	private String logradouro;
	
	@JsonProperty("numero")
	private String numero;
	
	@JsonProperty("complemento")
	private String complemento;
	
	@JsonProperty("cep")
	private String cep;
	
	@JsonProperty("bairro")
	private String bairro;
	
	@JsonProperty("cidade")
	private String cidade;
	
	@JsonProperty("uf")
	private String uf;
	
	@JsonProperty("coordenada")
	private Coordenada coordenada;
	
	
	

	public Coordenada getCoordenada() {
		return coordenada;
	}

	public void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
	
	
	 


}
