package edu.ucaldas.estructurales.decorator;

public class BaconDecorator extends ProductDecorator {
    public BaconDecorator(Product product) {
        super(product);
    }

    public double getPrice() {
        return product.getPrice() + 3.00;
    }

    public String getDescription() {
        return product.getDescription() + " + Bacon";
    }
}