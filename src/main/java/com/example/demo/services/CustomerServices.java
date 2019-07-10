package com.example.demo.services;

import com.example.demo.domain.Customer;

import java.util.List;

public interface CustomerServices {

    Customer findCustomerById(Long id);

    List<Customer> findAllCustomer();

    Customer savaCustomer(Customer customer);
}
