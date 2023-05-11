package sistemabancario;

public class Gerente2 extends Funcionario2{
	int senha;
	
	@Override
	double getBonus() {
		return this.salario * 0.15;
	}
	
	public boolean verifica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso autorizado");
			return true;
		} else {
			System.out.println("Senha não autorizada");
			return false;
		}
	}

}
