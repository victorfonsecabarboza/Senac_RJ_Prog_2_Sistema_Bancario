package sistemabancario;

public class Gerente3 extends FuncionarioComSenhaAbs {
	int senha;
	
	@Override
	double getBonus() {
		//return this.salario * 0.05<-base de funcionario + 5000;
		return salario * 0.05 + 5000;
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