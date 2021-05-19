package com.spring.market.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class marketDAOImpl implements marketDAO {
	@Inject
	private SqlSession sql;

	private static String namespace = "com.spring.market.mappers";

	// 게시물 목록
	@Override
	public List getList() throws Exception {

		return sql.selectList(namespace + ".product");
	}

}