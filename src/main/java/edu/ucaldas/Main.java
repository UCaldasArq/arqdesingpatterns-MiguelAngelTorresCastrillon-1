package edu.ucaldas;

import edu.ucaldas.creacionales.factory.*;
import edu.ucaldas.creacionales.singleton.*;
import edu.ucaldas.estructurales.adapter.*;
import edu.ucaldas.estructurales.decorator.*;
import edu.ucaldas.behaviour.observer.*;
import edu.ucaldas.behaviour.strategy.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PATRONES DE DISEÑO ===\n");

        // =====================
        // 1. FACTORY METHOD
        // =====================
        System.out.println("--- FACTORY METHOD ---");
        Notification email = NotificationFactory.createNotification("email");
        Notification sms = NotificationFactory.createNotification("sms");
        Notification push = NotificationFactory.createNotification("push");

        email.send("Hola por email");
        sms.send("Hola por SMS");
        push.send("Hola por push");

        // Para usar con parámetro dinámico:
        String tipo = "sms";
        Notification notif = NotificationFactory.createNotification(tipo);
        notif.send("Notificación dinámica: " + tipo);

        System.out.println();

        // =====================
        // 2. SINGLETON
        // =====================
        System.out.println("--- SINGLETON ---");
        DataBaseConnection conn1 = DataBaseConnection.getInstance();
        DataBaseConnection conn2 = DataBaseConnection.getInstance();
        conn1.connect();
        System.out.println("¿Misma instancia? " + (conn1 == conn2));
        conn1.disconnect();

        System.out.println();

        // =====================
        // 3. ADAPTER
        // =====================
        System.out.println("--- ADAPTER ---");
        XMLService xmlService = new XMLService();
        System.out.println("XML original: " + xmlService.getData());

        JSONService adapter = new XMLtoJSONAdapter(xmlService);
        System.out.println("JSON adaptado: " + adapter.getJSON());

        System.out.println();

        // =====================
        // 4. DECORATOR
        // =====================
        System.out.println("--- DECORATOR ---");
        Product burger = new BasicProduct();
        System.out.println("Base: " + burger.getDescription() + " = $" + burger.getPrice());

        Product cheeseBurger = new CheeseDecorator(burger);
        System.out.println("+ Queso: " + cheeseBurger.getDescription() + " = $" + cheeseBurger.getPrice());

        Product baconBurger = new BaconDecorator(cheeseBurger);
        System.out.println("+ Bacon: " + baconBurger.getDescription() + " = $" + baconBurger.getPrice());

        System.out.println();

        // =====================
        // 5. STRATEGY
        // =====================
        System.out.println("--- STRATEGY ---");
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.executePayment(100.00);

        context.setStrategy(new PayPalPayment());
        context.executePayment(50.00);

        context.setStrategy(new CryptoPayment());
        context.executePayment(0.005);

        System.out.println();

        // =====================
        // 6. OBSERVER
        // =====================
        System.out.println("--- OBSERVER ---");
        Stock apple = new Stock();

        Investor juan = new Investor("Juan");
        Investor maria = new Investor("María");

        apple.addObserver(juan);
        apple.addObserver(maria);

        apple.setPrice(150.00);
        System.out.println("--- Cambio de precio ---");
        apple.setPrice(155.50);

        System.out.println("\n=== FIN ===");
    }
}
    