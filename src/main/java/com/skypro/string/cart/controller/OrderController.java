package com.skypro.string.cart.controller;

import com.skypro.string.cart.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/store/order")

public class OrderController {
    private final CartService cartService;

    public OrderController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public String add(@RequestParam("id") List<Integer> ids) {//добавлять
        this.cartService.addToCart(ids);
        return "Приняты идентификаторы -"  + ids;    }

    @GetMapping("/get")
    public List<Integer> get() {//получить
        return this.cartService.getCartContent();
    }
}
