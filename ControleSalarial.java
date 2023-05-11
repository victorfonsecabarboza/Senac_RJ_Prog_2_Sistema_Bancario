package sistemabancario;

public class ControleSalarial {
	private double totalSalarios = 0;
	
	public void setTotalSalarios(Funcionario3 funcionario3) {
		this.totalSalarios += funcionario3.getSalario();
	}
	
	public double getTotalSalarios() {
		return this.totalSalarios;
	}

	public void setTotalSalarios(Gerente3 g3) {
		// TODO Auto-generated method stub
		
	}
	
}
