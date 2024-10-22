package org.hive.backend.repository;

import org.hive.backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // You don't need to implement flush() or any other JpaRepository methods.
}
