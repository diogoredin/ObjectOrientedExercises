package exemplo;

import exemplo.excepcao.ArgumentoInvalidoException;

public class Exemplo {

	public void fazAlgo(Object arg) {
		if (arg == null)
			throw new ArgumentoInvalidoException("Argumento Ã© nulo");

		System.out.println("Fiz algo " + arg.toString());
	}

	public static void main(String[] args) {

		try {
			Exemplo e = new Exemplo();

			e.fazAlgo("sem problemas");

			e.fazAlgo(null);
		} catch(Exception e) {
			System.out.println("Apanhei uma excepcao " + e.getClass().getName());
		} catch(ArgumentoInvalidoException e) {
			System.out.println("Apanhei a excepcao Argumento invalido. Razao: " + e.obtemMensagem());
		}
	}
}