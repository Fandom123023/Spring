package com.example.spring.service;

import com.example.spring.model.Basket;
import com.example.spring.service.BasketService;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collection;
import java.util.List;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {
    private final Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }
    public List<Integer> add(List<Integer> items) {
        for (Integer id : items)
            basket.addStore(id);
        return items;
    }
    public Collection<Integer> get() {
        return basket.get();

    }
}