package com.spring.market.dao;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.market.domain.productDTO;

//Data Access Object
//Access the database(market) to select or insert the data(product).
@Repository
public class marketDAOImpl implements marketDAO {
	
	@Inject
	private SqlSession sql;

	// namespace specified in the mapper
	private static String namespace = "com.spring.market.mappers";

	// Get product list from DB
	@Override
	public List<productDTO> getList() throws Exception {

		return sql.selectList(namespace + ".product");
	}
	

	// Write product to DB
	public void write(productDTO dto) throws Exception{
		
		sql.insert(namespace + ".write", dto);
		
	}

	// View the product from DB
	@Override
	public productDTO view(int bno) throws Exception {
		// TODO Auto-generated method stub
		return sql.selectOne(namespace + ".view", bno);
	}

	// Modify the product in DB
	@Override
	public void modify(productDTO dto) throws Exception {
		// TODO Auto-generated method stub
		sql.update(namespace + ".modify", dto);
	}


	// Delete the product in DB
	@Override
	public void delete(int bno) throws Exception {
		// TODO Auto-generated method stub
		sql.delete(namespace + ".delete", bno);
	}

	// Get the number of product in DB
	@Override
	public int count() throws Exception {
		// TODO Auto-generated method stub
		return sql.selectOne(namespace + ".count");
	}

	// Get product list with paging from DB
	@Override
	public List<productDTO> paging(int current, int cntPerPage) throws Exception {
		// TODO Auto-generated method stub
		 HashMap<String, Integer> data = new HashMap();
		  
		 data.put("current", current);
		 data.put("cntPerPage", cntPerPage);
		  
		 return sql.selectList(namespace + ".paging", data);
	}

}