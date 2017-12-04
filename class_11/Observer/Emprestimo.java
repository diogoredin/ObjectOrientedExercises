class Emprestimo {
    private String _prazo;
    private float _juro;

    public Loan(String prazo, float juro) {
        _prazo = prazo;
        _juro = juro;
    }

    public float obtemJuro() {
        return _juro;
    }

    public void alteraJuro(float juro) {
        _juro = juro;
        notifyObservers();
    }
}