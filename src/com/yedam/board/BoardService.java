package com.yedam.board;

import java.util.List;

public interface BoardService {
	//1. 리스트 2. 상세화면(글번호3번) 3. 등록 4. 삭제 5. 수정
	public List getBoList(); //리스트
	public BoardVO getBo(int boId); //상세화면
	public void insertBo(BoardVO boVO); //등록
	public void deleteBo(BoardVO vo); //삭제
	public void updateBo(BoardVO boVO); //수정
}
