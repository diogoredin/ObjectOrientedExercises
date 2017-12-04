public class JornalEconomia implements Observer {
    public void update(Subject sub) {
        System.out.println("Novo juro: " + ((Emprestimo)sub).obtemJuro());
    }
}