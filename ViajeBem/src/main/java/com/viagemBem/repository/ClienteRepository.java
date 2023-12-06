package com.viagemBem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.viagemBem.model.Cliente;


public interface ClienteRepository extends MongoRepository<Cliente, String> {

}
