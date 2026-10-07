import java.util.Scanner;

public class JavaEjercicio4 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        final double PRECIO_BEBIDAS = 1.25;
        final double PRECIO_BOCADILLOS = 2.05;

        System.out.println("Cuantas bebidas quieres: ");
        int numero_bebidas = teclado.nextInt();

        System.out.println("Cuantos bocadillos quieres: ");
        int numero_bocadillos = teclado.nextInt();

        double coste_bebidas = PRECIO_BEBIDAS * numero_bebidas;
        double coste_bocadillos = PRECIO_BOCADILLOS * numero_bocadillos;
        double coste_total = coste_bebidas + coste_bocadillos;

        System.out.println("Coste de las bebidas: " +coste_bebidas);
        System.out.println("Coste de los bocadillos: " + coste_bocadillos);
        System.out.println("Coste consumicion: " + coste_total);
    }
}
