package com.skcc.mbr.saga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skcc.mbr.saga.domain.customer.Customer;
import com.skcc.mbr.saga.domain.customer.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomer(){
		List<Customer> list = customerRepository.findAll(); 
		return list; 
	}
	
	public Object insertCustomer(String custId, String custName, String grade) {
		Customer customer = Customer.builder().cust_id(custId).cust_name(custName).grade(grade).build();
		return customerRepository.save(customer);
	}
}
