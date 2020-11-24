package com.yedam.interfaces;

public class MysqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Mysql에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("Mysql에서 삽입");
	}

	@Override
	public void update() {
		System.out.println("Mysql에서 수정");
	}

	@Override
	public void delete() {
		System.out.println("Mysql에서 삭제");
	}

}
