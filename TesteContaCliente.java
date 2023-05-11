package sistemabancario;

public class TesteContaCliente {
	public static void main(String[] args) {
		ContaCliente1 cc1 = new ContaCliente1();
		Cliente cliente1 = new Cliente();
		cc1.cliente = cliente1;
		cc1.cliente.nome = "Joao";
		System.out.println(cc1.cliente.nome);
	}

}
