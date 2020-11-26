package com.yedam.board;

import java.util.List;
import java.util.Scanner;

public class BoardMain {
	public static void main(String[] args) {
		//1. 리스트 2. 상세화면(글번호3번) 3. 등록 4. 삭제 5. 수정
		Scanner scn = new Scanner(System.in);
		BoardService service = new BoardServiceImpl();
		
		while (true) {
			System.out.println("------------------------------------");
			System.out.println("1. 리스트 2. 상세화면 3. 등록 4. 삭제 5. 수정");
			System.out.println("------------------------------------");
			int selectNo = scn.nextInt();
			
			if(selectNo == 1) {
				List list = service.getBoList();
				for (Object vo : list) {
					BoardVO bod = (BoardVO) vo;
					bod.showBoInfo();
				}
			}else if(selectNo == 2) {
				System.out.println("조회할 글 번호: ");
				int boId = scn.nextInt();
				BoardVO vo = service.getBo(boId);
				vo.showBBoInfo();
								
			}else if(selectNo == 3) {
				System.out.println("등록할 글 번호: ");
				int boardno = scn.nextInt(); scn.nextLine();
				System.out.println("등록할 이름: ");
				String writer = scn.nextLine();
				System.out.println("등록할 제목: ");
				String title = scn.nextLine();
				System.out.println("등록할 내용: ");
				String content = scn.nextLine();
				
				BoardVO vo = new BoardVO();
				vo.setBoardno(boardno);
				vo.setWriter(writer);
				vo.setTitle(title);
				vo.setContent(content);
				
				service.insertBo(vo);
				
				
			}else if(selectNo == 4) {
				System.out.println("삭제할 글 번호: ");
				int boardno = scn.nextInt(); scn.nextLine();
				BoardVO vo = new BoardVO();
				vo.setBoardno(boardno);
				
				service.deleteBo(vo);
				
				
			}else if(selectNo == 5) {
				System.out.println("수정할 글 번호: ");
				int boardno = scn.nextInt();scn.nextLine();
				System.out.println("수정할 제목: ");
				String title = scn.nextLine();
				System.out.println("수정할 내용: ");
				String content = scn.nextLine();
				
				BoardVO vo = new BoardVO();
				vo.setBoardno(boardno);
				vo.setTitle(title);
				vo.setContent(content);
				
				service.updateBo(vo);
				
			}
			
		}
		
	}
}
