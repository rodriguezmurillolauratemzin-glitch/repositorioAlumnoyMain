import java.util.ArrayList;

public class Main {
    //Ejercicio 3 Parte 1
    static ArrayList<Alumno> alumnos = new ArrayList<>();  

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
        Alumno alumno3 = new Alumno("Pedro", 16, 4.0);
        Alumno alumno4 = new Alumno("Lucia", 17, 9.0);
        Alumno alumno5 = new Alumno("Carlos", 22, 3.5);

        // Guardar los alumnos en un array
        Alumno[] listaAlumnos = {
            alumno1, alumno2, alumno3, alumno4, alumno5
        };

        // Variables para calcular los resultados
        double sumaNotas = 0;
        double notaMaxima = listaAlumnos[0].getNota();
        double notaMinima = listaAlumnos[0].getNota();

        int aprobados = 0;
        int suspensos = 0;
        int mayoresEdad = 0;

        // Recorrer todos los alumnos
        for (int i = 0; i < listaAlumnos.length; i++) {

            // Sumar las notas
            sumaNotas += listaAlumnos[i].getNota();

            // Contar aprobados y suspensos
            if (listaAlumnos[i].estaAprobado()) {
                aprobados++;
            } else {
                suspensos++;
            }

            if (listaAlumnos[i].getNota() > notaMaxima) {
                notaMaxima = listaAlumnos[i].getNota();
            }

            if (listaAlumnos[i].getNota() < notaMinima) {
                notaMinima = listaAlumnos[i].getNota();
            }

            if (listaAlumnos[i].esMayorDeEdad()) {
                mayoresEdad++;
            }
        }

        // Calcular nota media
        double notaMedia = sumaNotas / listaAlumnos.length;

        // Mostrar resultados
        System.out.println("ESTADISTICAS DE LOS ALUMNOS");
        System.out.println("---------------------------");

        System.out.println("Nota media: " + notaMedia);
        System.out.println("Numero de aprobados: " + aprobados);
        System.out.println("Numero de suspensos: " + suspensos);
        System.out.println("Nota maxima: " + notaMaxima);
        System.out.println("Nota minima: " + notaMinima);
        System.out.println("Alumnos mayores de edad: " + mayoresEdad);

//Comprobación Tarea 2 Parte 3
        Alumno alumno6 = new Alumno("María", 20, 7.0);
        System.out.println("Nota inicial: " + alumno6.getNota());
        alumno6.subirNota(2.0);
        System.out.println("Nota después de subir: " + alumno6.getNota());
    
// Tarea 3 Colecciones
    //Parte 1  
        alumnos.add(new Alumno("Juan", 20, 7.5));
        alumnos.add(new Alumno("Maria", 16, 4.0));
        alumnos.add(new Alumno("Pedro", 22, 8.5));
        alumnos.add(new Alumno("Lucia", 17, 3.5));

        System.out.println("LISTADO DE LOS 4 ALUMNOS");
        System.out.println("------------------------");

        for (Alumno a : alumnos) {
            System.out.println(a);
        }
    //Parte 2
        mostrarEstadisticas();

    //Parte 3
        alumnos.add(new Alumno("Carlos", 25, 9.5));
        alumnos.add(new Alumno("Ana", 19, 6.0));
        alumnos.add(new Alumno("Pablo", 18, 5.0));
        alumnos.add(new Alumno("Elena", 30, 2.5));
        alumnos.add(new Alumno("David", 21, 10.0));
        alumnos.add(new Alumno("Marta", 16, 4.5));

        System.out.println("\nLISTADO DE TODOS LOS ALUMNOS");
        System.out.println("----------------------------");

        for (Alumno a : alumnos) {
            System.out.println(a);
        }

        System.out.println("\nCantidad total de alumnos: " + alumnos.size());

        mostrarEstadisticas();

        Alumno mayorNota = alumnos.get(0);
        Alumno menorNota = alumnos.get(0);

        for (Alumno a : alumnos) {

            if (a.getNota() > mayorNota.getNota()) {
                mayorNota = a;
            }

            if (a.getNota() < menorNota.getNota()) {
                menorNota = a;
            }
        }

        System.out.println("\nALUMNO CON NOTA MAS ALTA");
        System.out.println(mayorNota);

        System.out.println("\nALUMNO CON NOTA MAS BAJA");
        System.out.println(menorNota);

        System.out.println("\nELIMINAR ALUMNOS");
        System.out.println("----------------");

        // Eliminar utilizando remove(int)
        alumnos.remove(0);

        System.out.println("Alumno eliminado utilizando remove(0)");

        // Eliminar utilizando remove(object)
        Alumno alumnoEliminar = buscaAlumno("Pedro");

        if (alumnoEliminar != null) {
            alumnos.remove(alumnoEliminar);
            System.out.println("Alumno Pedro eliminado utilizando remove(object)");
        }

        System.out.println("\nAlumnos restantes: " + alumnos.size());

        for (Alumno a : alumnos) {
            System.out.println(a);
        }

    // Parte 4
    System.out.println("\nBUSCAR ALUMNO");
        System.out.println("-------------");

        System.out.println(buscaAlumno("Carlos"));


        System.out.println("\nLISTA DE APROBADOS");
        System.out.println("------------------");

        for (Alumno a : obtenerListaDeAprobados()) {
            System.out.println(a);
        }


        System.out.println("\nALUMNO DE MAYOR EDAD");
        System.out.println("--------------------");

        System.out.println(buscarAlumnoDeMayorEdad());


        System.out.println("\nALUMNOS CON NOTA MAYOR O IGUAL A 7");
        System.out.println("----------------------------------");

        for (Alumno a : obtenerListaConNotaMayorOIgual(7.0)) {
            System.out.println(a);
        }

    
    
    }
    public static void mostrarEstadisticas() {

        int aprobados = 0;
        int suspensos = 0;
        double sumaNotas = 0;

        for (Alumno a : alumnos) {
            sumaNotas += a.getNota();
            if (a.estaAprobado()) {
                aprobados++;
            } else {
                suspensos++;
            }
        }

        double notaMedia = sumaNotas / alumnos.size();

        System.out.println("\nESTADISTICAS");
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspensos: " + suspensos);
        System.out.println("Nota media: " + notaMedia);
    }

    public static Alumno buscaAlumno(String nombre) {
        for (Alumno a : alumnos) {
            if (a.getNombre().equalsIgnoreCase(nombre)) {
                return a;
            }
        }
        return null;
    }
        public static ArrayList<Alumno> obtenerListaDeAprobados() {
            ArrayList<Alumno> aprobados = new ArrayList<>();
            for (Alumno a : alumnos) {
                if (a.estaAprobado()) {
                    aprobados.add(a);
                }
            }
            return aprobados;
        }
        
        public static Alumno buscarAlumnoDeMayorEdad() {
            if (alumnos.isEmpty()) {
                return null;
            }
            Alumno mayor = alumnos.get(0);
            for (Alumno a : alumnos) {
                if (a.getEdad() > mayor.getEdad()) {
                    mayor = a;
                }
            }
            return mayor;
        }

        public static ArrayList<Alumno> obtenerListaConNotaMayorOIgual(double nota) {
            ArrayList<Alumno> resultado = new ArrayList<>();
            for (Alumno a : alumnos) {
                if (a.getNota() >= nota) {
                    resultado.add(a);
                }
            }
            return resultado;
        }

        public static void eliminarPorNombre(String nombre) {
            Alumno alumno = buscaAlumno(nombre);
            if (alumno != null) {
                alumnos.remove(alumno);
                System.out.println("Alumno eliminado: " + nombre);
            } else {
                System.out.println("No se ha encontrado el alumno: " + nombre);
            }
        }

}
