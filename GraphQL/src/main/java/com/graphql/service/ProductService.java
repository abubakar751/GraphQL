package com.graphql.service;

import com.graphql.entity.Product;
import com.graphql.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements  IProductService{
    @Autowired
    private ProductRepo productRepo;
    @Override
    public List<Product> getAllProduct() {
        return  productRepo.findAll();
    }
    public List<Product> getProductByCategory(String category){
        return productRepo.findByCategory(category);
    }

    @Override
    public Product updateStockData(int id, int stock) {
        Product product = productRepo.findById(id).orElseThrow(() -> new RuntimeException("Id Not found" + id));
        product.setStock(stock);
        productRepo.save(product);
        return product;
    }
}
