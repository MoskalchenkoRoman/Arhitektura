package dz4.HomeWork4.src.Models;

/**
 * Модель перевозчика
 */
public class Carrier {

    private final long cardNumber;
    private final int id;
    private int zones;

    public Carrier(int id, long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public int getId() {
        return id;
    }
}
