package com.spring.market.dao;

import java.util.List;

import com.spring.market.domain.productDTO;

// Data Access Object
// Access the database(market) to select or insert the data(product).
public interface marketDAO {
	
	// Get product list from DB
	public List<productDTO> getList() throws Exception;
	
	// Write product to DB
	public void write(productDTO dto) throws Exception;
	
	// View the product from DB
	public productDTO view(int bno) throws Exception;
	
	// Modify the product in DB
	public void modify(productDTO dto) throws Exception;

}
