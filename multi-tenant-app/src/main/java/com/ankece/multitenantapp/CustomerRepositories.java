package com.ankece.multitenantapp;

import com.ankece.multitenantapp.service.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepositories extends JpaRepository<Customer, Integer> {
}


