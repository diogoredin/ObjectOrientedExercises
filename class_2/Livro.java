public class Livro {

	private String _title;
	private String _text;

	/* Returns a new book caracterized by it's title and text */
	public Livro( String title, String text ) {
		setTitle(title); 
		setText(text);
	}

	/* Defines a book title - publicly available */
	public void setTitle( String title ) {
		_title = title;
	}

	/* Defines a book text - private so you can't change text in a created book */
	private void setText( String text ) {
		_text = text;
	}

	public String getTitle() {
		return _title;
	}

	public String getText() {
		return _text;
	}

	public int getSize() {
		return getTitle().length() + getText().length();
	}

	public boolean equals( Object other ) {

		if ( other instanceof Livro == false ) return false;

		return ( this._title.equals( ( (Livro)other ).getTitle() ) && 
				 this._text.equals( ( (Livro)other ).getText() )
		);

	}

}