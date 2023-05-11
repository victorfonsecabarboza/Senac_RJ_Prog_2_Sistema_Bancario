package sistemabancario;

public class TesteConta4 {
	public static void main(String[] args) {
		Conta2 c2 = new Conta2();
		c2.nome = "Joao";
		
//		Conta2 c3 = new Conta2();
		Conta2 c3 = c2;
		c3.nome = "Maria";

		
		if (c2 == c3) {
			System.out.println("As contas sao iguais");
		} else {
			System.out.println("As contas sao diferentes");
		}













	}

}
