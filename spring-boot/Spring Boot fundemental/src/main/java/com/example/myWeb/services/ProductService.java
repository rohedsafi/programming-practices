package com.example.myWeb.services;

import com.example.myWeb.model.Product;
import com.example.myWeb.repository.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.Arrays;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;
     // this was manual data , before we start spring JPA
//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101 ,"Iphone", 2000),
//            new Product(102,"Samsung", 1500),
//            new Product(103 , "Nokia", 500)));


    public List<Product> getProducts(){
       // return products; // before
        return repo.findAll();
    }

    public Optional<Product> getProductById(int prodId){
    //    return products.stream().filter(p -> p.getProdId() == prodId).findFirst().get(); // before
        return repo.findById(prodId);
    }

    public Product addProduct(Product prod){
//         products.add(prod);
        return repo.save(prod);
    }

    public void updateProduct(Product prod) {
//        int index = -1;
//        for(int i = 0 ; i < products.size(); i++) {
//            if (products.get(i).getProdId() == prod.getProdId()) {
//                index = i;
//                break;
//            }
//        }
//        if(index != -1){
//            products.set(index, prod);
//        }else{
//            throw new RuntimeException("this product is not exist to update" + prod);
//        }
        repo.save(prod);
    }

    public boolean deleteProduct(int prod){
//        int index = - 1;
//
//        for(int i = 0 ; i < products.size(); i++) {
//            if (products.get(i).getProdId() == prod) {
//                index = i;
//                break;
//            }
//
//        }
//       if(index != -1){
//           products.remove(index);
//       }else {
//           throw new RuntimeException("the product is not found to delete" + prod);
//       }
       return repo.findById(prod).map(exist ->{
        repo.delete(exist);
        return true;
       })
       .orElse(false);

    }
}
