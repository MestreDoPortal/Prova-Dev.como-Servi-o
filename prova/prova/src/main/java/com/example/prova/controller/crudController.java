package com.example.prova.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.prova.model.Crud;
import com.example.prova.service.CrudService;



@Controller
public class CrudController {

    @Autowired
    private CrudService crudService;

    @PostMapping("/")
    public String cadastrar(@ModelAttribute Crud crud) {
        crudService.save(crud);
        return "crud";
    }

    @GetMapping("/")
    public String listar(Model model) {
        List<Crud> itens = crudService.getAllItens();
        model.addAttribute("itens", itens);
        return "crud";
    }
    
    
    @PostMapping("/")
    public String excluir(@PathVariable("id") Long id) {
        crudService.excluir(id);
        return "crud";
    }




}
