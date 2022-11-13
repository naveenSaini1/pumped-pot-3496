package com.tripy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripy.customerexception.CustomerNotFoundException;
import com.tripy.models.CurrentUserSession;
import com.tripy.models.Customers;
import com.tripy.repositary.CustomerRepository;
import com.tripy.repositary.SessionDao;

@Service
public class CutomersDaoImpl implements CustomerService{

	@Autowired
	private CustomerRepository custRepository;
	
	@Autowired
	private SessionDao sessionDao;
	
	@Override
	public Customers addCustomers(Customers customer) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		 Customers cust = custRepository.save(customer);
		
		 if(cust==null) {
			 throw new CustomerNotFoundException("Please Enter Valid credentials");
		 }
		return cust;
	}

	@Override
	public Customers updateCustomer(Customers customer) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		Integer id = customer.getCustomerId();
		if(id==null) {
			throw new CustomerNotFoundException("customerId should not be null");
		}
		 Customers c = custRepository.findById(id).orElseThrow(()->new CustomerNotFoundException("Customer not found with id: "+id));
		if(customer.getCustomerName()!=null) {
		 c.setCustomerName(customer.getCustomerName());
		}
		if(customer.getEmail()!=null) {
			 c.setEmail(customer.getEmail());
		}
		if(customer.getMobile()!=null) {
		 c.setMobile(customer.getMobile());
		}
		if(customer.getPassword()!=null) {
		 c.setPassword(customer.getPassword());
		}
		return custRepository.save(c);
		
	}

	@Override
	public Customers veiwCustomerById(Integer customerId) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		 Customers c = custRepository.findById(customerId).orElseThrow(()->new CustomerNotFoundException("Customer not found with id: "+customerId));
		return c;
	}

	@Override
	public List<Customers> viewAllcustomers() throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		List<Customers> list = custRepository.findAll();
		if(list==null) {
			throw new CustomerNotFoundException("Customer List is enpty..!!");
		}
		return list;
	}

	@Override
	public List<Customers> viewCustomersList() throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		List<Customers> list = custRepository.findAll();
		if(list==null) {
			throw new CustomerNotFoundException("Customer List is enpty..!!");
		}
		return list;
	}

	@Override
	public Customers createCustomers(Customers customer) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		Customers existingCustomer = custRepository.findByEmail(customer.getEmail());
		
		if(existingCustomer != null) {
			throw new CustomerNotFoundException("Customer Already Registered with Email: "+customer.getEmail());
		}
		
		return custRepository.save(customer);
	}

	@Override
	public Customers updateCustomers(Customers customer, String ukey) throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		CurrentUserSession cu = sessionDao.findByUkey(ukey);
		if(cu==null) {
			throw new CustomerNotFoundException("Please Enter a valid key to update a customer");
		}
		
		if(customer.getCustomerId()==cu.getUserId()) {
			return custRepository.save(customer);
		}else{
			throw new CustomerNotFoundException("Invalid Customer Details, please login first");
		}
	}
	

}
