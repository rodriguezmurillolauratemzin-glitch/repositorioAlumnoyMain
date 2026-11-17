import java.util.List;
import java.util.ArrayList;
public class GestionAlumno{
    List<Alumno> alumnos = new ArrayList<>();

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void mostrarTodos() {
        for (Alumno alumno : alumnos) {
            alumno.mostrarInformacion();
            System.out.println("--------------------");
        }
    }

    public void mostrarAlumnosPresenciales() {
        for (Alumno alumno : alumnos) {
            if (alumno instanceof AlumnoPresencial) {
                alumno.mostrarInformacion();
                System.out.println("--------------------");
            }
        }
    }

    public void contarAprobados() {
        int contador = 0;
        for (Alumno alumno : alumnos) {
            if (alumno.getNota() >= 5) {
                contador++;
            }
        }
        System.out.println("Número de alumnos aprobados: " + contador);
    }

    public void calcularMedia() {
        double sumaNotas = 0;
        for (Alumno alumno : alumnos) {
            sumaNotas += alumno.getNota();
        }
        double media = sumaNotas / alumnos.size();
        System.out.println("Media de notas: " + media);
    }

    public void contarSuspensos() {
        int contador = 0;
        for (Alumno alumno : alumnos) {
            if (alumno.getNota() < 5) {
                contador++;
            }
        }
        System.out.println("Número de alumnos suspensos: " + contador);
    }

    public void obtenerAlumnoConNotaMasAlta() {
        Alumno alumnoConNotaMasAlta = null;
        double notaMasAlta = Double.MIN_VALUE;

        for (Alumno alumno : alumnos) {
            if (alumno.getNota() > notaMasAlta) {
                notaMasAlta = alumno.getNota();
                alumnoConNotaMasAlta = alumno;
            }
        }

        if (alumnoConNotaMasAlta != null) {
            System.out.println("Alumno con la nota más alta:");
            alumnoConNotaMasAlta.mostrarInformacion();
        } else {
            System.out.println("No hay alumnos registrados.");
        }
    }

    public void obtenerAlumnoConNotaMasBaja() {
        Alumno alumnoConNotaMasBaja = null;
        double notaMasBaja = Double.MAX_VALUE;

        for (Alumno alumno : alumnos) {
            if (alumno.getNota() < notaMasBaja) {
                notaMasBaja = alumno.getNota();
                alumnoConNotaMasBaja = alumno;
            }
        }

        if (alumnoConNotaMasBaja != null) {
            System.out.println("Alumno con la nota más baja:");
            alumnoConNotaMasBaja.mostrarInformacion();
        } else {
            System.out.println("No hay alumnos registrados.");
        }
    }

    public void obtenerListaConNotaMayorOIgual(double nota) {
        System.out.println("Alumnos con nota mayor o igual a " + nota + ":");
        for (Alumno alumno : alumnos) {
            if (alumno.getNota() >= nota) {
                alumno.mostrarInformacion();
                System.out.println("--------------------");
            }
        }
    }

    public void mostrarEstadisticas() {
        int numeroAlumnos = alumnos.size();
        int numeroAlumnosPresenciales = 0;
        double sumaNotas = 0;

        for (Alumno alumno : alumnos) {
            sumaNotas += alumno.getNota();
            if (alumno instanceof AlumnoPresencial) {
                numeroAlumnosPresenciales++;
            }
        }

        double mediaNotas = (numeroAlumnos > 0) ? (sumaNotas / numeroAlumnos) : 0;

        System.out.println("Número de alumnos: " + numeroAlumnos);
        System.out.println("Número de alumnos presenciales: " + numeroAlumnosPresenciales);
        System.out.println("Media de notas: " + mediaNotas);
    }
public Alumno buscarPorNombre(String nombre) {
    for (Alumno alumno : alumnos) {
        if (alumno.getNombre().equalsIgnoreCase(nombre)) {
            return alumno;
        }
    }
    return null;
}
public ArrayList<Alumno> obtenerListaDeAprobados() {
    ArrayList<Alumno> aprobados = new ArrayList<>();

    for (Alumno alumno : alumnos) {
        if (alumno.getNota() >= 5) {
            aprobados.add(alumno);
        }
    }

    return aprobados;
}
public Alumno buscarAlumnoDeMayorEdad() {
    if (alumnos.isEmpty()) {
        return null;
    }

    Alumno mayor = alumnos.get(0);

    for (Alumno alumno : alumnos) {
        if (alumno.getEdad() > mayor.getEdad()) {
            mayor = alumno;
        }
    }

    return mayor;
}
public void eliminarPorNombre(String nombre) {
    Alumno alumno = buscarPorNombre(nombre);

    if (alumno != null) {
        alumnos.remove(alumno);
        System.out.println("Alumno eliminado: " + nombre);
    } else {
        System.out.println("No se ha encontrado el alumno: " + nombre);
    }
}

}