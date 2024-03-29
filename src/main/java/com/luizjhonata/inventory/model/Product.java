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

    private BigDecimal cost_price;

    private BigDecimal sale_price;

    private BigDecimal weight_price;

    private Long weight;


    @ManyToOne /*Significa que vou ter muitos produtos para um tipo de protudo, relação muitos para um*/
    @JoinColumn(name = "type_id") /*Configurando como será o nome da chave estrangeira no meu banco de dados*/
    private Type type;


    public BigDecimal getSale_price() {
        return sale_price;
    }

    public void setSale_price(BigDecimal sale_price) {
        this.sale_price = sale_price;
    }

    public BigDecimal getWeight_price() {
        return weight_price;
    }

    public void setWeight_price(BigDecimal weight_price) {
        this.weight_price = weight_price;
    }

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

    public BigDecimal getCost_price() {
        return cost_price;
    }

    public void setCost_price(BigDecimal cost_price) {
        this.cost_price = cost_price;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public void setType(Type type) {
        this.type = type;
    }


}
