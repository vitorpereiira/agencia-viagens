package model.entities;

public class Endereco {

	protected String cidade;
	protected String rua;
	protected Integer numero;

	public Endereco() {
	}

	public Endereco(String rua, Integer numero) {
		super();
		this.rua = rua;
		this.numero = numero;
	}

	public Endereco(String cidade, String rua, Integer numero) {
		this.cidade = cidade;
		this.rua = rua;
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String dadosCompleto() {
		return null;
	}

}
