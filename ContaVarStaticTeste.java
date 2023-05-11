package sistemabancario;

public class ContaVarStaticTeste {
	public static void main(String[] args) {
		ContaVarStatic c1 = new ContaVarStatic("Clayton", "123456");
//		System.out.println(c1.cliente.nome);
//		System.out.println(c1.cliente.cpf);
		//System.out.println(c1.contadorDeContas); NAO FUNCIONA :-(
		int contador = c1.getContadorContas();
		System.out.println(contador);
		
		ContaVarStatic c2 = new ContaVarStatic("Maria", "654321");
//		System.out.println(c2.cliente.nome);
//		System.out.println(c2.cliente.cpf);
		//System.out.println(c2.contadorDeContas); NAO FUNCIONA :-(
		int contador2 = c2.getContadorContas();
		System.out.println(contador2);
		
		int contador22 = ContaVarStatic.getContadorContas2();
		System.out.println(contador22);
		
		System.out.println(Math.round(5.5));
	}
}