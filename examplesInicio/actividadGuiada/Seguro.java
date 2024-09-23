package examplesInicio.actividadGuiada;

import java.util.Scanner;
@SuppressWarnings({ "resource" })

/**
 * Seguro
 */
public class Seguro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;
        int anosDeCarnet;
        int precio;
        System.out.println("Dime la edad que tienes: ");
        edad = sc.nextInt();
        System.out.println("Dime los años de carnet: ");
        anosDeCarnet = sc.nextInt();

        if(edad < 21){
            precio = 400; //300+100
        } else {
            if (anosDeCarnet <= 10) {
                precio = 300; // es el precio base
            } else {
                precio = 270; // 300 -30
            }

            System.out.println("Precio: " + precio);
            
                
            }
        }

    }