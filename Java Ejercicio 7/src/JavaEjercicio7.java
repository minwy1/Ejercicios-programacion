import java.util.Scanner;

public class JavaEjercicio7 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("introduce el radio de la circunferencia(valor entre 0 y 100): ");
        double radio = lector.nextDouble();
        lector.close();

        double area_circulo = Math.PI * Math.pow(radio,2); // usamos la libreria de java Math para el valor de PI y para la operacion de elevar al cuadrado
        double longitud_circunferencia = 2 * Math.PI * radio;

        System.out.println("Longitud de la circunferencia: "+ longitud_circunferencia);
        System.out.println("Area del circulo : "+ area_circulo);

    }
}
