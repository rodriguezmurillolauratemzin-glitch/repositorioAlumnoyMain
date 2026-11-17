import java.util.ArrayList;
import java.util.List;

public class Curso implements GeneradorInformacion, ExportableCSV {
    private String nombre;
    private String nombreProfesor;
    List<Alumno> alumnos = new ArrayList<>();
    private int capacidadMaxima;

    public Curso(String nombre, String nombreProfesor, int capacidadMaxima) {
        this.nombre = nombre;
        this.nombreProfesor = nombreProfesor;
        this.capacidadMaxima = 3;
    }
    public void mostrarModalidadAlumnos() {
        for (Alumno alumno : alumnos) {
            System.out.println("Alumno: " + alumno.getNombre() + ", Modalidad: " + alumno.obtenerModalidad());
        }
    }
    public void matricular(Alumno alumno) {
        if (alumnos.size() < capacidadMaxima) {
            alumnos.add(alumno);
            System.out.println("Alumno " + alumno.getNombre() + " matriculado en el curso " + nombre);
        } else {
            System.out.println("No se puede matricular al alumno " + alumno.getNombre() + ". Capacidad máxima alcanzada.");
        }
        try{
            if(alumno.size() >= capacidadMaxima){
                throw new CursoLlenoException();
            }
        }
        try {
            if (alumno == null) {
                throw new IllegalArgumentException("No se puede añadir esa dato. El alumno es nulo.");
            }
        } 
    }
    public int getNumeroAlumnos() {
        return alumnos.size();
    }
    public void setNumeroAlumnos(int numeroAlumnos) {
        try {
            if (numeroAlumnos > capacidadMaxima) {
                throw new IllegalStateException("El número de alumnos no puede ser mayor que la capacidad máxima.");
            }
            this.capacidadMaxima = numeroAlumnos;
        } 
        this.capacidadMaxima = numeroAlumnos;
    }
public double calcularMedia() {
    if (alumnos.isEmpty()) {
        return 0;
    }

    double suma = 0;

    for (Alumno alumno : alumnos) {
        suma += alumno.getNota();
    }

    return suma / alumnos.size();
}
public int contarAprobados() {
    int contador = 0;

    for (Alumno alumno : alumnos) {
        if (alumno.estaAprobado()) {
            contador++;
        }
    }

    return contador;
}
public Alumno obtenerAlumnoConNotaMasAlta() {
    if (alumnos.isEmpty()) {
        return null;
    }

    Alumno mejor = alumnos.get(0);

    for (Alumno alumno : alumnos) {
        if (alumno.getNota() > mejor.getNota()) {
            mejor = alumno;
        }
    }

    return mejor;
}
public Alumno buscarPorNombre(String nombre) {
    for (Alumno alumno : alumnos) {
        if (alumno.getNombre().equalsIgnoreCase(nombre)) {
            return alumno;
        }
    }

    return null;
}
public void mostrarInformacion() {
    System.out.println("CURSO: " + nombre);
    System.out.println("PROFESOR: " + nombreProfesor);
    System.out.println("NÚMERO DE ALUMNOS: " + alumnos.size());
    System.out.println("NOTA MEDIA: " + calcularMedia());
    System.out.println("ALUMNOS APROBADOS: " + contarAprobados());
}
public void mostrarModalidades() {
    System.out.println("MODALIDADES DE LOS ALUMNOS");
    System.out.println("--------------------------");

    for (Alumno alumno : alumnos) {
        System.out.println(
            alumno.getNombre() + ": " + alumno.obtenerModalidad()
        );
    }
}
    @Override
    public String generarInforme() {
        return "INFORME DEL CURSO\n" +
            "Nombre del curso: " + nombre + "\n" +
            "Profesor: " + nombreProfesor + "\n" +
            "Número de alumnos: " + alumnos.size() + "\n" +
            "Nota media: " + calcularMedia() + "\n" +
            "Alumnos aprobados: " + contarAprobados();
    }
    @Override
    public String exportarCSV() {
        return "Nombre del curso: " + nombre + ", Nombre del profesor: " + nombreProfesor + ", Número de alumnos: " + alumnos.size();
    }
}