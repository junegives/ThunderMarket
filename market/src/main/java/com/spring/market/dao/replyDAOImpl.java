package com.spring.market.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.market.domain.replyDTO;

//Data Access Object
//Access the database(reply) to select or insert the data(reply).
@Repository
public class replyDAOImpl implements replyDAO {
	
	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.spring.reply.mappers";

	// Get reply list from DB
	@Override
	public List<replyDTO> replyList(int bno) throws Exception {
		// TODO Auto-generated method stub
		return sql.selectList(namespace + ".reply", bno);
	}

	// Write the reply to DB
	@Override
	public void replyWrite(replyDTO dto) throws Exception {
		// TODO Auto-generated method stub
		sql.insert(namespace + ".replyWrite", dto);
	}

	// Modify the reply in DB
	@Override
	public void replyModify(replyDTO dto) throws Exception {
		// TODO Auto-generated method stub
		sql.update(namespace + ".replyModify", dto);
	}

	// Delete the reply in DB
	@Override
	public void replyDelete(replyDTO dto) throws Exception {
		// TODO Auto-generated method stub
		sql.delete(namespace + ".replyDelete", dto);
	}

}