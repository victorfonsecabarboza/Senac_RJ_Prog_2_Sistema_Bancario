package sistemabancario;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario1 f1 = new Funcionario1();
		f1.nome = "Leonardo";
		f1.salario = 5000.0;
		f1.status = "ativo";
		System.out.println(f1.salario);
		f1.bonificacao(1000);
		System.out.println(f1.salario);
		
	}

}
