package com.example.backend.repositories;

import com.example.backend.entities.Backend;
import org.springframework.data.repository.CrudRepository;

public interface BackendRepository extends CrudRepository<Backend, Integer> {
}
