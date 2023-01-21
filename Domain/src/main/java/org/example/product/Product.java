package org.example.product;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.example.product.entities.Lot;
import org.example.product.entities.Packaging;
import org.example.product.events.LotAdded;
import org.example.product.events.PackagingAdded;
import org.example.product.events.ProductCreated;
import org.example.product.events.QuantityUpdated;
import org.example.product.values.*;

import java.util.List;
/**
 * Esta clase representa el agregado root Product
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
public class Product extends AggregateEvent<ProductId> {
    /**
     * Representa la cantidad del producto
     */
    protected Quantity quantity;
    /**
     * Representa el lote del producto
     */
    protected Lot lot;
    /**
     * Representa el empaquetado adecuado para el producto
     */
    protected Packaging packaging;

    /**
     * Representa el construstor del agregado Product
     * @param productId
     * @param quantity
     */
    public Product(ProductId productId, Quantity quantity){
        super(productId);
        appendChange(new ProductCreated(quantity)).apply();
    }

    /**
     * Representa el constructor del agregado Product que extiende clase padre
     * @param productId
     */
    private Product(ProductId productId){
        super(productId);
        subscribe(new ProductEventChange(this));
    }

    /**
     * Representa el metodo que envia el evento que se realizara sobre el agregado
     * @param productId
     * @param events
     * @return
     */
    public static Product from(ProductId productId, List<DomainEvent> events){
        var product = new Product(productId);
        events.forEach(product::applyEvent);
        return product;
    }

    /**
     * Representa el metodo que agrega un lote al agregado product
     * @param date
     */
    public void addLot(Date date){
        var lotId = new LotId();
        appendChange(new LotAdded(lotId, date)).apply();
    }

    /**
     * Representa el metodo que agrega una forma de empaquetado al agregado product
     * @param capacity
     * @param dimension
     */
    public void addPackaging(Capacity capacity, Dimension dimension) {
        var packagingId = new PackagingId();
        appendChange(new PackagingAdded(packagingId, capacity, dimension)).apply();
    }

    /**
     * Representa el metodo que actualiza la cantidad de producto que tiene el agregado Product
     * @param productId
     * @param quantity
     */
    public void updateQuantity(ProductId productId, Quantity quantity){
        appendChange(new QuantityUpdated(productId, quantity)).apply();
    }

    /**
     * Representa el metodo que retorna una cantidad
     * @return
     */
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * Representa el metodo que retorna un lote
     * @return
     */
    public Lot getLot() {
        return lot;
    }

    /**
     * Representa el metodo que retorna un empaquetado
     * @return
     */
    public Packaging getPackaging(){
        return packaging;
    }
}
