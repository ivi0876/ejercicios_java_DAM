package Boletin3.exercise3;

public class Bol3_Ejer3 {


    /**
     * @param year Año intrucido.
     * @return true si bisiesto, false si no lo es.
     */

     public static boolean bisiesto(int year) {
     return year %2 == 0;
    }

    public static void main(String[] args) {
        bisiesto(1980);
    }
}
