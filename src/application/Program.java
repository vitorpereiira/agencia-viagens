package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Endereco;
import model.entities.Hotel;

public class Program {

	public static void main(String[] args) {
	
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		
		List<Hotel>hoteis = new ArrayList<>();
		Hotel escolhaHotel;
		
		int op;
		System.out.println("AGENCIA DE VIAGENS -> JV Viagens <-\n\n");
		System.out.println("Pacote de Viagens");
		do {
			System.out.println("Destino");
			System.out.println("1.Guaruja - SP \n2.Maceio - AL\n3.Sair");
			op = leia.nextInt();
		} while (op < 1 || op > 3);
		
		switch (op) {
		case 1:
			for (Hotel hotel : hoteis) {
				if(hotel.endereco.getCidade() == "Guaruja - SP") {
					System.out.println(hotel.getId()+hotel.getNome()+" - "+hotel.getEstrelas());
				}
			}
			break;
		case 2:
			for (Hotel hotel : hoteis) {
				if (hotel.endereco.getCidade() == "Maceio - AL") {
					System.out.println(hotel.getId()+hotel.getNome()+" - "+hotel.getEstrelas());
				}
			}
			break;
		case 3:
			System.out.println("Boa viagem!!");
			break;
		default:
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Guaruja - SP
		hoteis.add(new Hotel(100, "Hotel Ilhas do Caribe", 3, 200, new Endereco("Guaruja - SP", "Av. Guadalajara", 124)));
		hoteis.add(new Hotel(101, "Ferraretto Guarujá Hotel & Spa", 4, 300, new Endereco("Guaruja - SP", "Rua Mário Ribeiro", 564)));
		hoteis.add(new Hotel(102, "Sofitel Guarujá Jequitimar", 5, 500, new Endereco("Guaruja - SP", "Av. Marjori Prado", 1100)));
		
		// Maceio - AL
		hoteis.add(new Hotel(200, "Tambaqui Praia Hotel", 3, 200, new Endereco("Maceio - AL", "Rua Engenheiro Mário de Gusmão", 176)));
		hoteis.add(new Hotel(201, "Hotel Brisa Suites", 4, 300, new Endereco("Maceio - AL", "Av. Dr. Antônio Gouveia", 953)));
		hoteis.add(new Hotel(202, "Ritz Lagoa Da Anta", 5, 500, new Endereco("Maceio - AL", "Av. Brigadeiro Eduardo Gomes de Brito", 546)));
		
		
		
		leia.close();
	}

}
