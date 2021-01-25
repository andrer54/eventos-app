package com.todoapp.controllers;

import com.todoapp.repository.TarefaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.todoapp.models.Tarefa;

@Controller
public class TarefaController {
    
    @Autowired
    private TarefaRepository er;

    @RequestMapping(value="/cadastrarTarefa", method=RequestMethod.GET)
    public String form(){
        return "tarefas/formTarefa";
    }

    @RequestMapping(value="/cadastrarTarefa", method=RequestMethod.POST)
    public String form(Tarefa tarefa){
        er.save(tarefa);
        return "redirect:/cadastrarTarefa";
    }
    @RequestMapping("/tarefas")
    public ModelAndView listaTarefas(){
        ModelAndView mv = new ModelAndView("tarefas/tarefas");
        Iterable<Tarefa> tarefas = er.findAll();
        mv.addObject("tarefas", tarefas);
        return mv;

    }
}






/*



package com.todoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class  {
    
    @RequestMapping("/tarefas")
    public String index(){
        return "tarefas/formTarefa";
    }
}



*/