package org.example.warehouse.values;

import co.com.sofka.domain.generic.ValueObject;

public class Stock implements ValueObject<Stock.Props> {
    private final String capicity;
    private final String status;
    private final int quantity;

    public Stock(String capicity, String status, int quantity) {
        this.capicity = capicity;
        this.status = status;
        this.quantity = quantity;
    }

    @Override
    public Stock.Props value() {
        return new Props() {
            @Override
            public String capicity() { return capicity; }
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
        String capicity();
        String status();
        int quantity();
    }
}
