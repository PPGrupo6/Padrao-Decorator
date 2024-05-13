package main;

// Main.java
public class Main {
    public static void main(String[] args) {

        Notificacao notificacao = new NotificacaoBasica();


        notificacao = new NotificacaoSMSDecorator(notificacao);
        notificacao = new NotificacaoEmailDecorator(notificacao);
        notificacao = new NotificacaoPushDecorator(notificacao);


        notificacao.enviar("Teste de notificação");
    }
}
