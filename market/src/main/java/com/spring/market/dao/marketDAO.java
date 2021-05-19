package com.spring.market.dao;

import java.util.List;

import com.spring.market.domain.productDTO;

public interface marketDAO {
	
	public List<productDTO> getList() throws Exception;

}
