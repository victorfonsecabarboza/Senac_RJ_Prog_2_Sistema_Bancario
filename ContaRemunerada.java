package sistemabancario;

public class ContaRemunerada extends ContaAbs {

	@Override
	void correcao() {
		this.saldo += this.saldo;
	}
}
