package org.nbguzman.hive.service;

import org.nbguzman.hive.model.Product;
import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product createProduct(Product product);
}

