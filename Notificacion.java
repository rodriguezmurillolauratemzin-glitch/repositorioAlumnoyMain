public abstract class Notificacion {
    private String destinatario;

    public Notificacion(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public abstract void enviar(String mensaje);
}