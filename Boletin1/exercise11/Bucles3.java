package Boletin1.exercise11;

public class Bucles3 {
    public static void main(String[] args) {
        // ?PREGUNTAR SI PUEDO PONER VARIABLE GENERAL PARA
        int acu = 0;
        int cont = 1;
        //Primer bucle uso for porque necesitamos mostrar la evolucion
        System.out.println("Usar el bucle for: ");
        for (cont = 1; cont <= 20; cont ++) {
            acu += acu + cont; // !PREGUNTAR SI ESTO ES EQUIVALENTE A: acu=acu+c
            System.out.println("Contador: " + cont + ", acumulador: " + acu);
        }

        // Segundo bucle usando while porque solo hay que mostrar el final
        System.out.println("Usando bucle while: ");
        while (cont <=20) {
            acu += cont;
            cont ++;
        }
        System.out.println("El final: " + acu);

        // tercer bucle usando do while
        System.out.println("Usando bucle do while: ");
        do{
            acu += cont;
            cont ++;
        } while (cont <= 20);
        System.out.println("El final: " + acu);
    }
}

//! PREGUNTAR PORQUE LOS RESULTADOS NO SON IGUALES
