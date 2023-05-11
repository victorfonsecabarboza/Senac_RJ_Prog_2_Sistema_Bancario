package sistemabancario;

public class TesteContaCliente3Constrututor {
	public static void main(String[] args) {
		ContaCliente3Construtor cc2 = new ContaCliente3Construtor("Leonardo", "111.111.111-11");
//		Cliente cliente1 = new Cliente();
//		cc1.cliente = cliente1;
		cc2.cliente.nome = "Joao";
		System.out.println(cc2.cliente.nome);
	}

}
