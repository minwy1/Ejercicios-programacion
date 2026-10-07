import java.util.Scanner;

public class JavaEjercicio7 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("introduce el radio de la circunferencia(valor entre 0 y 100): ");
        int radio = teclado.nextInt();

        double longitud_circunferencia = 2 * Math.PI * radio;
        double area_circulo = Math.PI * radio * radio;

        System.out.println("Longitud de la circunferencia: "+ longitud_circunferencia);
        System.out.println("Area del circulo : "+ area_circulo);

    }
}
