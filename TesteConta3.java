package sistemabancario;

public class TesteConta3 {
	public static void main(String[] args) {
		Conta2 c2 = new Conta2();
		c2.limite = 100;
		
		Conta2 c3;
		c3 = c2;
		c3.limite = 200;
		
		int i = 100;

		System.out.println("Limite de c2: "+c2.limite);
		
		System.out.println("Limite de c3: "+c3.limite);













	}

}
