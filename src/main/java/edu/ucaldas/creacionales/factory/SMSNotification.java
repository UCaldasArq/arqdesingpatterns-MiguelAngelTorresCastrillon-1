package edu.ucaldas.creacionales.factory;

public class SMSNotification implements Notification {
    public void send(String message) {
        System.out.println("[SMS] Enviando: " + message);
    }
}
