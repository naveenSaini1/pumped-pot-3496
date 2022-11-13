package com.tripy.frontcontroller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tripy.customerexception.CustomerNotFoundException;
import com.tripy.models.Customers;
import com.tripy.services.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService custService;
	
	@PostMapping("/registercustomer")
	public ResponseEntity<Customers> registerCustomer(@Valid @RequestBody Customers customer) throws CustomerNotFoundException{
//		Customers c = custService.addCustomers(customer);
		Customers c = custService.createCustomers(customer);
		return new ResponseEntity<Customers>(c,HttpStatus.OK);
	}
	
	@PutMapping("/updatecustomer")
	public ResponseEntity<Customers> updateCustomer(@RequestBody Customers customers) throws CustomerNotFoundException{
		
		Customers c = custService.updateCustomer(customers);
		
		return new ResponseEntity<Customers>(c,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/veiwcustomer/{id}")
	public ResponseEntity<Customers> veiwCustomerById(@PathVariable("id") Integer id) throws CustomerNotFoundException{
		
		Customers c = custService.veiwCustomerById(id);
		
		return new ResponseEntity<Customers>(c,HttpStatus.OK);
	}
	
	@GetMapping("/viewallcustomers")
	public ResponseEntity<List<Customers>> veiwAllCustomer() throws CustomerNotFoundException{
		
		List<Customers> list = custService.viewAllcustomers();
		
		return new ResponseEntity<List<Customers>>(list,HttpStatus.OK);
	}
	
	
	@PutMapping("/updatecustomerLog/{key}")
	public ResponseEntity<Customers> updateCustomerLog(@RequestBody Customers customers,@PathVariable("key")String key) throws CustomerNotFoundException{
		
		Customers c = custService.updateCustomers(customers,key);
		
//		Customers c = customers;
		
		return new ResponseEntity<Customers>(c,HttpStatus.ACCEPTED);
		
	}
	
}
