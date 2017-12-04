public class GrupoProdutoAlimentares implements ProdutoAlimentar {
    private List<ProdutoAlimentar> _produtos;

    public ConjuntoProdutos() {
        _produtos = new ArrayList<>();
    }
    
    public void add(ProdutoAlimentar p) {
        _produtos.add(p);
    }

    public int obtemPreco() {
        int preco = 0;

        for (ProdutoAlimentar p : _produtos)
            preco += p.obtemPreco();

        return p*0.9;
    }

    public String obtemDescricao() {
        String str = "";

        for (ProdutoAlimentar p : _produtos)
            str += p.obtemDescricao() + "\n";

        return str;
    }
}