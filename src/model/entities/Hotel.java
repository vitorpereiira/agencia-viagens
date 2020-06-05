package model.entities;

public class Hotel {

	private String nome;
	private int estrelas;
	private Endereco endereco;
	private Reserva reserva;
	
	
public Hotel() {
}


public Hotel(String nome, int estrelas, Endereco endereco, Reserva reserva) {
	this.nome = nome;
	this.estrelas = estrelas;
	this.endereco = endereco;
	this.reserva = reserva;
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


public Reserva getReserva() {
	return reserva;
}


public void setReserva(Reserva reserva) {
	this.reserva = reserva;
}






}
