package sistemabancario;

public class Conta1 {
	int numero;
	String nome;
	double saldo;
	double limite;

	void sacar(double valor){
		double saldoAlterado = saldo - valor;
		saldo = saldoAlterado;
	}

	void depositar(double valor){
		this.saldo = this.saldo + valor;
		//		saldo += valor;

	}
}