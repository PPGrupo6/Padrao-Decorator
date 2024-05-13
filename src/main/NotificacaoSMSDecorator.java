package main;


public class NotificacaoSMSDecorator extends NotificacaoDecorator {
    public NotificacaoSMSDecorator(Notificacao notificacaoDecorada) {
        super(notificacaoDecorada);
    }

    @Override
    public void enviar(String mensagem) {
        super.enviar(mensagem);
        System.out.println("Enviando SMS: " + mensagem);
    }
}
