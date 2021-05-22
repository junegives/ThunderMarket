package com.spring.market.service;

import java.util.List;

import com.spring.market.domain.replyDTO;

//Service
//deals with business logic
//inherited from the controller.
public interface replyService {
	
	// Get reply list from DB
	public List<replyDTO> replyList(int bno) throws Exception;

	// Write the reply to DB
	public void replyWrite(replyDTO dto) throws Exception;

	// Modify the reply in DB
	public void replyModify(replyDTO dto) throws Exception;

	// Delete the reply in DB
	public void replyDelete(replyDTO dto) throws Exception;
}
