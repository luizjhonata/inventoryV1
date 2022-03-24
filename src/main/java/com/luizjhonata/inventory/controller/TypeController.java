package com.luizjhonata.inventory.controller;

import com.luizjhonata.inventory.model.Type;
import com.luizjhonata.inventory.repository.TypeRepository;
import com.luizjhonata.inventory.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/type")
public class TypeController {

    @Autowired
    private TypeRepository repository;

    @Autowired
    private TypeService service;

    @GetMapping
    public ResponseEntity<List<Type>> listAll(){
        List<Type> list = service.findAll();
        return ResponseEntity.ok(list);
    }





}
