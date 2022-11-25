package com.skypro.string.cart.service;

import com.skypro.string.cart.repository.CartRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;
import java.util.List;
@Service
public class CartService {
    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @GetMapping("/add")
    public void addToCart(List<Integer> ids) {
        this.cartRepository.addToCart(ids);
    }

    @GetMapping("/get")
    public List<Integer> getCartContent() {//получить продукты из корзины
        return this.cartRepository.getCartContent();
    }
}
