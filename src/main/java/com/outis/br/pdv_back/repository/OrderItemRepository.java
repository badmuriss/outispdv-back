package com.outis.br.pdv_back.repository;

import com.outis.br.pdv_back.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
