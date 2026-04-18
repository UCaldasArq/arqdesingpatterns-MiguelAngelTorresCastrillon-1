package edu.ucaldas.creacionales.factory;

public class EmailNotification implements Notification {
    public void send(String message) {
        System.out.println("[EMAIL] Enviando: " + message);
    }
}
