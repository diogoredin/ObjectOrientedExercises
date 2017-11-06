package exemplo.excepcao;

public class ArgumentoInvalidoException extends Exception {
	
	private String _mensagem;

	public ArgumentoInvalidoException(String mensagem) {
		_mensagem = mensagem;
	}

	public final String obtemMensagem(){
		return _mensagem;
	}
}
