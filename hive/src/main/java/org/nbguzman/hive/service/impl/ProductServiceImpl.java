package org.nbguzman.hive.service.impl;

import org.nbguzman.hive.entity.ProductEntity;
import org.nbguzman.hive.model.Product;
import org.nbguzman.hive.repository.ProductRepository;
import org.nbguzman.hive.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(this::mapToModel)
                .collect(Collectors.toList());
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .map(this::mapToModel)
                .orElse(null);
    }

    @Override
    public Product createProduct(Product product) {
        ProductEntity entity = new ProductEntity((String) product.getName(), (Double) product.getPrice());
        return mapToModel(productRepository.save(entity));
    }
    
    private Product mapToModel(ProductEntity entity) {
        return new Product(entity.getId(), entity.getName(), entity.getPrice());
    }
}
