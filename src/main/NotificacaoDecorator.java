package main;


public abstract class NotificacaoDecorator implements Notificacao {
    protected Notificacao notificacaoDecorada;

    public NotificacaoDecorator(Notificacao notificacaoDecorada) {
        this.notificacaoDecorada = notificacaoDecorada;
    }

    @Override
    public void enviar(String mensagem) {
        notificacaoDecorada.enviar(mensagem);
    }
}
