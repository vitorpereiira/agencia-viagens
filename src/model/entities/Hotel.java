package model.entities;


public class Hotel {

	
	private int id;
	private String nome;
	private int estrelas;
	private Double valorDiaria;
	public Endereco endereco;
	
	public Hotel() {
	}

	public Hotel(int id, String nome, int estrelas, double valorDiaria, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.estrelas = estrelas;
		this.valorDiaria = valorDiaria;
		this.endereco = endereco;
	}

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
