package edu.ucaldas.estructurales.decorator;

public class CheeseDecorator extends ProductDecorator {
    public CheeseDecorator(Product product) {
        super(product);
    }

    public double getPrice() {
        return product.getPrice() + 2.50;
    }

    public String getDescription() {
        return product.getDescription() + " + Queso";
    }
}
