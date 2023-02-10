package com.ankece.multitenantapp;

import com.ankece.multitenantapp.service.Customer;
import com.ankece.multitenantapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/multi-tenant-app/v1/")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping(name = "/customer", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){

        Customer customerResponse = customerService.createCustomerEntry(customer);
        return ResponseEntity.ok(customerResponse);
    }

    @GetMapping(name = "/customers", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> getAllCustomer(@RequestBody Customer customer){

        Customer customerResponse = customerService.createCustomerEntry(customer);
        return ResponseEntity.ok(customerResponse);
    }
}
