package POO.Juego_Ejercicio7;

//import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Escenario {
    private int ancho;
    private int alto;
    private char[][] terreno; // 'F' = Fango, 'C' = Campo, 'M' = Montaña
    private Guerrero guerrero;
    
    private Orco orco;

    public Escenario(String archivoTerreno, Guerrero guerrero, Orco orco) {
        this.guerrero = guerrero;
        this.orco = orco;
        cargarTerrenoDesdeArchivo(archivoTerreno);
    }

    private void cargarTerrenoDesdeArchivo(String archivoTerreno) {
        try (Scanner sc = new Scanner(new File(archivoTerreno))) {
            // Leer las dimensiones del mapa
            this.ancho = sc.nextInt();
            this.alto = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea

            this.terreno = new char[ancho][alto];

            // Leer cada línea del archivo
            for (int i = 0; i < alto; i++) {
                String linea = sc.nextLine();
                for (int j = 0; j < ancho; j++) {
                    terreno[j][i] = linea.charAt(j); // Leer cada carácter de la línea
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + archivoTerreno);
        } catch (Exception e) {
            System.err.println("Error al cargar el terreno: " + e.getMessage());
        }
    }

    public char getTerreno(int x, int y) {
        if (x >= 0 && x < ancho && y >= 0 && y < alto) {
            return terreno[x][y];
        }
        return ' ';
    }


    public void mostrarTablero() {
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                if (guerrero.getPosicion().getX() == j && guerrero.getPosicion().getY() == i) {
                    System.out.print("G "); // Mostrar guerrero
                } else if (orco.getPosicion().getX() == j && orco.getPosicion().getY() == i) {
                    System.out.print("O "); // Mostrar orco
                } else {
                    System.out.print(terreno[j][i] + " "); // Mostrar terreno
                }
            }
            System.out.println();
        }
    }


    // private void generarTerreno() {
    //     char[] tiposTerreno = {'F', 'C', 'M'};
    //     Random random = new Random();
    //     for (int i = 0; i < ancho; i++) {
    //         for (int j = 0; j < alto; j++) {
    //             terreno[i][j] = tiposTerreno[random.nextInt(tiposTerreno.length)];
    //         }
    //     }
    // }


    public boolean cambiarTerreno() {
        
        System.out.println("El cambio de terreno ahora debe realizarse manualmente desde el archivo.");
        return false;
    }

    public int recuperacionTerreno(int x, int y) {
        char tipoTerreno = getTerreno(x, y);
        switch (tipoTerreno) {
            case 'F': return 30; // Fango: Recupera 30 energía
            case 'C': return 50; // Campo: Recupera 50 energía
            case 'M': return 40; // Montaña: Recupera 40 energía
            default: return 0; // Si no hay terreno válido
        }
    }
}
