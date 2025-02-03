package Arrays.Boletin1.exercise4;

public class StringUtils {

    // a) Muestra cada letra de una cadena en una línea distinta
    public static void muestraEnLinea(String cadena) {
        if (cadena != null) {
            for (int i = 0; i < cadena.length(); i++) {
                System.out.println(cadena.charAt(i));
            }
        }
    }

    // b) Devuelve un fragmento de la cadena
    public static String subCadena(String cadena, int inicio, int cantidad) {
        if (cadena == null || inicio < 0 || inicio >= cadena.length() || cantidad < 0) {
            return "";
        }
        int fin = Math.min(inicio + cantidad, cadena.length());
        String resultado = "";
        for (int i = inicio; i < fin; i++) {
            resultado += cadena.charAt(i);
        }
        return resultado;
    }

    // c) Muestra un string centrado en la consola (80 caracteres de ancho)
    public static void muestraCentrado(String cadena) {
        if (cadena == null) {
            cadena = "";
        }
        int anchoConsola = 80;
        int longitud = cadena.length();
        int espacios = (anchoConsola - longitud) / 2;

        String espacio = "";
        for (int i = 0; i < espacios; i++) {
            espacio += " ";
        }

        System.out.println(espacio + cadena);
    }

    // d) Convierte una cadena en un vector de char
    public static char[] cadenaAVector(String cadena) {
        if (cadena == null) {
            return new char[0];
        }
        char[] vector = new char[cadena.length()];
        for (int i = 0; i < cadena.length(); i++) {
            vector[i] = cadena.charAt(i);
        }
        return vector;
    }

    // e) Devuelve la frase en orden inverso
    public static String alReves(String frase) {
        if (frase == null) {
            return "";
        }
        String resultado = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            resultado += frase.charAt(i);
        }
        return resultado;
    }

    // f) Convierte cadenas a mayúsculas y reemplaza guiones bajos por espacios
    public static String pasoAMayusculas(String... cadenas) {
        String resultado = "";
        for (String cadena : cadenas) {
            if (cadena != null) {
                for (int i = 0; i < cadena.length(); i++) {
                    char c = cadena.charAt(i);
                    if (c == '_') {
                        resultado += " ";
                    } else if (c >= 'a' && c <= 'z') {
                        resultado += (char) (c - ('a' - 'A'));
                    } else {
                        resultado += c;
                    }
                }
                resultado += " ";
            }
        }
        return resultado.trim();
    }

    public static void main(String[] args) {
        // Pruebas
        System.out.println("Ejemplo de muestraEnLinea:");
        muestraEnLinea("Hola");

        System.out.println("\nEjemplo de subCadena:");
        System.out.println(subCadena("Ejemplo", 2, 4));

        System.out.println("\nEjemplo de muestraCentrado:");
        muestraCentrado("Texto centrado");

        System.out.println("\nEjemplo de cadenaAVector:");
        char[] vector = cadenaAVector("Vector");
        for (char c : vector) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nEjemplo de alReves:");
        System.out.println(alReves("Invertido"));

        System.out.println("\nEjemplo de pasoAMayusculas:");
        System.out.println(pasoAMayusculas("hola_mundo", "java_programacion"));
    }
}

