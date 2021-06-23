package com.example.ApiRest.service.impl;

import com.example.ApiRest.commons.GenericServiceImpl;
import com.example.ApiRest.dao.api.PersonaDaoAPI;
import com.example.ApiRest.model.Persona;
import com.example.ApiRest.service.api.PersonaServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaServiceAPI {

    @Autowired
    private PersonaDaoAPI personaDaoAPI;

    @Override
    public CrudRepository<Persona, Long> getDao() {
        return personaDaoAPI;
    }
}
