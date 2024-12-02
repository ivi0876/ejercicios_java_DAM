package POO;

public class Principal {
    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.nombre = "Bobby";
        perro.raza = "Labrador";

        perro.setEdad(5);

        System.out.printf("Tengo un %s llamado %s de %d años\n",
                perro.raza, perro.nombre,
                perro.getEdad());
    }
}
