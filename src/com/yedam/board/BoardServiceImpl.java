package com.yedam.board;

import java.util.List;

public class BoardServiceImpl implements BoardService{
	
	BoardDAO dao = new BoardDAO();

	@Override
	public List getBoList() {
		return dao.getBoList();
	}

	@Override
	public BoardVO getBo(int boId) {
		return dao.getBo(boId);
	}

	@Override
	public void insertBo(BoardVO boVO) {
		dao.insertBo(boVO);
	}

	@Override
	public void deleteBo(BoardVO boVO) {
		dao.deleteBo(boVO);
	}

	@Override
	public void updateBo(BoardVO boVO) {
		dao.updateBo(boVO);
	}

	
}
