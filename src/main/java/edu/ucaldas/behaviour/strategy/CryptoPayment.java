package edu.ucaldas.behaviour.strategy;

public class CryptoPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Pagando $" + amount + " con Criptomonedas");
    }
}