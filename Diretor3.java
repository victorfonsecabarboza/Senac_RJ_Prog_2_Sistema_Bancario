package sistemabancario;

public abstract class Diretor3 extends FuncionarioComSenhaAbs {
	int token;
	
	public boolean verifica(int senha, int token) {
		if ((this.senha == senha)) {
			if (this.token == token) {
				System.out.println("Acesso autorizado");
				return true;
			}
		} else {
			System.out.println("Senha não autorizada");
			return false;
		}
		return false;
	}
	@Override
	double getBonus() {
		return salario * 0.05 + 5000;
	}
}
