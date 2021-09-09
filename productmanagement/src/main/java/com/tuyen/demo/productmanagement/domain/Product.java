package com.tuyen.demo.productmanagement.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Product {
    @Id
    @Column(name = "id", columnDefinition = "serial")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "catalog_id")
    private int catalogId;
    @Column(name = "quantity")
    private int quantity;

}
