package sistemabancario;

public class Funcionario1 {
	String nome;
	String cpf;
	String departamento;
	String dataAdmissao;
	double salario;
	String status;
	
	void bonificacao(double bonus) {
		salario += bonus;
	}

	double getBonus() {
		// TODO Auto-generated method stub
		return 0;
	}

}
