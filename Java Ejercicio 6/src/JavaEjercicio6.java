import java.util.Scanner;

public class JavaEjercicio6 {

    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);

        System.out.println("Valor de la compra(entre 0.00 y 500.00): ");
        double compra = lector.nextDouble(); // por consola el decimal es la , por codificacion el decimal es el .

        System.out.println("IVA: ");
        double iva = 1+lector.nextInt()/100.0; // 25/100.0 -> 1.25 para tener el iva guardado como porcentaje
        lector.close();

        double compra_sin_iva = compra / iva;
        double importe_iva = compra - compra_sin_iva;

        // printf (formateo) imprime una variable en mitad de un mensaje ->  %f -> decimales %s palabras %d -> enteros
        System.out.printf("Has pagado un total de %.2f de IVA sobre %.2f\n" ,importe_iva,compra); // .2 indica el numero de decimales que queremos redondear \n para el salto de linea
        System.out.printf("Has pagado un articulo de %.2f donde el precio real es de %.2f\n" ,compra,compra_sin_iva);
        // poner , en lugar de + para sustituir las variables en lugar de concatenarlas
    }
}
