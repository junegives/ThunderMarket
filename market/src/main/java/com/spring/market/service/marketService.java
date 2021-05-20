package com.spring.market.service;

import java.util.List;

import com.spring.market.domain.productDTO;


//Service
//deals with business logic
//inherited from the controller.
public interface marketService {

	// Have DAO get the list of products and return the result.
	 public List<productDTO> getList() throws Exception; 
	 
	 // Call DAO method to put the value of the product DTO into the DB.
	 public void write(productDTO dto) throws Exception;
	 
	 // Call DAO method to view the productDTO from DB.
	 public productDTO view(int bno) throws Exception;

	 // Call DAO method to modify value of the product DTO in DB.
	 public void modify(productDTO dto) throws Exception;

	 // Call DAO method to delete the product DTO in DB.
	 public void delete(int bno) throws Exception;

	 // Call DAO method to get the number of product DTO in DB.
	 public int count() throws Exception;
	 
	// Call DAO method to get the list of products with paging.
	 public List<productDTO> paging(int current, int cntPerPage) throws Exception;
}