package models;

import domains.Operaciones;

public class Sumar extends Operaciones {

    @Override
    protected void operar() {
        super.resultado = super.num1 + super.num2;
    }

    public Sumar(float num1, float num2) {
        super(num1, num2);
    }
}
