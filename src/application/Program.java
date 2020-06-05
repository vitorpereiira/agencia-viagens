package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Endereco;
import model.entities.Hotel;

public class Program {

	public static void main(String[] args) {
	
		
		List<Hotel>hoteis = new ArrayList<>();
		
		
		// Guaruja - SP
		hoteis.add(new Hotel("Hotel Ilhas do Caribe", 3, 200, new Endereco("Guaruja - SP", "Av. Guadalajara", 124)));
		hoteis.add(new Hotel("Ferraretto Guarujá Hotel & Spa", 4, 300, new Endereco("Guaruja - SP", "Rua Mário Ribeiro", 564)));
		hoteis.add(new Hotel("Sofitel Guarujá Jequitimar", 5, 500, new Endereco("Guaruja - SP", "Av. Marjori Prado", 1100)));
		
		// Maceio - AL
		hoteis.add(new Hotel("Tambaqui Praia Hotel", 3, 200, new Endereco("Maceio - AL", "Rua Engenheiro Mário de Gusmão", 176)));
		hoteis.add(new Hotel("Hotel Brisa Suites", 4, 300, new Endereco("Maceio - AL", "Av. Dr. Antônio Gouveia", 953)));
		hoteis.add(new Hotel("Ritz Lagoa Da Anta", 5, 500, new Endereco("Maceio - AL", "Av. Brigadeiro Eduardo Gomes de Brito", 546)));
		
		
	}

}
