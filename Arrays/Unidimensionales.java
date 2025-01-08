package Arrays;

public class Unidimensionales {

    public static void main(String[] args) {
        double[]  temperaturas = new double[4];
       // char[] letras = {'a', 'b', 'c', 'd'}; // unica excepcion que puedo meter los caracteres en la misma linea sin tener que poner NEW

        // temperaturas[0] = 7.5;
        // temperaturas[1] = 3.2;
        // temperaturas[2] = 1.3;
        // temperaturas[3] = 10;

        // Rellena un array con valores aleatorios
        for (int i = 0; i < temperaturas.length; i++){
            temperaturas[i]=Math.random()*50-25;
        }

        System.out.println("Tamaño: " + temperaturas.length);




       // for(int i = 0; i<= temperaturas.length-1 ;i++)  misma forma pero se usa mas la segunda
        for(int i = 0; i< temperaturas.length ;i++) { // lenght me da el tamaño del array

            System.out.printf("Indice:%2d valor:%7.2fºC\n", i, temperaturas[i]);
          //  System.out.printf("Indice:[%d] = %7.2fºC\n", i, temperaturas[i]); misma forma pero diferente formato
        }
        
    }
}   