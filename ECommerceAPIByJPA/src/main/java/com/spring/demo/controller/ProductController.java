package com.spring.demo.controller;

import java.util.ArrayList;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.model.Product;
import com.spring.demo.serviceimpl.ProductServiceImpl;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/ecommerce")
public class ProductController {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ProductServiceImpl productServiceImpl;
	
	
	/**
	 * @param product
	 * @return
	 */
	@PostMapping("/products")
	ResponseEntity<Product> addproductDetails(@Valid @RequestBody Product product) {
		LOGGER.info("inside ProductController.addProductDetails() method");
		Product prod=productServiceImpl.addProduct(product);
		LOGGER.info("demo of logger");
		return new  ResponseEntity<Product>(prod,HttpStatus.ACCEPTED);
	}
	
	/**
	 * @return
	 */
	@GetMapping("/products")
	ArrayList<Product> getProductDetails() {
		LOGGER.info("inside ProductController.getProductDetails() method");
		ArrayList<Product> listofProduct=productServiceImpl.ListOfProducts();
		LOGGER.info("getProductDetails logger");
		return listofProduct;
	}
	
	/**
	 * @param product
	 * @return
	 */
	@PutMapping("/products")
	ResponseEntity<Product> updateProductsDetails(@Valid @RequestBody Product product) {
		LOGGER.info("inside ProductController.updateProductsDetails(Product product); method");
		Product product2=productServiceImpl.updateProduct(product);
		return new  ResponseEntity<Product>(product2,HttpStatus.ACCEPTED);
	}
	
	//For delete the record from the database 
	/**
	 * @param id
	 */
	@DeleteMapping("/products/{id}")
	public void deleteProductById(@Valid @PathVariable("id") Integer id) {
		LOGGER.info("inside ProductController.deleteProductById(id) method");
		productServiceImpl.deleteProductById(id);
	}
}
