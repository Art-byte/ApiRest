package com.example.ApiRest.dao.api;

import com.example.ApiRest.model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDaoAPI extends CrudRepository<Persona, Long> {
}
