package br.com.fiap.beans;

public class Cliente {

	// VISIBILIDADE > TIPO DE DADO > NOME DA VARIÁVEL 
	
	private String nome;
	private int idade;
	private double peso;
	private Endereco endereco;
	private Telefone telefone;
	
	//MÉTODO CONSTRUTOR
	// Construtor vazio
	public Cliente () {
		super();
	}
	// Construtor cheio
	public Cliente (String nome, int idade, double peso) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}
	
	// Getters (Entrada de dados)
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setEndereco (Endereco endereco) {
		this.endereco = endereco;
	}
	public void setTelefone (Telefone telefone) {
		this.telefone = telefone;
	}
	
	// Setters (Saída de dados)
	
	public String getNome () {
		return nome;
	}
	public int getIdade () {
		return idade;
	}
	public double getPeso() {
		return peso;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public Telefone getTelefone () {
		return telefone;
	}
}
