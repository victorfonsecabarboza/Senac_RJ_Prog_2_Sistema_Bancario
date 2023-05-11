package sistemabancario;

public class TesteConta1 {
	public static void main(String[] args) {
		Conta1 c1; //declaração -> ponteiro
		c1 = new Conta1(); //instanciacao
		
//		Conta c1 = new Conta1(); //declaracao e instanciacao na mesma linha
		
		//inicializacao
		c1.numero = 001;
		c1.nome = "Joao";
		c1.saldo = 100.0;
		c1.limite = 10.0;
		
		System.out.println("Numero da conta: "+c1.numero);
		System.out.println("Titular: "+c1.nome);
		System.out.println("Saldo da conta: "+c1.saldo);
		System.out.println("Limite da conta: "+c1.limite);
		
		c1.sacar(10);
		System.out.println("Novo saldo: "+c1.saldo);
		
		c1.depositar(1000);
		System.out.println("Novo saldo: "+c1.saldo);
		
		c1.sacar(5000);
		System.out.println("Novo saldo: "+c1.saldo);
		
		
		
		
		
	}

}
