package com.outis.br.pdv_back.repository;

import com.outis.br.pdv_back.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
