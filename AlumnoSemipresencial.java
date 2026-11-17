public class AlumnoSemipresencial extends Alumno {

    private int horasAsistencia;
    private int porcentajeConexion;

    public AlumnoSemipresencial(String nombre, int edad, double nota,
                                int horasAsistencia, int porcentajeConexion) {

        super(nombre, edad, nota);

        this.horasAsistencia = horasAsistencia;
        this.porcentajeConexion = porcentajeConexion;
    }

    public int getHorasAsistencia() {
        return horasAsistencia;
    }

    public void setHorasAsistencia(int horasAsistencia) {
        this.horasAsistencia = horasAsistencia;
    }

    public int getPorcentajeConexion() {
        return porcentajeConexion;
    }

    public void setPorcentajeConexion(int porcentajeConexion) {
        this.porcentajeConexion = porcentajeConexion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Nota: " + getNota());
        System.out.println("Horas de asistencia: " + horasAsistencia);
        System.out.println("Porcentaje de conexión: " + porcentajeConexion);
    }

    @Override
    public String obtenerModalidad() {
        return "Semipresencial";
    }

    public void mostrarDatosEspecificos() {
        System.out.println("Horas de asistencia: " + horasAsistencia);
        System.out.println("Porcentaje de conexión: " + porcentajeConexion);
    }
}