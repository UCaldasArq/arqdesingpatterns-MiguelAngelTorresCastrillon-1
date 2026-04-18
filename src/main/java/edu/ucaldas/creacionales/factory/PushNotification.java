package edu.ucaldas.creacionales.factory;

public class PushNotification implements Notification {
    public void send(String message) {
        System.out.println("[PUSH] Enviando: " + message);
    }
}