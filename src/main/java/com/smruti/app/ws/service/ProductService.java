package com.smruti.app.ws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smruti.app.ws.domain.Product;
import com.smruti.app.ws.repository.ProductRepository;

@Service
public class ProductService {
	
	//@Autowired
    //private ProductRepository productRepository;
	
	public List<Product> getAllProduct() {
		//return productRepository.findAll();
		System.out.println("Call service");
		return null;
	}

}
