public class Alumno{
    private String nombre;
    private int edad;
    private double nota;

    public Alumno(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
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
    public void setNota(double nota) {
        if (nota < 0.0 || nota > 10.0) {
            throw new IllegalArgumentException("La nota debe estar entre 0 y 10.");
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

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Nota: " + nota;
    }

    //public abstract String obtenerModalidad();
}