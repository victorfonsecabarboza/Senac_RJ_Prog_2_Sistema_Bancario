package sistemabancario;

public class ControleVerificacaoInterna {
	void validaCredenciais(FuncionarioComSenhaAbs funcionarioComSenhaAbs) {
		funcionarioComSenhaAbs.verifica(funcionarioComSenhaAbs.senha);
	}
}
