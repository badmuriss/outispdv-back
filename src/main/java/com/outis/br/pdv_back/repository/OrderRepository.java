package com.outis.br.pdv_back.repository;

import com.outis.br.pdv_back.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
