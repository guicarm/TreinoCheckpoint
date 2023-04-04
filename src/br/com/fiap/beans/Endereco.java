package br.com.fiap.beans;

public class Endereco {

	private String logradouro;
	private int numero;
	private String cep;
	private String bairro;
	private String municipio;
	private String estado;
	private String nacionalidade;
	
	// Getters (Métodos de Entrada)
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	// Setters (Métodos de Saída)
	
	public String getLogradouro() {
		return logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public String getCep() {
		return cep;
	}
	public String getBairro() {
		return bairro;
	}
	public String getMunicipio() {
		return municipio;
	}
	public String getEstado() {
		return estado;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
}
