import java.util.Scanner;

public class JavaEjercicio6 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Valor de la compra(entre 0.00 y 500.00): ");
        double compra = teclado.nextDouble();

        System.out.println("IVA: ");
        double iva = teclado.nextDouble();

        double compra_sin_iva = compra / (1 + iva / 100 );
        double importe_iva = compra - compra_sin_iva;

        System.out.println("Compra: "+compra_sin_iva);
        System.out.println("IVA: "+importe_iva);
        System.out.println("Total: "+compra);
    }
}
