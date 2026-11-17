
public class Main {

    public static void main(String[] args) {
       
        Alumno alumno1 = new Alumno("Juan", 20, 7.5);
        Alumno alumno2 = new Alumno("María", 16, 4.0);

        // Mostrar alumno 1
        System.out.println("ALUMNO 1");
        System.out.println(alumno1);

        System.out.println("¿Está aprobado? " + alumno1.estaAprobado());

        System.out.println("¿Es mayor de edad? " + alumno1.esMayorDeEdad());

        // Subir nota
        alumno1.subirNota(1.0);

        System.out.println("Nota después de subir: " + alumno1.getNota());

        System.out.println();

        // Mostrar alumno 2
        System.out.println("ALUMNO 2");
        System.out.println(alumno2);

        System.out.println("¿Está aprobado? " + alumno2.estaAprobado());

        System.out.println("¿Es mayor de edad? " + alumno2.esMayorDeEdad());

        // Subir nota
        alumno2.subirNota(2.0);

        System.out.println("Nota después de subir: " + alumno2.getNota());

                // Crear alumnos
        Alumno alumno1 = new Alumno("Juan", 20, 8.5);
        Alumno alumno2 = new Alumno("Maria", 19, 6.5);
        Alumno alumno3 = new Alumno("Pedro", 16, 4.0);
        Alumno alumno4 = new Alumno("Lucia", 17, 9.0);
        Alumno alumno5 = new Alumno("Carlos", 22, 3.5);

        // Guardar los alumnos en un array
        Alumno[] alumnos = {
            alumno1, alumno2, alumno3, alumno4, alumno5
        };

        // Variables para calcular los resultados
        double sumaNotas = 0;
        double notaMaxima = alumnos[0].getNota();
        double notaMinima = alumnos[0].getNota();

        int aprobados = 0;
        int suspensos = 0;
        int mayoresEdad = 0;

        // Recorrer todos los alumnos
        for (int i = 0; i < alumnos.length; i++) {

            // Sumar las notas
            sumaNotas += alumnos[i].getNota();

            // Contar aprobados y suspensos
            if (alumnos[i].estaAprobado()) {
                aprobados++;
            } else {
                suspensos++;
            }

            // Buscar nota máxima
            if (alumnos[i].getNota() > notaMaxima) {
                notaMaxima = alumnos[i].getNota();
            }

            // Buscar nota mínima
            if (alumnos[i].getNota() < notaMinima) {
                notaMinima = alumnos[i].getNota();
            }

            // Contar mayores de edad
            if (alumnos[i].esMayorDeEdad()) {
                mayoresEdad++;
            }
        }

        // Calcular nota media
        double notaMedia = sumaNotas / alumnos.length;

        // Mostrar resultados
        System.out.println("ESTADISTICAS DE LOS ALUMNOS");
        System.out.println("---------------------------");

        System.out.println("Nota media: " + notaMedia);
        System.out.println("Numero de aprobados: " + aprobados);
        System.out.println("Numero de suspensos: " + suspensos);
        System.out.println("Nota maxima: " + notaMaxima);
        System.out.println("Nota minima: " + notaMinima);
        System.out.println("Alumnos mayores de edad: " + mayoresEdad);
    
    }
}
