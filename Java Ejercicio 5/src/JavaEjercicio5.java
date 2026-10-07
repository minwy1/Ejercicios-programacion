import java.util.Scanner;

public class JavaEjercicio5 {
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce el numero de segundos a converir: ");
        int segundos = lector.nextInt(); //34567
        lector.close();
        // 1 hora -> 3600 segundos
        // 1 hora -> 60 minutos
        // 1 minuto -> 60 segundos

        int horas = segundos / 3600; // 9,601 horas
        int minutos = (segundos % 3600) / 60; //0,601 entre 60 -> 36,11 minutos
        int segundos_restantes = segundos % 60;

        System.out.println("Horas: " +horas);
        System.out.println("Minutos: " +minutos);
        System.out.println("Segundos " +segundos_restantes);
    }
}
