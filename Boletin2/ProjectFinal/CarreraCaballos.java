package Boletin2.ProjectFinal;

import java.util.Random;
import java.util.Scanner;

public class CarreraCaballos {
    
    // Variables globales
    static int playerBalance = 100;  // Saldo inicial del jugador
    static String[] horses = {"Caballo 1", "Caballo 2", "Caballo 3", "Caballo 4"};
    static int chosenHorse = -1;
    static int betAmount = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        boolean exit = false;
        
        while (!exit) {
            showMainMenu();
            option = sc.nextInt();
            
            switch (option) {
                case 1:
                    showRules();
                    break;
                case 2:
                    makeBet(sc);
                    break;
                case 3:
                    if (chosenHorse == -1 || betAmount == 0) {
                        System.out.println("Primero debes hacer una apuesta.");
                    } else {
                        startRace();
                    }
                    break;
                case 4:
                    showBalance();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
    
    // Mostrar el menú principal
    public static void showMainMenu() {
        System.out.println("\n========================");
        System.out.println("=== CARRERA DE CABALLOS ===");
        System.out.println("========================");
        System.out.println("1. Ver reglas");
        System.out.println("2. Hacer una apuesta");
        System.out.println("3. Iniciar carrera");
        System.out.println("4. Ver saldo");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
    }
    
    // Mostrar las reglas del juego
    public static void showRules() {
        System.out.println("\n=== REGLAS DEL JUEGO ===");
        System.out.println("1. Elige un caballo (1-4).");
        System.out.println("2. Apuesta una cantidad de dinero.");
        System.out.println("3. Los caballos avanzarán aleatoriamente.");
        System.out.println("4. Si tu caballo gana, duplicas tu apuesta.");
        System.out.println("5. Si pierdes, perderás la cantidad apostada.");
    }
    
    // Hacer una apuesta
    public static void makeBet(Scanner sc) {
        System.out.println("\n=== HACER UNA APUESTA ===");
        System.out.print("Selecciona tu caballo (1-4): ");
        chosenHorse = sc.nextInt() - 1;
        
        while (chosenHorse < 0 || chosenHorse >= horses.length) {
            System.out.print("Caballo no válido. Inténtalo de nuevo: ");
            chosenHorse = sc.nextInt() - 1;
        }
        
        System.out.print("¿Cuánto deseas apostar? (Saldo actual: " + playerBalance + "): ");
        betAmount = sc.nextInt();
        
        while (betAmount > playerBalance || betAmount <= 0) {
            System.out.print("Apuesta no válida. Ingresa una cantidad válida: ");
            betAmount = sc.nextInt();
        }
        
        System.out.println("Apuesta registrada: " + betAmount + " créditos en " + horses[chosenHorse] + ".");
    }
    
    // Iniciar la carrera de caballos
    public static void startRace() {
        System.out.println("\n=== INICIA LA CARRERA ===");
        int[] horsePositions = {0, 0, 0, 0};
        Random random = new Random();
        boolean raceOver = false;
        int winningHorse = -1;

        while (!raceOver) {
            for (int i = 0; i < horses.length; i++) {
                horsePositions[i] += random.nextInt(3) + 1;  // Cada caballo avanza entre 1 y 3 posiciones
                
                // Mostrar avance del caballo
                System.out.print(horses[i] + ": ");
                for (int j = 0; j < horsePositions[i]; j++) {
                    System.out.print("=");
                }
                System.out.println(">");
                
                // Verificar si algún caballo ganó
                if (horsePositions[i] >= 50) {
                    raceOver = true;
                    winningHorse = i;
                }
            }
            System.out.println("\n-------------------");
            try {
                Thread.sleep(1000);  // Pausa para hacer la carrera más emocionante
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("El caballo ganador es: " + horses[winningHorse] + "!");
        checkBetResult(winningHorse);
    }
    
    // Verificar si el jugador ganó o perdió la apuesta
    public static void checkBetResult(int winningHorse) {
        if (winningHorse == chosenHorse) {
            int winnings = betAmount * 2;
            playerBalance += winnings;
            System.out.println("¡Felicidades! Ganaste " + winnings + " créditos.");
        } else {
            playerBalance -= betAmount;
            System.out.println("Lo siento, perdiste " + betAmount + " créditos.");
        }
        
        // Resetear apuesta
        betAmount = 0;
        chosenHorse = -1;
    }
    
    // Mostrar el saldo del jugador
    public static void showBalance() {
        System.out.println("Tu saldo actual es: " + playerBalance + " créditos.");
    }
}
