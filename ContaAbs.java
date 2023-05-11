package sistemabancario;

public abstract class ContaAbs {
	int numero;
	String nome;
	double saldo;
	double limite;

	abstract void correcao();

	boolean sacar(double valor) {
		if (this.saldo + this.limite < valor) {
			return false;
		} else {
			double saldoAlterado = this.saldo - valor;
			this.saldo = saldoAlterado;
			return true;
		}

	}

	void depositar(double valor) {
		this.saldo = this.saldo + valor;
		// saldo += valor;

	}
}