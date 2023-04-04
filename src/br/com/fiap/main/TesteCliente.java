package br.com.fiap.main;

import br.com.fiap.beans.Endereco;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Telefone;

public class TesteCliente {

	public static void main(String[] args) {
	
		// Instânciar objetos
	Cliente objCliente = new Cliente ();
	Endereco objEndereco = new Endereco ();
	Telefone objTelefone = new Telefone ();
	
	
	  // Setters Cliente
	objCliente.setNome("Verón Toscano");
	objCliente.setIdade(24);
	objCliente.setPeso(75.50);
	objCliente.setEndereco(objEndereco);
	objCliente.setTelefone(objTelefone);
	
	
	// Setters Endereco
	objEndereco.setLogradouro(JOptionPane.showInputDialog("Digite o Logradouro: "));
	objEndereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o Número: ")));
	objEndereco.setCep(JOptionPane.showInputDialog("Digite o CEP: "));
	objEndereco.setBairro(JOptionPane.showInputDialog("Digite o Bairro: "));
	objEndereco.setMunicipio(JOptionPane.showInputDialog("Digite o Município: "));
	objEndereco.setEstado(JOptionPane.showInputDialog("Digite o Estado: "));
	objEndereco.setNacionalidade(JOptionPane.showInputDialog("Digite a Nacionalidade: "));
	
   // Setters Telefone
	objTelefone.setFixo("157157157");
	objTelefone.setCelular("+55 11 97441-4510");
	objTelefone.setComercial("171171171");
	objTelefone.setContato("Lukinhas Veronzin");
	
		
	// GETTERS 
	
	System.out.println("Nome do Cliente: " + objCliente.getNome() +
					"\nIdade do Cliente: " + objCliente.getIdade() +
					"\nPeso do Cliente: " + objCliente.getPeso() +
					"\n=========================================" +
					"\nENDEREÇO" +
					"\nLogradouro: " + objCliente.getEndereco().getLogradouro() +
					"\nNúmero: " + objCliente.getEndereco().getNumero() + 
					"\nCEP: " + objCliente.getEndereco().getCep() +
					"\nBairro: " + objCliente.getEndereco().getBairro() + 
					"\nMunicípio: " + objCliente.getEndereco().getMunicipio() +
					"\nEstado: " + objCliente.getEndereco().getEstado() +
					"\nNacionalidade: " + objCliente.getEndereco().getNacionalidade() +
					"\n=========================================" +
					"\nINFORMAÇÕES DE CONTATO" +
					"\nTelefone Fixo: " + objCliente.getTelefone().getFixo() + 
					"\nTelefone Celular: " + objCliente.getTelefone().getCelular() +
					"\nTelefone Comercial: " + objCliente.getTelefone().getComercial() +
					"\nContato: " + objCliente.getTelefone().getContato());
	}
}
