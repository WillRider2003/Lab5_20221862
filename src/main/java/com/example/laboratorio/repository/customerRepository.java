package com.example.laboratorio.repository;

import com.example.laboratorio.entity.customerEntity;
import org.jspecify.annotations.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public class customerRepository {

    <Customer> List<Customer> findByFirstNameContaining(String firstName) {
        return null;
    }

    public @Nullable Object findAll() {
        return null;
    }
}
