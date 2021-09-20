package nl.oose.dea.streams;

public class ThreadedProductIncreaser {
    public static void main(String[] args) {
        Product tv = new Product("TV", 1200);
        Thread thread1 = new Thread(new ProductIncreaser(tv));
        Thread thread2 = new Thread(new ProductIncreaser(tv));
        Thread thread3 = new Thread(() -> new ProductIncreaser(tv).increasePriceOf(tv));
        Thread thread4 = new Thread(() -> new ProductIncreaser(tv).increasePriceOf(tv));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
