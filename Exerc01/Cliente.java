package exercisesClass05.model;

public class Cliente {

	private String nome;
	private int cpf;
	private String email;
	private int contato;
	private String endereco;

	public Cliente(String nome, int cpf, String email, int contato, String endereco) {

		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.contato = contato;
		this.endereco = endereco;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getContato() {
		return contato;
	}

	public void setContato(int contato) {
		this.contato = contato;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void visualizar() {

		System.out.println("\n**************************");
		System.out.println("Nome completo:" + getNome());
		System.out.println("\n**************************");
		System.out.println("\nCPF:" + getCpf());
		System.out.println("\n**************************");
		System.out.println("\nE-mail:" + getEmail());
		System.out.println("\n**************************");
		System.out.println("\nCelular/Telefone:" + getContato());
		System.out.println("\n**************************");
		System.out.println("\nCelular/Telefone:" + getEndereco());

	}
}
