package com.example.demo.servicesImpl;

import com.example.demo.domain.Customer;
import com.example.demo.repositories.CustomerRepository;
import com.example.demo.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServicesImpl implements CustomerServices {

    @Autowired
    private  CustomerRepository customerRepository;

    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> findAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer savaCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
