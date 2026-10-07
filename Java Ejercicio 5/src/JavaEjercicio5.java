import java.util.Scanner;

public class JavaEjercicio5 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el numero de segundos a converir: ");
        int segundos = teclado.nextInt();

        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundos_restantes = segundos % 60;

        System.out.println("Horas: " +horas);
        System.out.println("Minutos: " +minutos);
        System.out.println("Segundos " +segundos_restantes);
    }
}
