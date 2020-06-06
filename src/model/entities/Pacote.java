package model.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pacote {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private int numero;
	private Date inicio;
	private Date fim;

	public List<Reserva> reservas = new ArrayList<>();

	public Pacote(int numero, Date inicio, Date fim) {
		this.numero = numero;
		this.inicio = inicio;
		this.fim = fim;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFim() {
		return fim;
	}

	public void setFim(Date fim) {
		this.fim = fim;
	}

	public void addReserva(Reserva reserva) {
		reservas.add(reserva);
	}

	public List<Reserva> getReserva(){
		return reservas;
	}
	
	
	


	

	
	
	
	
	
	



}

