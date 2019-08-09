package com.skcc.mbr.saga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skcc.mbr.saga.domain.customer.Customer;
import com.skcc.mbr.saga.service.CustomerService;

import io.swagger.annotations.Api;

@EnableAutoConfiguration
@Api(value="main", description="Entry test controller")
@RequestMapping("/entry")
@RestController
public class CustomerController {
	
	@Autowired 
	CustomerService customerService;
	
	@RequestMapping(value="getAllCustomer", method=RequestMethod.GET)
	public List<Customer> getAllCustomer(){
		return customerService.getAllCustomer(); 
	}
	
	@RequestMapping(value="insertCustomer", method=RequestMethod.GET)
	public Object insertCustomer(String custId, String custName, String grade) {
		return customerService.insertCustomer(custId, custName, grade);
	}
}
