package com.springcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcrud.entity.Product;
import com.springcrud.service.InventoryService;

@RestController
@RequestMapping("/app") //identification of what is our application
public class InventoryController {
	//controller need service dependency
	@Autowired
	private InventoryService service;
	
	//webservices/RestApi
	//1.webservice for insert
	@PostMapping("/insert")   //for insert used in webservices
	public ResponseEntity<Product>saveData(@RequestBody Product p) {
		Product p1=service.insert(p);
		return ResponseEntity.ok(p1);
		
	}
	//2.webservice for readingall products
	@GetMapping("/readall")
	public List<Product> readAllProducts() {
		List<Product> allProducts = service.readAllProducts();
		return allProducts;
		
	}
	//3.webservice for deleting one product
	@DeleteMapping("/deleteone/{pid}")
	public void deleteProduct(@PathVariable int pid){
		service.deleteProduct(pid);
		
	}
	//4.webservice for updating one product
	@PutMapping("/update/{id}")
	public Product updateProduct(@PathVariable int id,@RequestBody Product np) {
		Product up = service.updateProduct(id, np);
		return up;
	}

}
