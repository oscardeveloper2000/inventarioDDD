package org.example.product.commands;

import co.com.sofka.domain.generic.Command;
import org.example.product.values.ProductId;
import org.example.product.values.Quantity;
/**
 * Esta clase representa el comando CreateProduct
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class CreateProduct extends Command {
    /**
     * Representa el identificador del Product
     */
    private final ProductId productId;
    /**
     * Representa la cantidad del Product
     */
    private final Quantity quantity;

    /**
     * Representa el constructor del comando CreateProduct
     * @param productId
     * @param quantity
     */
    public CreateProduct(ProductId productId, Quantity quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    /**
     * Representa el metodo que retorna el identificador del Product
     * @return Identificador del Product tipo ProductId
     */
    public ProductId getProductId() {
        return productId;
    }

    /**
     * Representa el metodo que retorna la cantidad del Product
     * @return la catidad del producto tipo Quantity
     */
    public Quantity getQuantity() {
        return quantity;
    }
}
