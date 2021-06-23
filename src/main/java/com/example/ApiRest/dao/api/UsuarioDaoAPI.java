package com.example.ApiRest.dao.api;

import com.example.ApiRest.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDaoAPI extends CrudRepository<Usuario, Long> {
    Usuario findByUsuario(String usuario);
}
