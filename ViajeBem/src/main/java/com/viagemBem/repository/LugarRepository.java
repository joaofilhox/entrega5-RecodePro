package com.viagemBem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.viagemBem.model.Lugar;

@Repository
public interface LugarRepository extends MongoRepository<Lugar, String> {

}
