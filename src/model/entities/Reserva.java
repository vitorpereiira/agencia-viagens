package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
	
	private Integer num;
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
	
	
	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public List<Cliente> getCliente(){
		return clientes;
	}


	
	

	

}
