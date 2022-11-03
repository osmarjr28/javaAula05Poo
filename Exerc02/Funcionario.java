package exercisesClass05.model;

public class Funcionario {

	private String nome;
	private int cpf;
	private String endereco;
	private float salario;
	private String cargo;

	public Funcionario(String nome, int cpf, String endereco, float salario, String cargo) {

		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.salario = salario;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void visualizarFuncionario() {

		System.out.println("\n**************************");
		System.out.println("Nome completo:" + getNome());
		System.out.println("\n**************************");
		System.out.println("\nCPF:" + getCpf());
		System.out.println("\n**************************");
		System.out.println("\nEndereço:" + getEndereco());
		System.out.println("\n**************************");
		System.out.println("\nSalario:" + getSalario());
		System.out.println("\n**************************");
		System.out.println("\nCargo:" + getCargo());
	}
}
