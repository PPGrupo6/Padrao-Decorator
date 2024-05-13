package main;


public class NotificacaoEmailDecorator extends NotificacaoDecorator {
    public NotificacaoEmailDecorator(Notificacao notificacaoDecorada) {
        super(notificacaoDecorada);
    }

    @Override
    public void enviar(String mensagem) {
        super.enviar(mensagem);
        System.out.println("Enviando Email: " + mensagem);
    }
}
