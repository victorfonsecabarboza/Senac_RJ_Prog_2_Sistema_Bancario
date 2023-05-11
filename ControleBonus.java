package sistemabancario;

public class ControleBonus {
	private double totalBonus = 0;
	
	public void setTotalBonus(Funcionario3 funcionario) {
		this.totalBonus += funcionario.getBonus();
	}
	
	public double getTotalBonus() {
		return this.totalBonus;
	}

	public void setTotalBonus(Gerente3 g3) {
		// TODO Auto-generated method stub
		
	}

}
