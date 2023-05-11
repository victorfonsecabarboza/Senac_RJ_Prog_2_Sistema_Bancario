package sistemabancario;

public class TesteGerente3Func3 {
	public static void main(String[] args) {
		Funcionario3 f3 = new Funcionario3();
		f3.setSalario(1000);
		System.out.println("O salario do funcionario eh: "+f3.getSalario());
		System.out.println("O bonus do funcionario eh "+f3.getBonus());

		Gerente3 g3 = new Gerente3();
		g3.setSalario(10000);
		System.out.println("O salario do gerente eh: "+g3.getSalario());
		System.out.println("O bonus do gerente eh: "+g3.getBonus());
	}

}
