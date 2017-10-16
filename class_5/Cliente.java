public class Cliente extends Object {

    private String _name;
    private Loja _loja;

    public Cliente( String name, Loja loja ) {
        _name = name;
        _loja = loja;
	}

    public void consultaCatalogo() {
        System.out.println("Catalogo de Vendas");
	}

    public void reclama() {
        System.out.println("Estou a reclamar");
        _loja.registaReclamacao();
	}

    public void compraProduto( Double val ) {
        _loja.registaVenda(val);
	}

    public String obtemNome() {
        return _name;
	}

}

class ClienteVip extends Cliente {
    private int _pontos;

    public ClienteVip( String name, Loja loja ) {
        super(name, loja);
        _pontos = 0;
	}

    public int obtemPontos() {
        return _pontos;
	}

    public void consultaCatalogo() {
        super.consultaCatalogo();
        System.out.println("Lista de Promocoes");
	}

    public void compraProduto( Double val ) {
        super.compraProduto(val*0.9);
        if ( val*0.9 > 10 ) {
            _pontos++;
        }
	}

}