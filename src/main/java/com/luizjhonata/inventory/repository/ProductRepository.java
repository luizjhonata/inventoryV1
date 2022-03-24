package com.luizjhonata.inventory.repository;

import com.luizjhonata.inventory.model.Product;
import com.luizjhonata.inventory.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/*O JpaRepository é uma interface, logo temos public interface ao invés de class
 * O extends é pq ela vai herdar do JpaRepository que já está no framework, inserindo o nome da Classe e o tipo do Id dela  */

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCod(String cod);

    List<Product> findByType(Type type);

}
