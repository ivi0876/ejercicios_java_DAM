package Boletin2.ProjectFinal;
import java.util.Random;
import java.util.Scanner;

public class CarreraCaballos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Longitud de la pista
        final int LONGITUD_PISTA = 30;
        
        // Array para almacenar las posiciones de los caballos
        int[] posiciones = {0, 0, 0, 0}; // 4 caballos
        
        // Pedir al usuario que seleccione un caballo entre 1 y 4
        System.out.print("Seleccione un caballo (1-4): ");
        int caballoUsuario = scanner.nextInt() - 1;  // Restamos 1 para trabajar con índice de array
        
        // Verificar entrada válida
        while (caballoUsuario < 0 || caballoUsuario >= 4) {
            System.out.print("Error, seleccione un caballo válido (1-4): ");
            caballoUsuario = scanner.nextInt() - 1;
        }
        
        // Inicia la carrera
        boolean carreraTerminada = false;
        while (!carreraTerminada) {
            // Limpiar la pantalla
            System.out.print("\n".repeat(20)); 
            
            // Avanzar caballos
            for (int i = 0; i < 4; i++) {
                // Cada caballo avanza entre 1 y 3 posiciones
                int avance = random.nextInt(3) + 1; 
                posiciones[i] += avance;
                
                // Mostrar el estado actual de la carrera
                System.out.println("Caballo " + (i + 1) + ": " + "-".repeat(posiciones[i]));
            }
            
            // Comprobar si algún caballo ha llegado al final
            for (int i = 0; i < 4; i++) {
                if (posiciones[i] >= LONGITUD_PISTA) {
                    carreraTerminada = true;
                    System.out.println("\n¡El caballo " + (i + 1) + " ha ganado la carrera!");
                    
                    if (i == caballoUsuario) {
                        System.out.println("¡Felicidades! Tu caballo ha ganado.");
                    } else {
                        System.out.println("Lo siento, tu caballo no ha ganado.");
                    }
                    break;
                }
            }
            
            // Pausa antes del siguiente "turno"
            try {
                Thread.sleep(500); // Espera de 500ms para simular el avance
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        scanner.close();
    }
}
