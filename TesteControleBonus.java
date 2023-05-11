package sistemabancario;

public class TesteControleBonus {
	public static void main(String[] args) {
		ControleBonus controle = new ControleBonus();
		
		Funcionario3 f3 = new Funcionario3();
		f3.setSalario(1000);
		controle.setTotalBonus(f3);
		System.out.println(controle.getTotalBonus());
		
		Gerente3 g3 = new Gerente3();
		g3.setSalario(10000);
		controle.setTotalBonus(g3);
		System.out.println(controle.getTotalBonus());
		
	}
	
	
	

}
