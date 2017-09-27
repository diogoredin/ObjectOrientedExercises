public class Livro {

	private String titulo;
	private String texto;

/* Construtores */

	public Livro () {
		titulo = null;
		texto = null;
	}

	public Livro (String ttl, String txt) {
		setTitulo(ttl); 
		setTexto(txt);
	}

	public void setTitulo (String newttl) {
		titulo = newttl;
	}

/* private - can't change text in a created book */

	private void setTexto (String newtxt) {
		texto = newtxt;
	}

	public String getTitulo () {
		return titulo;
	}

	public String getTexto () {
		return texto;
	}

	public int getTamanho () {

		return getTitulo().length() + getTexto().length();
	}

	public boolean equals (Object other) {

		if (other instanceof Livro == false) {
			return false;
		}

		return (this.titulo.equals(((Livro)other).titulo) && (this.texto.equals(((Livro)other).texto)));
	}
}