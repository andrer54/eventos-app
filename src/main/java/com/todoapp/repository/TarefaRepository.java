package com.todoapp.repository;

import org.springframework.data.repository.CrudRepository;
import com.todoapp.models.Tarefa;

public interface TarefaRepository extends CrudRepository<Tarefa, String>{
    
}
