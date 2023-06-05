package com.practice.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductMain {
	public static void main(String[] args) {
		Map<String,List<Product>> userIdToProductListMap=new HashMap<>();
		
		// Create products
        Product product1 = new Product("P1", "Product 1");
        Product product2 = new Product("P2", "Product 2");
        Product product3 = new Product("P3", "Product 3");

        // Create a list of products for user1
        List<Product> user1ProductList = new ArrayList<>();
        user1ProductList.add(product1);
        user1ProductList.add(product2);
        
     // Create a list of products for user2
        List<Product> user2ProductList = new ArrayList<>();
        user2ProductList.add(product3);

        // Add product lists to the HashMap
        userIdToProductListMap.put("User1", user1ProductList);
        userIdToProductListMap.put("User2", user2ProductList);
        
        String userId = "User1";
        List<Product> productList = userIdToProductListMap.get(userId);

        for (Product product : productList) {
            System.out.println("Product ID: " + product.getProductId() + ", Name: " + product.getProductName());
        }
	}

}
