public class PagamentoCartaoCredito implements FormaPagamento {
    private String _none;
    private String _numeroCartao;
    private String _cvv;
    private String _dataExpiracao;

    public PagamentoCartaoCredito(String titular, String numCC, String cvv, String data){
        _nome = titular;
        _numeroCartao = numCC;
        _cvv = cvv;
        _dataExpiracao = data;
    }

    @Override
    public void realizaPagamento(int quantia) {
        System.out.println("Realiza pagamento via cartão de crédito de " + quantia);
    }
}