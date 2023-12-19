package ejercicio9;

import entidades.Matematica;

public class Ejercicio9 {

    public static void main(String[] args) {
        Matematica m = new Matematica();
        m.setNum1(Math.random() * 10);
        m.setNum2(Math.random() * 10);
        System.out.println(m.getNum1());
        System.out.println(m.getNum2());
        
        m.calcularRaiz();
//        m.devolverMayor();
//        m.calcularPotencia();
    }

}
