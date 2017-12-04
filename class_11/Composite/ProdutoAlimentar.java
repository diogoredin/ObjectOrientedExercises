public interface ProdutoAlimentar {
    int obtemPreco();
    String obtemDescricao();
}

public class Refeicao implements ProdutoAlimentar {
    private List<Ingrediente> _ingredientes;
    public Refeicao(List>Ingrediente> ing) {
        // ...
    }
    
    public int obtemPreco() {
        // ...
    }

    public String obtemDescricao() {
        // ...
    }
}