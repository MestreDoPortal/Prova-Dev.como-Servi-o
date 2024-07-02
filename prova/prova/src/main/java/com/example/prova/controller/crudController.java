package com.example.prova.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prova.model.Crud;

import service.CrudService;


@RestController
public class CrudController {

    @Autowired
    private CrudService crudService;

    @PostMapping("/crud")
    public String cadastrar(@ModelAttribute Crud crud) {
        crudService.save(crud);
        return "crud";
    }

    @GetMapping
    public String listar(Crud crud) {
        List<Crud> itens = crudService.getAllItens();
        crud.addAttribute("itens", itens);
        return "crud";
    }
    
}
