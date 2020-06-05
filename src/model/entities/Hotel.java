package model.entities;


public class Hotel {

	private String nome;
	private int estrelas;
	private Double valorDiaria;
	private Endereco endereco;
	
	public Hotel() {
	}

	public Hotel(String nome, int estrelas, double valorDiaria, Endereco endereco) {
		this.nome = nome;
		this.estrelas = estrelas;
		this.valorDiaria = valorDiaria;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEstrelas() {
		return estrelas;
	}

	public void setEstrelas(int estrelas) {
		this.estrelas = estrelas;
	}

	public Double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(Double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	
	
}
