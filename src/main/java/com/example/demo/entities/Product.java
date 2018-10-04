package com.example.demo.entities;

import lombok.Setter;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name="product", schema = "test")
@Getter @Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="productId")
    private Long id;
    private String productName;
    private int quantity;
}
