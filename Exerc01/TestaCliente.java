package exercisesClass05.model;

import exercisesClass05.model.Cliente;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cli = new Cliente("Osmar Junior",1234567891, "osmar.cardoso@mercadolivre.com",999999999, "Rua Java");
		
		cli.visualizar();
		
		cli.setContato(111111111);
		
		cli.visualizar();
	}

}
