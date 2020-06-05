package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Reserva {

	private Integer num;
	private Hotel hotel;
	
	public List<Cliente> clientes = new ArrayList<>();

	public Reserva(Integer num) {
		this.num = num;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public List<Cliente> getCliente() {
		return clientes;
	}

}
