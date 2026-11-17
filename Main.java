
public class Main {

    public static void main(String[] args) {
       
        Alumno alumno1 = new Alumno("Juan", 20, 7.5);
        Alumno alumno2 = new Alumno("María", 16, 4.0);

        // Mostrar alumno 1
        System.out.println("ALUMNO 1");
        System.out.println(alumno1);

        System.out.println("¿Está aprobado? "
                + alumno1.estaAprobado());

        System.out.println("¿Es mayor de edad? "
                + alumno1.esMayorDeEdad());

        // Subir nota
        alumno1.subirNota(1.0);

        System.out.println("Nota después de subir: "
                + alumno1.getNota());

        System.out.println();

        // Mostrar alumno 2
        System.out.println("ALUMNO 2");
        System.out.println(alumno2);

        System.out.println("¿Está aprobado? "
                + alumno2.estaAprobado());

        System.out.println("¿Es mayor de edad? "
                + alumno2.esMayorDeEdad());

        // Subir nota
        alumno2.subirNota(2.0);

        System.out.println("Nota después de subir: "
                + alumno2.getNota());
    
    }
}
