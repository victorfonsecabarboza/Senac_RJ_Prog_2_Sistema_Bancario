package sistemabancario;

public class ContaRemuneradaEspecial extends ContaAbs {

	@Override
	void correcao() {
		this.saldo += this.saldo * 0.015;
	}
}
