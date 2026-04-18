package edu.ucaldas.behaviour.observer;

public class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    public void update(double price) {
        System.out.println("[Inversor " + name + "] Precio actualizado: $" + price);
    }
}
