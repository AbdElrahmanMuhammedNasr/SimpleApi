package com.example.demo.controllers;

import com.example.demo.domain.Customer;
import com.example.demo.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController {

  //  @Value("${main.url}")
    public static final String BASE_URL="/api/Customer";

    @Autowired
    private CustomerServices customerServices;

    @GetMapping(value = {"/getCustomer"})
    public List<Customer> getAllCustomer(){
        return customerServices.findAllCustomer();
    }

    @GetMapping(value = {"/getCustomer/{id}"})
    public Customer getOneCustomer(@PathVariable Long id){
        return customerServices.findCustomerById(id);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public  Customer saveCustomer(@RequestBody Customer customer){
        return customerServices.savaCustomer(customer);
    }

}
