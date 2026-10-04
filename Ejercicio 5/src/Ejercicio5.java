public class Ejercicio5 {
    public static void main(String[] args) {
        final String APP = ("Mi app");
        String version = ("1.0.0");
        final double PI = (3.14159);
        String usuario = ("Laura");
        int nivel = (1);
        int puntuacion = (0);

        System.out.println("Aplicacion: "+APP);
        System.out.println("Version: "+version);
        System.out.println("Valor de PI: "+PI);
        System.out.println("Usuario actual: "+usuario);
        System.out.println("Nivel: "+nivel);
        System.out.println("Puntuacion: "+puntuacion);

        usuario = ("Miguel");
        nivel = (2);
        puntuacion = (150);

        System.out.println("Usuario actualizado: "+usuario);
        System.out.println("Nivel actualizado: "+nivel);
        System.out.println("Puntuacion actualizada: "+puntuacion);
    }
}
