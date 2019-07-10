package com.example.demo.controllers;


import com.example.demo.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerControllerTest {

    @Autowired
    private CustomerController customerController;

    @Test
    public  void getData(){
        Customer c =customerController.getOneCustomer(new Long("1"));
    }

}