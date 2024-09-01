package com.example.spring.service;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
@Service
public interface BasketService {
    List<Integer> add(List<Integer> item);

    Collection<Integer> get();


}