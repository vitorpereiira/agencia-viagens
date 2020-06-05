package model.entities;

public class Hotel {

	private String nome;
	private int estrelas;
	private Endereco endereco;

	public Hotel() {
	}

	public Hotel(String nome, int estrelas, Endereco endereco) {
		this.nome = nome;
		this.estrelas = estrelas;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
