import java.util.Scanner;

public class JavaEjercicio3 {

    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduzca el primer numero entero: ");
        int operando1 = lector.nextInt();

        System.out.println("Introduzca el segundo numero entero: ");
        int operando2 = lector.nextInt();
        lector.close();

        int suma = operando1 + operando2;
        int resta = operando1 - operando2;
        int multiplicacion = operando1 * operando2;
        int division = operando1 / operando2;
        int modulo = operando1 % operando2;
        double divisionReal = (double) operando1 / operando2;
        double moduloReal = operando1 % operando2;

        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicacion: "+multiplicacion);
        System.out.println("Division entera: "+division);
        System.out.println("Resto: "+modulo);
        System.out.println("Division real: "+divisionReal);
        System.out.println("Resto real: "+moduloReal);


    }
}
