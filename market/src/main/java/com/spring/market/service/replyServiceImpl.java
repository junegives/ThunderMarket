package com.spring.market.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.market.dao.replyDAO;
import com.spring.market.domain.replyDTO;

@Service
public class replyServiceImpl implements replyService {

	@Inject
	private replyDAO dao;
	
	@Override
	public List<replyDTO> replyList(int bno) throws Exception {
		// TODO Auto-generated method stub
		return dao.replyList(bno);
	}

	@Override
	public void replyWrite(replyDTO dto) throws Exception {
		// TODO Auto-generated method stub
		dao.replyWrite(dto);
	}

	@Override
	public void replyModify(replyDTO dto) throws Exception {
		// TODO Auto-generated method stub
		dao.replyModify(dto);
	}

	@Override
	public void replyDelete(replyDTO dto) throws Exception {
		// TODO Auto-generated method stub
		dao.replyDelete(dto);
	}

}
