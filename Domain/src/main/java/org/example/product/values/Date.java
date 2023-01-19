package org.example.product.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;

public class Date implements ValueObject<Date.Props> {
    private final LocalDate manufacturingDate;
    private final LocalDate dueDate;

    public Date(LocalDate manufacturingDate, LocalDate dueDate) {
        this.manufacturingDate = manufacturingDate;
        this.dueDate = dueDate;
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public LocalDate manufacturingDate() {
                return manufacturingDate;
            }
            @Override
            public LocalDate dueDate() {
                return dueDate;
            }
        };
    }


    public interface Props {
        LocalDate manufacturingDate();
        LocalDate dueDate();
    }
}
