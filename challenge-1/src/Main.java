import models.Sumar;
import models.Restar;
import models.Multiplicar;
import models.Dividir;



public class Main {
    public static void main(String[] args) {
        Sumar sumar = new Sumar(5, 3);
        Restar restar = new Restar(5, 3);
        Multiplicar multiplicar = new Multiplicar(5, 3);
        Dividir dividir = new Dividir(5, 3);

        sumar.getResultado();
        restar.getResultado();
        multiplicar.getResultado();
        dividir.getResultado();
    }
}
