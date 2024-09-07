package models;

import domains.Operaciones;

public class Dividir extends Operaciones {

    public Dividir(float num1, float num2) {
        super(num1, num2);
    }

    @Override
    protected void operar() {
        super.resultado = super.num1 / super.num2;
    }
}
