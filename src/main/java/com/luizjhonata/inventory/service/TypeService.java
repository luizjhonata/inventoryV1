package com.luizjhonata.inventory.service;

import com.luizjhonata.inventory.model.Product;
import com.luizjhonata.inventory.model.Type;
import com.luizjhonata.inventory.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeService {

    private final TypeRepository repository;

    public TypeService(TypeRepository repository) {
        this.repository = repository;
    }

    /*Método para buscar todos os tipos*/
    public List<Type> findAll(){
        return repository.findAll();
    }

}
