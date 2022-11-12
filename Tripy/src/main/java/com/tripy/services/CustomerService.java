package com.tripy.services;

import java.util.List;

import com.tripy.customerexception.CustomerNotFoundException;
import com.tripy.models.Customers;

public interface CustomerService {
	public Customers addCustomers(Customers customer)throws CustomerNotFoundException ;
	public Customers updateCustomer(Customers customer)throws CustomerNotFoundException;
	public Customers veiwCustomerById(Integer customerId)throws CustomerNotFoundException;
	public List<Customers> viewAllcustomers()throws CustomerNotFoundException;
	public List<Customers> viewCustomersList()throws CustomerNotFoundException;
	public Customers createCustomers(Customers customer)throws CustomerNotFoundException ;
	public Customers updateCustomers(Customers customer,String key)throws CustomerNotFoundException;
}
