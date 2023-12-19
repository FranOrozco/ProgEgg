package entidades;

public class Matematica {

    private double num1;
    private double num2;

    public Matematica() {
    }

    public Matematica(double num1, double num2) {
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

    public void devolverMayor() {
        if (this.getNum1() > this.getNum2()) {
            System.out.println("El primer número es mayor al segundo.");
        } else if (this.getNum1() == this.getNum2()) {
            System.out.println("Los dos números son iguales.");
        } else {
            System.out.println("El segundo número es mayor al primero.");
        }
    }

    public void calcularPotencia() {
        double resultado = 0;
        if (this.getNum1() > this.getNum2()) {
            resultado = Math.pow(Math.round(this.getNum1()), Math.round(this.getNum2()));
        } else if (this.getNum2() > this.getNum1()) {
            resultado = Math.pow(Math.round(this.getNum2()), Math.round(this.getNum1()));
        }
        System.out.println("El resultado es: " + resultado);
    }

    public void calcularRaiz() {
        if (Math.abs(this.getNum1()) < Math.abs(this.getNum2())) {
            System.out.println("El primer número es el menor y su raíz es: "
                    + Math.sqrt(Math.abs(this.getNum1())));
        } else {
            System.out.println("El segundo número es el menor y su raíz es: "
                    + Math.sqrt(Math.abs(this.getNum2())));
        }

    }

}
