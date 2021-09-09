package com.tuyen.demo.usermanagement.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    @Column(name = "id", columnDefinition = "serial")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
}