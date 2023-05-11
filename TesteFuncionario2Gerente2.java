package sistemabancario;

public class TesteFuncionario2Gerente2 {
	public static void main(String[] args) {
		Funcionario2 f2 = new Funcionario2();
		f2.setSalario(1000);
		System.out.println("O salario do funcionario eh: "+f2.getSalario());
		System.out.println("O bonus do funcionario eh "+f2.getBonus());
		
		Gerente2 g2 = new Gerente2();
		g2.setSalario(10000);
		System.out.println("O salario do gerente eh: "+g2.getSalario());
		System.out.println("O bonus do gerente eh: "+g2.getBonus());
	}

}
