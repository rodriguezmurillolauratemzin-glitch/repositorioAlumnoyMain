public class NotificacionEmail extends Notificacion {  
    public NotificacionEmail(String destinatario) {
        super(destinatario);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando correo electrónico a " + getDestinatario() + ": " + mensaje);
    }
}