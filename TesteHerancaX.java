package sistemabancario;

public class TesteHerancaX {
	public static void main(String[] args) {
		Funcionario3 f3 = new Funcionario3();
		f3.setSalario(1000);
		double salFuncionario = f3.getSalario();
		System.out.println("O salario do funcionario f3 eh: "+salFuncionario);
		System.out.println("O bonus do funcionario f3 eh: "+f3.getBonus());
		
		Gerente3 g3 = new Gerente3();
		g3.setSalario(10000);
		System.out.println("O salario do gerente g3 eh: "+g3.getSalario());
		System.out.println("O bonus do gerente g3 eh: "+g3.getBonus());
		
		Funcionario3 f33 = new Funcionario3();
		f33.setSalario(1000);
		System.out.println("O salario do funcionario f33 eh: "+f33.getSalario());
		System.out.println("O bonus do funcionario f33 eh: "+f33.getBonus());
		
	}

}
