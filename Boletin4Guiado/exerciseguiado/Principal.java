package Boletin4Guiado.exerciseguiado;
/**
 * Clase principal para probar el funcionamiento de la clase Pelota.
 */
public class Principal {

    /**
     * Método principal para ejecutar el programa.
     * 
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        // Crear un objeto de tipo Pelota
        Pelota pelota1 = new Pelota();
        
        // Asignar valores al objeto
        pelota1.tipo = "baloncesto";
        pelota1.setRadio(20);
        
        // Mostrar valores del objeto
        System.out.println("Pelota 1: Tipo: " + pelota1.tipo + ", Radio: " + pelota1.getRadio() + " cm");
        
        // Crear dos objetos adicionales con los nuevos constructores
        Pelota pelota2 = new Pelota(); // Constructor sin parámetros
        Pelota pelota3 = new Pelota("fútbol", 22); // Constructor con parámetros
        
        // Mostrar datos de los dos nuevos objetos
        System.out.println("Pelota 2: Tipo: " + pelota2.tipo + ", Radio: " + pelota2.getRadio() + " cm");
        System.out.println("Pelota 3: Tipo: " + pelota3.tipo + ", Radio: " + pelota3.getRadio() + " cm");
        
        // Inflar las pelotas
        pelota1.inflar(); // Incrementa en 1 cm
        pelota2.inflar(10); // Incrementa en 10 cm
        
        // Mostrar nuevamente los valores de los radios
        System.out.println("Después de inflar:");
        System.out.println("Pelota 1: Tipo: " + pelota1.tipo + ", Radio: " + pelota1.getRadio() + " cm");
        System.out.println("Pelota 2: Tipo: " + pelota2.tipo + ", Radio: " + pelota2.getRadio() + " cm");
        
        // Intercambiar los radios de las pelotas 1 y 2
        intercambiaRadios(pelota1, pelota2);
        
        // Mostrar los valores después del intercambio
        System.out.println("Después de intercambiar radios:");
        System.out.println("Pelota 1: Tipo: " + pelota1.tipo + ", Radio: " + pelota1.getRadio() + " cm");
        System.out.println("Pelota 2: Tipo: " + pelota2.tipo + ", Radio: " + pelota2.getRadio() + " cm");
    }

    /**
     * Intercambia los radios de dos objetos de tipo Pelota.
     * 
     * @param p1 La primera pelota.
     * @param p2 La segunda pelota.
     */
    public static void intercambiaRadios(Pelota p1, Pelota p2) {
        double temp = p1.getRadio();
        p1.setRadio(p2.getRadio());
        p2.setRadio(temp);
    }
}
