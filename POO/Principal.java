package POO;

public class Principal {
    public static void main(String[] args) {
        Perro perro = new Perro("Bobby", "labrador", 5, 36);
        // perro.nombre = "Bobby";
        // perro.raza = "Labrador";

        perro.setEdad(5);

        perro.setTemperatura(36);
        // perro.fiebre = false; con setTemperatura conseguimos automatizar la variable fiebre


        if(perro.getFiebre()) {
            System.out.printf("1º vez %s tiene fiebre\n",perro.nombre);
        }
        System.out.printf("Tengo un %s llamado %s de %d años\n",
                perro.raza, perro.nombre,
                perro.getEdad());

                perro.setTemperatura(40);
        // perro.fiebre = false; con setTemperatura conseguimos automatizar la variable fiebre


        if(perro.getFiebre()) {
            System.out.printf("2º vez %s tiene fiebre\n",perro.nombre);
        }

        Perro perro1 = new Perro("lucky", "salchica",1,35);
        System.out.printf("Tengo un %s llamado %s de %d años\n",
                perro1.raza, perro1.nombre,
                perro1.getEdad());

        // Perro p2 = new Perro();
    }
}
