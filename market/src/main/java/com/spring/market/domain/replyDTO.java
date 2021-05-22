package com.spring.market.domain;

import java.util.Date;

/*
CREATE TABLE reply (
    rno         int             not null auto_increment,
    bno         int             not null,
    writer      varchar(30) not null,
    pword		VARCHAR(30)	NOT NULL,
    content     text             not null,
    regDate     timestamp     not null default now(),
    PRIMARY KEY(rno, bno),
    FOREIGN KEY(bno) REFERENCES market(bno)
);
 */

public class replyDTO {
	
	private int rno;
	private int bno;
	private String writer;
	private String pword;
	private String content;
	private Date regDate;
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	

}
