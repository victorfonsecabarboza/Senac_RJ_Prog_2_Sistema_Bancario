package sistemabancario;

public class TesteConta2 {
	public static void main(String[] args) {
		Conta2 c2; //declaração -> ponteiro
		c2 = new Conta2(); //instanciacao

		//		Conta2 c2 = new Conta2(); //declaracao e instanciacao na mesma linha

		//inicializacao
		c2.numero = 001;
		c2.nome = "Joao";
		c2.saldo = 100.0;
		c2.limite = 10.0;

		System.out.println("Numero da conta: "+c2.numero);
		System.out.println("Titular: "+c2.nome);
		System.out.println("Saldo da conta: "+c2.saldo);
		System.out.println("Limite da conta: "+c2.limite);

		int valorSaque = 150;

		boolean resultado = c2.sacar(valorSaque);

		if(resultado) {
			System.out.println("Voce sacou R$"+valorSaque+" e seu saldo atual eh R$"+c2.saldo);
		} else {
			System.out.println("Saque não efetuado, valor acima do possivel");
		}

		Conta2 c3 = new Conta2();

		//inicializacao
		c3.numero = 002;
		c3.nome = "Maria";
		c3.saldo = 100.0;
		c3.limite = 10.0;

		System.out.println("Numero da conta: "+c3.numero);
		System.out.println("Titular: "+c3.nome);
		System.out.println("Saldo da conta: "+c3.saldo);
		System.out.println("Limite da conta: "+c3.limite);

		int valorSaque2 = 110;

		boolean resultado2 = c3.sacar(valorSaque2);

		if(resultado2) {
			System.out.println("Voce sacou R$"+valorSaque2+" e seu saldo atual eh R$"+c3.saldo);
		} else {
			System.out.println("Saque não efetuado, valor acima do possivel");
		}

















	}

}
