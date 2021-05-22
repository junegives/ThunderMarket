package com.spring.market.dao;

import java.util.List;

import com.spring.market.domain.replyDTO;

//Data Access Object
//Access the database(reply) to select or insert the data(reply).
public interface replyDAO {

	// Get reply list from DB
	public List<replyDTO> replyList(int bno) throws Exception;

	// Write the reply to DB
	public void replyWrite(replyDTO dto) throws Exception;

	// Modify the reply in DB
	public void replyModify(replyDTO dto) throws Exception;

	// Delete the reply in DB
	public void replyDelete(replyDTO dto) throws Exception;
}
