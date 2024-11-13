package examen_progra;

public class Piramide {
    public static void piramide() {
        for (int i = 10; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.printf("%2d",j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        piramide();
    }
}
