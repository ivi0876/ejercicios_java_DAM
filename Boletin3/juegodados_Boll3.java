package Boletin3;
import java.io.PrintWriter;
import java.util.Scanner;


// este es usar funciones basicos

public class juegodados_Boll3 {
    /**
     * Genera un número del 1 al numero de caras indicado por el usuario
     * 
     * @param numeroCarasDado Numero de caras del dado
     * @return un numero aleatorio entre 1 y el numero máximo de caras
     */
    public static int tirarDado(int numeroCarasDado) {
        return (int) Math.ceil(Math.random() * numeroCarasDado);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String userName;
        int numeroCarasDado;
        int userNumber;
        String volverJugar;
        
        System.out.print("\n Introduce tu nombre: ");
        userName = sc.nextLine();

        do {
            int contadorNumerosAcertados = 0; // Reinicia el contador en cada partida

            // Pide al usuario el número de caras del dado
            do {
                System.out.print("Introduce el número de caras del dado: ");
                numeroCarasDado = sc.nextInt();
            } while (numeroCarasDado < 1);

            // Tira los dados
            int dado1 = tirarDado(numeroCarasDado);
            int dado2 = tirarDado(numeroCarasDado);

            // Bucle de intentos
            for (int i = 0; i < 3; i++) {
                do {
                    System.out.printf("Introduce un número del 1 al %d: ", numeroCarasDado);
                    userNumber = sc.nextInt();
                } while ((userNumber > numeroCarasDado) || (userNumber < 1));
                
                if (userNumber == dado1 || userNumber == dado2) {
                    contadorNumerosAcertados++;
                }
            }

            System.out.printf("%s has acertado %d números \n", userName, contadorNumerosAcertados);

            // Escribe el resultado en el archivo
            PrintWriter fwriter = new PrintWriter("Records.txt");
            fwriter.printf("Nombre: %s, Numero Caras Dado: %d, Numero Aciertos: %d\n", userName, numeroCarasDado, contadorNumerosAcertados);
            fwriter.close();

            // Pregunta si quiere volver a jugar
            System.out.println("¿Quieres volver a jugar? (S/N)");
            sc.nextLine();
            volverJugar = sc.nextLine().toUpperCase();

        } while (volverJugar.equals("S"));

        sc.close();
    }
}
