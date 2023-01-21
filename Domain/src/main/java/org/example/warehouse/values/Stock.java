package org.example.warehouse.values;

import co.com.sofka.domain.generic.ValueObject;
import org.example.rack.values.LoadCapicity;

public class Stock implements ValueObject<Stock.Props> {
    private final String capacity;
    private final String status;
    private final int quantity;

    public Stock(String capacity, String status, int quantity) {
        this.capacity = capacity;
        this.status = status;
        this.quantity = quantity;
    }

    public static Stock of(String capacity, String status, int quantity){
        return new Stock(capacity, status, quantity);
    }

    @Override
    public Stock.Props value() {
        return new Props() {
            @Override
            public String capacity() { return capacity; }
            @Override
            public String status() {
                return status;
            }
            @Override
            public int quantity() {
                return quantity;
            }
        };
    }

    public interface Props {
        String capacity();
        String status();
        int quantity();
    }
}
