private class AlumnoOnline extends Alumno {
    private int porcentajeConexion;

    public AlumnoOnline(String nombre, int edad, double nota, int porcentajeConexion) {
        super(nombre, edad, nota);
        this.porcentajeConexion = porcentajeConexion;
    }

    public int getPorcentajeConexion() {
        return porcentajeConexion;
    }

    public void setPorcentajeConexion(int porcentajeConexion) {
        this.porcentajeConexion = porcentajeConexion;
    }
    public void mostrarDatosEspecificos() {
    System.out.println("Porcentaje de conexión: " + porcentajeConexion);
}

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Nota: " + getNota());
        System.out.println("Porcentaje de conexión: " + porcentajeConexion);
    }
    @Override
    public String obtenerModalidad() {
        return "Online";
    }
}