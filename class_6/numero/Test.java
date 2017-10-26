package numero;
import numero.*;

/**
 * Class which tests the Numero and NumeroComMemoria Class.
 *
 * @author Grupo 22
 * @version 1.0
 * @see <a href="https:/fenix.tecnico.ulsboa.pt/disciplinas/PO171795/2017-2018/1-semestre/aula-pratica-3">Exercise Paper</a>
 *
 */

public class Test {
  public static void main(String[] args) {
    NumeroComMemoria number = new NumeroComMemoria(5);
    number.set(10);
    System.out.println( number.toString() );
    number.undo();
    System.out.println( number.toString() );
    number.set(20);
    System.out.println( number.toString() );
    number.undo();
    System.out.println( number.toString() );
  }
}
