package com.outis.br.pdv_back.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Lob
    @Column(name = "photo", columnDefinition = "CLOB")
    private String photo;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

}
