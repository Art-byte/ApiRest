package com.example.ApiRest.controller;

import com.example.ApiRest.model.Persona;
import com.example.ApiRest.service.api.PersonaServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
* Este ejemplo es de un controlador pero consumiendo directamente
* de un Api Rest, por lo cual sus respuestas seran en formato json
* */

@RestController
@RequestMapping(value = "/api/v1/")
@CrossOrigin("*")
public class PersonaRestController {

    @Autowired
    private PersonaServiceAPI personaServiceAPI;

    @GetMapping(value = "/all")
    public List<Persona> getAll(){
        return personaServiceAPI.getAll();
    }

    @GetMapping(value = "/find/{id}")
    public Persona find(@PathVariable("id") Long id){
        return personaServiceAPI.get(id);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Persona> save(@RequestBody Persona persona){
        Persona obj = personaServiceAPI.save(persona);
        return new ResponseEntity<Persona>(obj, HttpStatus.OK);
    }

    @GetMapping(value = "/dalete/{id}")
    public ResponseEntity<Persona> delete(@PathVariable Long id){
        Persona persona = personaServiceAPI.get(id);
        if(persona != null){
            personaServiceAPI.delete(id);
        }else{
            return new ResponseEntity<Persona>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Persona>(persona, HttpStatus.OK);
    }


}
