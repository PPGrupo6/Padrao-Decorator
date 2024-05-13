package main;


public class NotificacaoPushDecorator extends NotificacaoDecorator {
    public NotificacaoPushDecorator(Notificacao notificacaoDecorada) {
        super(notificacaoDecorada);
    }

    @Override
    public void enviar(String mensagem) {
        super.enviar(mensagem);
        System.out.println("Enviando Push: " + mensagem);
    }
}