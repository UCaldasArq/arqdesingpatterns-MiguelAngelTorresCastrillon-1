package edu.ucaldas.behaviour.strategy;

public class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Pagando $" + amount + " con Tarjeta de Crédito");
    }
}
