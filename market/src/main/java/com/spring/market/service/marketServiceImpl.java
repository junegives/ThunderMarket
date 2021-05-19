package com.spring.market.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.market.dao.marketDAO;
import com.spring.market.domain.productDTO;

@Service
public class marketServiceImpl implements marketService {

	@Inject
	private marketDAO dao;

	@Override
	public List<productDTO> getList() throws Exception {

		return dao.getList();
	}

}