package com.todoapp.repository;

import org.springframework.data.repository.CrudRepository;
import com.todoapp.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{
    Evento findByCodigo(long codigo);   
}
