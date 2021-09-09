package com.tuyen.demo.ordermanagement.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {
    @Id
    @Column(name = "id", columnDefinition = "serial")
    private int id;
    @Column(name = "product_id")
    private int productId;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "create_date")
    private Date createDate;
}