package models;

import domains.Operaciones;

public class Multiplicar extends Operaciones {

    public Multiplicar(float num1, float num2) {
        super(num1, num2);
    }

    @Override
    protected void operar() {
        super.resultado = super.num1 * super.num2;
    }
}
