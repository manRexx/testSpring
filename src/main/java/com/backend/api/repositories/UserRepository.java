package com.backend.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.backend.api.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
