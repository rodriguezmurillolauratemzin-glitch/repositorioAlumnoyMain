private class AlumnoPresencial extends Alumno {
    private int horasAsistencia;

    public AlumnoPresencial(String nombre, int edad, double nota, int horasAsistencia) {
        super(nombre, edad, nota);
        this.horasAsistencia = horasAsistencia;
    }

    public int getHorasAsistencia() {
        return horasAsistencia;
    }

    public void setHorasAsistencia(int horasAsistencia) {
        this.horasAsistencia = horasAsistencia;
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Nota: " + getNota());
        System.out.println("Horas de asistencia: " + horasAsistencia);
    }

    public void mostrarDatosEspecificos() {
        System.out.println("Horas de asistencia: " + horasAsistencia);
    }

    public String toString(){
        return "Alumno [Nombre: " + getNombre() + ", Edad: " + getEdad() + ", Nota: " + getNota() + ", Horas de asistencia: " + horasAsistencia + "]";
    }

    @Override
    public String obtenerModalidad() {
        return "Presencial";
    }
}