/*
 * package com.app.controller;
 * 
 * import java.util.List; import java.util.Optional;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.DeleteMapping; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.PutMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.app.pojos.Products; import com.app.service.IProductService;
 * 
 * @RestController // => @Controller at class level + //@ResponseBody annotation
 * added on return types of all request handling methods
 * 
 * @RequestMapping("/products") public class ProductController { // dependency
 * 
 * @Autowired private IProductService service;
 * 
 * public ProductController() { System.out.println("in ctor of " +
 * getClass().getName()); }
 * 
 * // RESTful end point or API end point or API provider
 * 
 * @GetMapping public ResponseEntity<?> listAllProducts() {
 * System.out.println("in list all products"); // invoke service layer's method
 * : controller --> service impl (p) --->JPA // repo's impl class(SC)
 * List<Products> products = service.getAllProducts(); if (products.isEmpty())
 * // empty product list : set sts code : HTTP 204 (no contents) return new
 * ResponseEntity<>(HttpStatus.NO_CONTENT); // in case of non empty list : OK,
 * send the list return new ResponseEntity<>(products, HttpStatus.OK); }
 * 
 * // get prduct details by its name : supplied by clnt using path var
 * 
 * @GetMapping("/{productName}") public ResponseEntity<?>
 * getProductDetails(@PathVariable String productName) {
 * System.out.println("in get prod details " + productName); // invoke service
 * method Optional<Products> productDetails =
 * service.getProductDetails(productName); // valid name : HTTP 200 , marshalled
 * product details if (productDetails.isPresent()) return new
 * ResponseEntity<>(productDetails.get(), HttpStatus.OK); // in case of invalid
 * name : HTTP 404 return new ResponseEntity<>(HttpStatus.NOT_FOUND); }
 * 
 * // req handling method to create a new product : post
 * 
 * @PostMapping public ResponseEntity<?> addProduct(@RequestBody Products p) {
 * System.out.println("in add product " + p); try { Products savedProduct =
 * service.addProductDetails(p); return new ResponseEntity<>(savedProduct,
 * HttpStatus.OK);
 * 
 * } catch (RuntimeException e) { e.printStackTrace(); return new
 * ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); } }
 * 
 * // req handling method to update existing product
 * 
 * @PutMapping("/{productId}") public ResponseEntity<?>
 * updateProductDetails(@PathVariable int productId, @RequestBody Products p) {
 * System.out.println("in update " + productId + " " + p); try { Products
 * updatedDetails = service.updateProductDetails(productId, p); return new
 * ResponseEntity<>(updatedDetails, HttpStatus.OK); } catch (RuntimeException e)
 * { e.printStackTrace(); return new ResponseEntity<>(HttpStatus.NOT_FOUND); } }
 * 
 * // request handling method to delete existing product
 * 
 * @DeleteMapping("/{pid}") public String deleteProduct(@PathVariable int pid) {
 * System.out.println("in delete product"+pid); return
 * service.deleteProduct(pid); }
 * 
 * }
 */