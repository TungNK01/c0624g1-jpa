package com.codegym.c0624g1jpa.service;

import com.codegym.c0624g1jpa.model.Customer;

import java.util.List;

public interface IGenerateService<T> {
    List<T> findAll();

    void save(T t);

    T findById(Long id);

    void remove(Long id);
}