package com;

 

import java.util.List;

 

///import javax.websocket.server.PathParam;

 

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

 

@RestController

 

public class Rest {
    

OrderService orderService = new OrderService();///// FOR ORDER

ProductService productService= new ProductService();/// FOR PRODUCT

 

// RETRIEVE ORDER INFO USING @GET MEthod


@GetMapping("/orderinfo")
public Order getDummyOrder() {

 Order o = new Order(); // creating java object
o.setId(2);
o.setUserid(1001);
o.setTid(423433);
o.setTotal(3483483.4);
o.setPromo("HDYEGE");
o.setDiscount(100);
o.setStatus(0);
o.setCreatedAt("Jan2020");
o.setModifiedAt("Jan2021");

return o;
}





//RETRIEVE PRODUCT INFO USING @GET MEthod
@GetMapping("/ProductInfo")
public Product getDummyProduct(){
	Product p = new Product();// creating java product
	p.setId(2);
	p.setQuantity(100);
	p.setCategory("laptop");
	p.setName("pavilion");
	p.setBrand("HP");
	p.setDescription("good laptop for work");
	p.setPrice(50000);
	p.setDiscount(500);
	p.setStatus(1);
	return p;
	
}



 

 // RETRIEVE THE ORDER INFO BY ID 

 

 @GetMapping("/orderinfoid/{id}")
public Order getDummyOrderById(@PathVariable("id") Integer id) {

 

  Order o = new Order(); // creating java object
  o.setId(2);
  o.setUserid(1001);
  o.setTid(423433);
  o.setTotal(3483483.4);
  o.setPromo("HDYEGE");
  o.setDiscount(100);
  o.setStatus(0);
  o.setCreatedAt("Jan2020");
  o.setModifiedAt("Jan2021");

 return o;

}
 
 
 
 
 
 
 
 // RETRIEVE THE PRODUCT INFO BY ID 
 

 @GetMapping("/productinfoid/{id}")
public Product getDummyProductById(@PathVariable("id") Integer id) {
	 
	 
		Product p = new Product();// creating java product
		p.setId(2);
		p.setQuantity(100);
		p.setCategory("laptop");
		p.setName("pavilion");
		p.setBrand("HP");
		p.setDescription("good laptop for work");
		p.setPrice(50000);
		p.setDiscount(500);
		p.setStatus(1);
	return p;
	 
 }

 

 
 
 


 // ADD THE ORDER INFORMATION BY POST 

 

 @PostMapping(value = "/insertorderdetails")
public Order insertDummyOrder(@RequestBody Order order) {
return orderService.addOrder(order); //calling the service
}
 
 
 
 
 
 

 // ADD THE PRODUCT INFORMATION BY POST

 
 @PostMapping(value = "/insertproductdetails")
public Product insertDummyProduct(@RequestBody Product product) {
return productService.addProduct(product); //calling the service
}

 
 
 
 
 

//UPDATE ORDER INFO
 
@PutMapping("/updateorder")
public Order updateorderInfo(@RequestBody Order order) {
return orderService.updateOrder(order);

 }








//UPDATE PRODUCT INFO

@PutMapping("/updateproduct")
public Product updateProductInfo(@RequestBody Product product) {
	
return productService.updateProduct(product);

}
 






//GET ORDER LIST

@GetMapping("/getorderlist")
public List<Order> getDummyOrderList() {
List<Order> listOfOrder = orderService.getAllOrderlist();
return listOfOrder;
}






//GET PRODUCT LIST

@GetMapping("/getproductlist")
public List<Product> getDummyProductList() {
List<Product> listOfProduct = productService.getAllProductlist();
return listOfProduct;
}


 




// DELETE ORDER LIST

@DeleteMapping ("/deleteorder/{id}")
public List<Order> deleteOrderById(@PathVariable Integer id) {
new OrderService().deleteOrder(id);
return new OrderService().getAllOrderlist();
}







//DELETE PRODUCT LIST


@DeleteMapping ("/deleteproduct/{id}")
public List<Product> deleteProductById(@PathVariable Integer id) {
new ProductService().deleteProduct(id);
return new ProductService().getAllProductlist();
}

 


}