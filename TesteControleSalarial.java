package sistemabancario;

public class TesteControleSalarial {
	public static void main(String[] args) {
		ControleSalarial controle = new ControleSalarial();
		
		Funcionario3 f3 = new Funcionario3();
		f3.setSalario(1000);
		controle.setTotalSalarios(f3);
		System.out.println(controle.getTotalSalarios());
		
		Gerente3 g3 = new Gerente3();
		g3.setSalario(22000);
		controle.setTotalSalarios(g3);
		System.out.println(controle.getTotalSalarios());
	}
}