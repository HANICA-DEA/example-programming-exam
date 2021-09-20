package nl.oose.dea.streams;

public class ProductIncreaser implements Runnable {
    private Product p;

    public ProductIncreaser(Product p) {
        this.p = p;
    }

    public synchronized void increasePriceOf(Product p) {
        while (true) {
            p.increasePrice();
            p.printPrice();
        }
    }

    @Override
    public void run() {
        increasePriceOf(this.p);
    }
}
