package sistemabancario;

public class ContaCliente3Construtor {
	int numero;
//	String nome;
	Cliente cliente = new Cliente();
	double saldo;
	double limite;
	
	public ContaCliente3Construtor(String nome, String cpf) {
		System.out.println("teste da classe com construtor");
		this.cliente.nome = nome;
		this.cliente.cpf = cpf;
	}
	

}
