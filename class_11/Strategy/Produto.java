public class Produto {
    private int _preco;
    private String _descricao;

    public Produto(int p, String desc) {
        _preco = p;
        _descricao = desc;
    }

    public int obtemPreco() {
        return _preco;
    }

    public String obtemDescricao() {
        return _descricao;
    }
}

public class CarrinhoCompras {
    private List<Produto> _carrinho;

    public CarrinhoCompras() {
        _carrinho = new ArrayList<>():
    }

    public adiciona(Produto p) {
        _carrinho.add(p):
    }

    public remove(Produto p) {
        _carrinho.remove(p):
    }
    
    public void paga(FormaPagamento pagamento) {
        // Changed!!! to work
        int total = 0;

        for (Produto p : _carrinho)
            total += p.obtemPreco();

        pagamento.realizaPagamento(total);
    }
}