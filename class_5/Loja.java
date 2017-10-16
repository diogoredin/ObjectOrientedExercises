public class Cliente extends Object {
    private String _name;
    private Loja _loja;

    public Cliente( String name, Loja loja ) {
        set(name, loja);
	}

    public void consultaCatalogo( String name, Loja loja ) {
	}

    public void reclama() {
        _loja.registaReclamacao();
	}

    public void compraProduto( Double val ) {
        _loja.registaVenda(val);
	}

    public String obtemNome() {
        return _title;
	}

    public void set( String name, Loja loja ) { 
        _name = name;
        _loja = loja;
    }
}

public class ClienteVip extends Cliente {
    private int _pontos;

    public ClienteVip( String name, Loja loja ) {
        super.set(name, loja);
	}

    public int obtemPontos() {
        return _pontos;
	}
}