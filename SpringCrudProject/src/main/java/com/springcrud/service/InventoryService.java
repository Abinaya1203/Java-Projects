package com.springcrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcrud.entity.Product;
import com.springcrud.repository.InventoryRepository;

@Service
public class InventoryService {
	//service layer needs repository object
	//add repository dependencies
	@Autowired  //used to inject dependency in spring boot 
	private InventoryRepository repository;
	//logic
	//insert method
	
	public Product insert(Product p) {
		
		Product p1=repository.save(p);
		return p1;
		
		
	}
	//method to read all products data
	public List<Product> readAllProducts() {
		List<Product> all = repository.findAll();
		return all;
		
		
	}
	//method to delete a product
		public void deleteProduct(int id) {
			//service communicate with repo
		repository.deleteById(id);
			
		}
		//method to update a product
		public Product updateProduct(int id,Product np) {
			Optional<Product> temp = repository.findById(id);
			if(temp.isPresent()) {
				Product op = temp.get();
				op.setPname(np.getPname());
				op.setPquantity(np.getPquantity());
				op.setPprice(np.getPprice());
				return repository.save(op);
				
			}
			else {
				throw new RuntimeException("Product not found");
			}
		}
	

}
