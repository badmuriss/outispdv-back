package com.outis.br.pdv_back.repository;

import com.outis.br.pdv_back.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
