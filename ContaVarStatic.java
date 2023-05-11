package sistemabancario;

public class ContaVarStatic {
	private static int contadorDeContas;
	int numero;
	double saldo;
	double limite;
	Cliente cliente = new Cliente();
	
	public ContaVarStatic(String nome, String cpf) {
		this.cliente.nome = nome;
		this.cliente.cpf = cpf;
		contadorDeContas++;
	}
	
	public int getContadorContas() {
		return ContaVarStatic.contadorDeContas;
	}
	
	public static int getContadorContas2() {
		return ContaVarStatic.contadorDeContas;
	}
	
	

}
