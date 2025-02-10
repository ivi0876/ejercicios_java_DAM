package ejerciciotres;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Cadena y asignarle un valor
        Cadena c = new Cadena();
        c.setCadena("hola mundo");
        System.out.println("Cadena: " + c.toString());

        // Comparación con un String
        System.out.println("¿Es igual a 'hola mundo'? " + c.equals("hola mundo"));

        // Comparacion con otro objeto Cadena
        Cadena otraCadena = new Cadena();
        otraCadena.setCadena("hola mundo");
        System.out.println("¿Es igual a otro Cadena con 'hola mundo'? " + c.equals(otraCadena));

        // Comparación con un array de caracteres
        char[] array = {'h', 'o', 'l', 'a', ' ', 'm', 'u', 'n', 'd', 'o'};
        System.out.println("Es igual a un array de char? " + c.equals(array));
 
        // Prueba del método eliminar(char)
        System.out.println("Eliminando 'o'... Eliminados: " + c.eliminar('o'));
        System.out.println("Cadena después de eliminar: " + c.toString());
    }
}
