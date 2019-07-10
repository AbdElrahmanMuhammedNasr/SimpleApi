package com.example.demo.bootstrap;

import com.example.demo.domain.Customer;
import com.example.demo.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData  implements CommandLineRunner {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Starting loading data ......................");

        Customer c1 = new Customer();
        c1.setFirstName("abdo");
        c1.setLastName("nasr");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("hameed");
        c2.setLastName("nasr");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstName("hassan");
        c3.setLastName("hamoda");
        customerRepository.save(c3);

        Customer c4 = new Customer();
        c4.setFirstName("tamer");
        c4.setLastName("magdy");
        customerRepository.save(c4);

        System.out.println("Ending loading data ......................");


    }
}
