package com.luizjhonata.inventory.controller;

import com.luizjhonata.inventory.model.Product;
import com.luizjhonata.inventory.model.Type;
import com.luizjhonata.inventory.repository.ProductRepository;
import com.luizjhonata.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*A anotação RestController faz toda a configuração para que a classe seja um controlador e responda por requisições.
* A anotação ResquestMapping diz o endereço de acesso à classe */
@RestController
@RequestMapping(value = "/api")
public class ProductController {

    /*Utilizando a anotação Autowired eu não preciso criar o construtor, caso queira utilizar o construtor devo usar o código abaixo
    *   public ProductController(ProductRepository repository, ProductService service) {
        this.repository = repository;
        this.service = service;
    }
*/
    @Autowired
    private ProductRepository repository;

    @Autowired
    private ProductService service;



    @GetMapping("/product/all")
    public ResponseEntity<List<Product>> listAll(){
        List<Product> list = service.findAll();
        return ResponseEntity.ok(list);

    }

    @GetMapping(value = "/product/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product product = service.findById(id);
        return ResponseEntity.ok(product);
    }

    @GetMapping(value = "/product/cod/{cod}")
    public ResponseEntity<List<Product>> findByCod(@PathVariable String cod){
        List<Product> product = service.findByCod(cod);
        return ResponseEntity.ok(product);
    }

    @GetMapping(value = "/product/type/{type}")
    public ResponseEntity<List<Product>> findByType(@PathVariable Type type){
        List<Product> product = service.findByType(type);
        return ResponseEntity.ok(product);
    }

    @PostMapping(value = "/product/insert")
    public ResponseEntity<Product> insert(@RequestBody Product product){
        Product result = repository.save(product);
        return ResponseEntity.ok(result);
    }




}
