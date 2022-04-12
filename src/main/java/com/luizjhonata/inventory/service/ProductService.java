package com.luizjhonata.inventory.service;

import com.luizjhonata.inventory.model.Product;
import com.luizjhonata.inventory.model.Type;
import com.luizjhonata.inventory.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/*Anotação Service para configurar que isto é um Serviço*/
@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    /*Método para mostrar todos os produtos*/
    public List<Product> findAll(){
        return repository.findAll();
    }

    /*Método para buscar produto por Id*/
    public Product findById(Long id){
        return repository.findById(id).get();
    }

    /*Método para buscar produto por Cod*/
    public List<Product> findByCod(String cod){
        List<Product> result = repository.findByCod(cod);
        return result;
    }

    /*Método para buscar todos os produtos por Type*/
    public List<Product> findByType(Type type){
        List<Product> result = repository.findByType(type);
        return result;
    }



}
