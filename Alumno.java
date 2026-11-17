
public class Alumno {

    private String nombre;
    private int edad;
    private double nota;

    public Alumno(String nombre, int edad, double nota) {
        setNombre(nombre);
        setEdad(edad);
        setNota(nota);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException(
                "El nombre no puede ser nulo ni estar en blanco."
            );
        }
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad < 16 || edad > 100) {
            throw new IllegalArgumentException(
                "La edad debe estar entre 16 y 100."
            );
        }
        this.edad = edad;
    }

    public void setNota(double nota) {
        if (nota < 0.0 || nota > 10.0) {
            throw new IllegalArgumentException(
                "La nota debe estar entre 0 y 10."
            );
        }
        this.nota = nota;
    }

    public boolean estaAprobado() {
        return nota >= 5.0;
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public void subirNota(double puntos) {
        setNota(nota + puntos);
    }

    public boolean tieneMejorNotaQue(Alumno otro) {
        return this.nota > otro.nota;
    }

    public String obtenerCalificacion() {

        if (nota < 5) {
            return "Suspenso";
        } else if (nota < 7) {
            return "Aprobado";
        } else if (nota < 9) {
            return "Notable";
        } else {
            return "Sobresaliente";
        }
    }

    public boolean tieneLaMismaNotaQue(Alumno otro) {
        return this.nota == otro.nota;
    }

    public double obtenerDiferenciaDeNota(Alumno otro) {
        return Math.abs(this.nota - otro.nota);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               ", Edad: " + edad +
               ", Nota: " + nota;
    }
public void mostrarInformacion() {
    System.out.println(this);
}
    //public abstract String obtenerModalidad();
}
