package com.springcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springcrud.entity.Product;

@Repository
public interface InventoryRepository extends JpaRepository<Product, Integer>{
	
	//as a programmer we can write required methods with logic for saving,reading,updating,deleting
	//but it is not needed jpa repo will write
	//inherit the interface becoz spring jpa is an interface

}
