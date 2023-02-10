package com.ankece.multitenantapp.service;

import com.ankece.multitenantapp.CustomerRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepositories customerRepositories;

    public Customer createCustomerEntry(Customer customer){

        Customer response = customerRepositories.save(customer);
        return response;
    }

    public List<Customer> getAllCustomers(){
        List<Customer> customers = customerRepositories.findAll();
        return customers;
    }
}
