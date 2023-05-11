package sistemabancario;

public abstract class FuncionarioComSenhaAbs extends FuncionarioAbs {
	int senha;
	
	abstract boolean verifica(int senha);
	
	
	@Override
	double getBonus() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
