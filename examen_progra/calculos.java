package examen_progra;

public class calculos {

    public static int calcular(int a, int b) {
        if(b > a) {
            int resultado = 1;
            for(int i = 0; i<b; i++) {
                resultado *=a;
            }
            return resultado;
        } else if (b < 0){
            return a / Math.abs(b);
            

        }
    }
    public static void main(String[] args) {
        
    }
}
