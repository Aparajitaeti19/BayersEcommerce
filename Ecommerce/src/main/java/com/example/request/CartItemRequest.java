package com.example.request;


import javax.validation.constraints.NotNull;

import com.example.model.Cart;
import com.example.model.Product;

public class CartItemRequest {
    private Long id;
    private @NotNull Integer quantity;
    private @NotNull Product product;

    public CartItemRequest() {
    }

    public CartItemRequest(Cart cart) {
        this.setId(cart.getCartId());
        this.setQuantity(cart.getQuantity());
        this.setProduct(cart.getProduct());
    }

    @Override
    public String toString() {
        return "CartDto{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", productName=" + product.getName() +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
