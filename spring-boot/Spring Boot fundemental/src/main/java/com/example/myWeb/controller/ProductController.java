package com.example.myWeb.controller;

import com.example.myWeb.model.Product;
import com.example.myWeb.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> getProduct(){
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public ResponseEntity<Product> getProductById(@PathVariable int prodId){ // Match prodId with RequestMapping
        return service.getProductById(prodId)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/add")
    public ResponseEntity<Void> addProducts(@RequestBody Product prod) {
        service.addProduct(prod);
        return ResponseEntity.ok().build();
    }
    @PutMapping("/update")
    public ResponseEntity<Void> updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete/{prod}")
    public ResponseEntity<Void> deleteProduct(@PathVariable int prod){
       boolean result = service.deleteProduct(prod);
         if(result){
                return ResponseEntity.noContent().build();
          }else{
                return ResponseEntity.notFound().build();
          }
    }
}
