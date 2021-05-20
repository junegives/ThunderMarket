package com.spring.market.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.market.dao.marketDAO;
import com.spring.market.domain.productDTO;

// Service
// deals with business logic
// inherited from the controller.
@Service
public class marketServiceImpl implements marketService {

	@Inject
	private marketDAO dao;

	// Have DAO get the list of products and return the result.
	@Override
	public List<productDTO> getList() throws Exception {

		return dao.getList();
	}

	// Call DAO method to put the value of the product DTO into the DB.
	@Override
	public void write(productDTO dto) throws Exception {

		dao.write(dto);

	}

	// Call DAO method to view the productDTO from DB.
	@Override
	public productDTO view(int bno) throws Exception {
		// TODO Auto-generated method stub
		return dao.view(bno);
	}

	// Call DAO method to modify value of the product DTO in DB.
	@Override
	public void modify(productDTO dto) throws Exception {
		// TODO Auto-generated method stub
		dao.modify(dto);
	}

	 // Call DAO method to delete the product DTO in DB.
	@Override
	public void delete(int bno) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(bno);
	}

	 // Call DAO method to get the number of product DTO in DB.
	@Override
	public int count() throws Exception {
		// TODO Auto-generated method stub
		return dao.count();
	}

	 // Call DAO method to get the list of product with paging.
	@Override
	public List<productDTO> paging(int current, int cntPerPage) throws Exception {
		// TODO Auto-generated method stub
		return dao.paging(current, cntPerPage);
	}

}