package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Pacote {

	private int numero;

	public List<Reserva> reservas = new ArrayList<>();

	public Pacote(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void addReserva(Reserva reserva) {
		reservas.add(reserva);
	}

	public List<Reserva> getReserva(){
		return reservas;
	}

	

	
	
	
	
	
	



}

