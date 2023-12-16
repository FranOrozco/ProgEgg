package entidades;

public class Operacion {

    private double num1;
    private double num2;

    public Operacion() {
    }

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void crearOperacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void sumar(Operacion op) {
        double suma = op.getNum1() + op.getNum2();
        System.out.println("El resultado de la suma es: " + suma);
    }

    public void restar(Operacion op) {
        double resta = op.getNum1() - op.getNum2();
        System.out.println("El resultado de la resta es: " + resta);
    }

    public void multiplicar(Operacion op) {
        if (op.getNum1() * op.getNum2() != 0) {
            System.out.println("El resultado de la multiplicación es: " + op.getNum1() * op.getNum2());
        } else {
            System.out.println("Uno de los números era 0 entonces el resultado es 0. ");
        }
    }

    public void dividir(Operacion op) {
        if (op.getNum1() * op.getNum2() != 0) {
            System.out.println("El resultado de la división es: " + op.getNum1() / op.getNum2());
        } else if (op.getNum2() == 0) {
            System.out.println("Como el segundo número ingresado es 0, no se puede hacer la división. ");
        } else {
            System.out.println("El primer número ingresado es 0 entonces la división también es 0");
        }
    }

    @Override
    public String toString() {
        return "Operacion{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }

}
