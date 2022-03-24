package com.luizjhonata.inventory.model;

import javax.persistence.*;

@Entity /*informa que a classe vai ser mapeada em uma tabela no banco de dados. É uma função do JPA*/
@Table(name = "tb_type") /*informa o nome que a tabela vai ter no banco de dados. É uma função do JPA*/
public class Type {

    @Id /*Informa que o id vai ser a chave primária do banco de dados*/
    @GeneratedValue(strategy = GenerationType.IDENTITY) /*Faz com que o ID seja gerado automaticamente e será único*/
    private Long id;

    private String name;

    /*Construtor*/
    public Type(){
        }

    /*Gets and Setters*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
