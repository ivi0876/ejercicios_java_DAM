package Arrays.arraysbidimisensionales;

public class array {
    public static void main(String[] args) {
        int[][] temp = new int[7][4];

        System.out.println("Nº filas: " + temp.length);
        System.out.println("Nº de columnas: " + temp[0].length);

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                temp[i][j] = (int) (Math.random() * 40 - 10);
            }
        }
    }
}
