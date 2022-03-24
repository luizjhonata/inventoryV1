package com.luizjhonata.inventory.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity /*informa que a classe vai ser mapeada em uma tabela no banco de dados. É uma função do JPA*/
@Table(name = "tb_product") /*informa o nome que a tabela vai ter no banco de dados. É uma função do JPA*/
public class Product {

    public Product() {
    }

    @Id /*Informa que o id vai ser a chave primária do banco de dados*/
    @GeneratedValue(strategy = GenerationType.IDENTITY) /*Faz com que o ID seja gerado automaticamente e será único*/
    private Long id;

    private String name;

    private String cod;

    private BigDecimal price;

    private Long weight;


    @ManyToOne /*Significa que vou ter muitos produtos para um tipo de protudo, relação muitos para um*/
    @JoinColumn(name = "type_id") /*Configurando como será o nome da chave estrangeira no meu banco de dados*/
    private Type type;


    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public void setType(com.luizjhonata.inventory.model.Type type) {
        this.type = type;
    }


}
