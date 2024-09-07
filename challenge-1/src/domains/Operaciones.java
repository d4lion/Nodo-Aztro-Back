package domains;

public abstract class Operaciones {
    protected float resultado;
    protected final float num1;
    protected final float num2;


    // Despues de pedirce los datos se van a operar para obtener el resultado
    protected abstract void operar();

    /**
    * Al instanciarse la clase se le pasan los dos numeros a operar
    * tras esto se llama al metodo operar que se encarga de realizar la operacion
     * @param num1 float
     * @param num2 float
    * */

    public Operaciones(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
        operar();
    }

    public void getResultado() {
        System.out.println("El resultado es: " + resultado);
    }
}
