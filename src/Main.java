import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido a la inmersion en Java");
        //System.out.println("Pelicula Matrix");

        //declaracion de varibles
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor pelicula del fin de milenio
                """;
        double mediaEvaluacionUsuario = 0;

        System.out.println("Pelicula" + nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvaluaciones = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la evaluacion de Matrix: " + mediaEvaluaciones);

        if (fechaDeLanzamiento > 2023) {
            System.out.println("pelicula popular en el momento");
        } else {
            System.out.println("esta es una pelicula retro");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("ingresa la calificacion que le darias a Matrix");
            double calificacionMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + calificacionMatrix;
        }
        System.out.println("La media de la pelicula" +
                "Matrix calculada por el usuario es: " + mediaEvaluacionUsuario /3);
    }
}