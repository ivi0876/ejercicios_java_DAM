package Arrays.actividadValidar;

public class Ejercicio {
    public static void main(String[] args) {
        // Declara e inicializa una variable de tipo String
        String frase = "Jar-Jar is the Big Boss";

        //Muestra la longitud de la cadena
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Longitud de la cadena: " + frase.length());

        // Muestra el primer carácter y el último
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Primer carácter: " + frase.charAt(0));
        System.out.println("Último carácter: " + frase.charAt(frase.length() - 1));

        //Crea una segunda cadena en mayúsculas y compara con equals y equalsIgnoreCase
        String fraseMayus = frase.toUpperCase();
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Cadena en mayúsculas: " + fraseMayus);
        System.out.println("Comparación con equals: " + frase.equals(fraseMayus));
        System.out.println("Comparación con equalsIgnoreCase: " + frase.equalsIgnoreCase(fraseMayus));

        // Muestra la cadena en minúsculas
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Cadena en minúsculas: " + frase.toLowerCase());

        // Comprueba si la cadena acaba por "Boss" y por "Jar"
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("¿Termina con 'Boss'?: " + frase.endsWith("Boss"));
        System.out.println("¿Termina con 'Jar'?: " + frase.endsWith("Jar"));

        // Muestra la posición de la primera y última vez que aparece "Jar"
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Primera aparición de 'Jar': " + frase.indexOf("Jar"));
        System.out.println("Última aparición de 'Jar': " + frase.lastIndexOf("Jar"));

        // Crea otra variable String a partir del fragmento de la cadena (posición 7 a 14)
        System.out.println("------------------------------------------------------------------------------------------");
        String fragmento = frase.substring(7, 15);
        System.out.println("Fragmento de la cadena (posición 7 a 14): " + fragmento);

        // Quita los espacios de los extremos del fragmento y muéstralo
        System.out.println("------------------------------------------------------------------------------------------");
        String fragmentoSinEspacios = fragmento.trim();
        System.out.println("Fragmento sin espacios: " + fragmentoSinEspacios);

        // Crea un array de Strings con las palabras de la primera cadena
        System.out.println("------------------------------------------------------------------------------------------");
        String[] palabras = frase.split("[ -]");
        System.out.println("Array de palabras:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        //Muestra cada palabra del array anterior en una línea ocupando 3 caracteres
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Palabras formateadas:");
        for (String palabra : palabras) {
            if (palabra.length() > 3) {
                System.out.println(palabra.substring(0, 3));
            } else {
                System.out.println(palabra);
            }
        }
    }
}
