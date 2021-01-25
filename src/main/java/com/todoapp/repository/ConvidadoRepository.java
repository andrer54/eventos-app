package com.todoapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.todoapp.models.Convidado;
import com.todoapp.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{
    Iterable<Convidado> findByEvento(Evento evento);//Convidado findByCodigo(long telefone);   
    Convidado findByTelefone(long telefone);
}
