package Models;

import java.util.ArrayList;
import java.util.List;

/**
 * Модель перевозчика
 */
public class Carrier {

    private int id;
    private long cardNumber;
    private List<Integer> zones;

    public Carrier(int id, long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.zones = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public long getCardNumber() {
        return cardNumber;
    }

}