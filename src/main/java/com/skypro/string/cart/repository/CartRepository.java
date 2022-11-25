package com.skypro.string.cart.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Repository

@SessionScope
public class CartRepository {
    private final List<Integer> idList = new ArrayList<>();

    public void addToCart(List<Integer> ids) {
        idList.addAll(ids);
    }

    public List<Integer> getCartContent() {
        return this.idList;
    }
}
