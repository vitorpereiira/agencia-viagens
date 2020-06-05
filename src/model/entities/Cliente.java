package model.entities;

public class Cliente {

	private String nome;
	private String sexo;
	private Integer idade;
	private Double cel;
	private Endereco endereco;

	public Cliente() {

	}
	public Cliente(String nome, String sexo, Integer idade, Double cel, Endereco endereco) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.cel = cel;
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public Double getCel() {
		return cel;
	}
	public void setCel(Double cel) {
		this.cel = cel;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	


}
