package com.outis.br.pdv_back.repository;

import com.outis.br.pdv_back.domain.model.Order;
import com.outis.br.pdv_back.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
