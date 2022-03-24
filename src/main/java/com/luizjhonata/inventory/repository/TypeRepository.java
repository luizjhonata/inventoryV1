package com.luizjhonata.inventory.repository;

import com.luizjhonata.inventory.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;

/*O JpaRepository é uma interface, logo temos public interface ao invés de class
* O extends é pq ela vai herdar do JpaRepository que já está no framework, inserindo o nome da Classe e o tipo do Id dela  */

public interface TypeRepository extends JpaRepository<Type, Long> {
}
