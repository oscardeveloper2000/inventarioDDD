package org.example.warehouse.values;

import co.com.sofka.domain.generic.ValueObject;
import org.example.rack.values.LoadCapicity;

/**
 * Esta clase representa el Objeto valor Stock
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class Stock implements ValueObject<Stock.Props> {
    /**
     * Representa la capacidad del stock
     */
    private final String capacity;
    /**
     * Representa el estado del stock
     */
    private final String status;

    /**
     * Representa la cantidad del stock
     */
    private final int quantity;

    /**
     * Representa el constructor del objeto valor Stock
     * @param capacity
     * @param status
     * @param quantity
     */
    public Stock(String capacity, String status, int quantity) {
        this.capacity = capacity;
        this.status = status;
        this.quantity = quantity;
    }

    /**
     * Representa el metodo para retornar una instancia
     * de Stock
     * @param capacity
     * @param status
     * @param quantity
     * @return
     */
    public static Stock of(String capacity, String status, int quantity){
        return new Stock(capacity, status, quantity);
    }

    /**
     * Representa el metodo para devolver en un solo conjunto
     * los valores de los parametros de Stock
     * @return
     */
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

    /**
     * Representa la Interfaz para la manipulación de los
     * atributos de Stock
     */
    public interface Props {
        String capacity();
        String status();
        int quantity();
    }
}
