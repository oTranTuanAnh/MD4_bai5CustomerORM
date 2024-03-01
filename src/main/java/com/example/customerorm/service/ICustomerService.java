package com.example.customerorm.service;

import com.example.customerorm.model.Customers;

import java.util.List;

public interface ICustomerService {
    List<Customers> findAll();

    void save(Customers customer);

    Customers findById(int id);

    void remove(int id);
}
