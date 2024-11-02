package com.graphql.controller;

import com.graphql.entity.Product;
import com.graphql.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private IProductService iProductService;
    @QueryMapping
    public List<Product> getAllProducts(){
     return    iProductService.getAllProduct();
    }
    @QueryMapping
    public List<Product> getProductByCategory(@Argument String category){
        return iProductService.getProductByCategory(category);
    }
    @MutationMapping
 public  Product   updateStock(@Argument int id,@Argument int stock){
        return   iProductService.updateStockData(id,stock);

    }
}
