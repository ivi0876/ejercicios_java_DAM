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
            

        } else {
            if(a < 10) {
                return (int) (Math.random()*11) +10;
            } else {
                return (int) (Math.random() * (a -10 +1)) +10;
            }
        }
    }
    public static void main(String[] args) {
        int mostrar = calcular(2,2);
        System.out.println(mostrar);
    }
}
