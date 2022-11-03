package exercisesClass05.model;

import exercisesClass05.model.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario func = new Funcionario("Neymar Junior", 123456789, "Paris", 10000.0f, "Futebol");

		func.visualizarFuncionario();

		func.setSalario(1000.0f);
		func.setEndereco("Itaquera");

		func.visualizarFuncionario();

	}

}
