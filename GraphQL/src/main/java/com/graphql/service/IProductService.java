package com.graphql.service;

import com.graphql.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAllProduct();
    List<Product> getProductByCategory(String category);
 Product    updateStockData(int id,int stock);
}
