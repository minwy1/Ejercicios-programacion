import java.util.Scanner;

public class JavaEjercicio3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el primer numero entero: ");
        int operando1 = teclado.nextInt();

        System.out.println("Introduzca el segundo numero entero: ");
        int operando2 = teclado.nextInt();

        System.out.println("Suma: "+(operando1 + operando2));
        System.out.println("Resta: "+(operando1 - operando2));
        System.out.println("Multiplicacion: "+(operando1 * operando2));
        System.out.println("Division entera: "+(operando1 / operando2));
        System.out.println("Resto: "+(operando1 % operando2));
        System.out.println("Division real: "+((double)operando1 / operando2));
        System.out.println("Resto real: "+((double)operando1 % operando2));
    }
}
