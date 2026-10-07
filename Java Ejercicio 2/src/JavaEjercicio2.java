import java.util.Scanner;

public class JavaEjercicio2 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("ESCRIBE TU NOMBRE COMPLETO: ");
        String nombre = teclado.nextLine();
        System.out.println("ESCRIBE TU EDAD: ");
        int edad = teclado.nextInt();

        System.out.println("Te llamas "+nombre);
        System.out.println("Tienes: "+edad+ " años");
        System.out.println("Pulsa enter para continuar...");


    }
}
