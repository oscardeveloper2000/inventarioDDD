package org.example.product.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;

/**
 * Esta clase representa el objeto valor Date
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class Date implements ValueObject<Date.Props> {
    /**
     * Representa la fecha de manufacturación del producto
     */
    private final LocalDate manufacturingDate;
    /**
     * Representa la fecha de caducidad del producto
     */
    private final LocalDate dueDate;

    /**
     * Representa el constructor del objeto valor Date
     * @param manufacturingDate
     * @param dueDate
     */
    public Date(LocalDate manufacturingDate, LocalDate dueDate) {
        this.manufacturingDate = manufacturingDate;
        this.dueDate = dueDate;
    }

    /**
     * Metodo para devolver en un solo conjunto los valores de los parametros de Date
     * @return
     */
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

    /**
     * Interfaz para la manipulación de los atributos de Date
     */
    public interface Props {
        LocalDate manufacturingDate();
        LocalDate dueDate();
    }
}
