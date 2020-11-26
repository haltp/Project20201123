package com.yedam.board;

public class BoardVO {
	private int boardno;
	private String title;
	private String content;
	private String writer;
	private String creationdate;

	// 생성자 마우스 - 소스 - 어쩌고 필드
	public BoardVO(int boardno, String title, String content, String writer, String creationdate) {
		super();
		this.boardno = boardno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.creationdate = creationdate;
	}

	public BoardVO() {

	}

	public int getBoardno() {
		return boardno;
	}

	public void setBoardno(int boardno) {
		this.boardno = boardno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getCreationdate() {
		return creationdate;
	}

	public void setCreationdate(String creationdate) {
		this.creationdate = creationdate;
	}

	public void showBoInfo() {
		System.out.println("글번호:" + boardno + " 제목:" + title + " 작성자:" + writer + " 작성일자:" + creationdate);
	}

	public void showBBoInfo() {
		System.out.println("글번호: " + boardno);
		System.out.println("제목: " + title);
		System.out.println("내용: " + content);
		System.out.println("작성자: " + writer);
		System.out.println("작성일자: " + creationdate);

	}

}
