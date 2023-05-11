package sistemabancario;

public class TesteContaCliente2 {
	public static void main(String[] args) {
		ContaCliente2 cc2 = new ContaCliente2();
//		Cliente cliente1 = new Cliente();
//		cc1.cliente = cliente1;
		cc2.cliente.nome = "Joao";
		System.out.println(cc2.cliente.nome);
	}

}
