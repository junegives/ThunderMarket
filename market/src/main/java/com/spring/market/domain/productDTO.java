package com.spring.market.domain;

import java.util.Date;

/*CREATE TABLE market(
		bno INT NOT NULL AUTO_INCREMENT,
		category VARCHAR(50) NOT NULL,
		img VARCHAR(255) NOT NULL,
		content TEXT NOT NULL,
		price INT NOT NULL,
		state TINYINT DEFAULT '�Ǹ���',
		writer VARCHAR(30) NOT NULL,
		pword VARCHAR(30) NOT NULL,
		regDate TIMESTAMP NOT NULL DEFAULT NOW(),
		viewCnt INT DEFAULT 0,
		replyCnt INT DEFAULT 0,
		PRIMARY KEY(bno)
	);
*/

/*
insert into market(category, img, content, price, writer, pword)
  values('img1', 'Toys', '����1', 3000, '�ۼ���', '1234');
  
  insert into market(category, img, content, price, writer, pword)
  values('img2', 'Electronics', '����2', 10000, '�ι�°���', '1234');
  
  insert into market(category, img, content, price, writer, pword)
  values('img3', 'Fruits', '����3', 13000, '������', '1234');
  
  insert into market(category, img, content, price, writer, pword)
  values('img4', 'Toys', '����1', 3000, '�ۼ���', '1234');
  
  insert into market(category, img, content, price, writer, pword)
  values('img5', 'Electronics', '����2', 10000, '�ۼ���2', '1234');

  insert into market(category, img, content, price, writer, pword)
  values('img6', 'Fruits', '����3', 5000, '�ۼ���3', '1234');
 */

public class productDTO {

	private int bno;
	private String category;
	private String img;
	private String content;
	private int price;
	private String state;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}