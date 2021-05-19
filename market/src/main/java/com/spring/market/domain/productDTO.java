package com.spring.market.domain;

import java.util.Date;

/*CREATE TABLE board(
		bno INT NOT NULL AUTO_INCREMENT,
		img VARCHAR(255) NOT NULL,
		content TEXT NOT NULL,
		price INT NOT NULL,
		writer VARCHAR(30) NOT NULL,
		pword VARCHAR(30) NOT NULL,
		regDate TIMESTAMP NOT NULL DEFAULT NOW(),
		viewCnt INT DEFAULT 0,
		replyCnt INT DEFAULT 0,
		PRIMARY KEY(bno)
	);
*/
public class productDTO {

	private int bno;
	private String img;
	private String content;
	private int price;
	private String writer;
	private String pword;
	private Date regDate;
	private int viewCnt;
	private int replyCnt;

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPword() {
		return pword;
	}

	public void setPword(String pword) {
		this.pword = pword;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public int getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

	public int getReplyCnt() {
		return replyCnt;
	}

	public void setReplyCnt(int replyCnt) {
		this.replyCnt = replyCnt;
	}
}