package org.example.product.values;

import co.com.sofka.domain.generic.ValueObject;

/**
 * Esta clase representa el Objeto valor Dimension
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class Dimension implements ValueObject<Dimension.Props>{
    /**
     * Representa la dimension del largo del empaquetado
     */
    private final int length;
    /**
     * Representa la dimension del ancho del empaquetado
     */
    private final int width;
    /**
     * Representa la dimension del alto del empaquetado
     */
    private final int height;

    /**
     * Representa el constructor del objeto valor Dimesion
     * @param length
     * @param width
     * @param height
     */
    public Dimension(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    /**
     * Representa el metodo para devolver en un solo conjunto
     * los valores de los parametros de Dimension
     * @return
     */
    @Override
    public Props value() {
        return new Props() {
            @Override
            public int length() {
                return length;
            }
            @Override
            public int width() {
                return width;
            }
            @Override
            public int height(){
                return height;
            }
        };
    }
    /**
     * Representa la Interfaz para la manipulación de los
     * atributos de Dimension
     */
    public interface Props {
        int length();
        int width();
        int height();
    }
}
