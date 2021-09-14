package nl.oose.dea.streams;

public class ProductIncreaser {
    public void increasePriceOf(Product p) {
        while (true) {
            p.increasePrice();
            p.printPrice();
        }
    }
}
