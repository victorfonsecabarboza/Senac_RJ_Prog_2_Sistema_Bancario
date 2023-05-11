package sistemabancario;

public class Gerente1 extends Funcionario1{
	int senha;
	
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
