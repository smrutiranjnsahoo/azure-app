package com.smruti.app.ws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smruti.app.ws.service.ProductService;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/getAllProduct")
	public String getAllProduct(){
		System.out.println("Get all Product ");
		productService.getAllProduct();
		return "Sucess";
	}

}
