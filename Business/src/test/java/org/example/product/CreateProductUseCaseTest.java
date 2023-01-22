package org.example.product;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import org.example.product.commands.CreateProduct;
import org.example.product.events.ProductCreated;

import org.example.product.values.ProductId;
import org.example.product.values.Quantity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Esta clase representa el test de Crear Producto
 *
 * @author Andrés Felipe Castro Manzano <castromanzano95@gmail.com>
 * @author Oscar Danilo Sanabria <oscarsanabria@unisangil.edu.co>
 * @version 010.00.00 2023-01-21
 * @since 1.0.0
 */
@ExtendWith(MockitoExtension.class)
class CreateProductUseCaseTest {


    @InjectMocks
    private CreateProductUseCase useCase;

    // Inyección del repositorio
    @Mock
    private DomainEventRepository repository;

    @Test
    void createProductHappyPass(){
        //arrange

        ProductId productId = ProductId.of("AAA20");
        Quantity quantity = new Quantity(20);
        var command = new CreateProduct(productId, quantity);

        //act

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getProductId().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //asserts

        var event = (ProductCreated)events.get(0);
        Assertions.assertEquals(20,event.getQuantity().value());
    }

}