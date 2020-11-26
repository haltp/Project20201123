package com.yedam.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	Connection conn = null;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;

	// 1. 리스트
	public List getBoList() {
		conn = DAO.getConnection();
		sql = "select * from board";
		List list = new ArrayList();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardVO vo = new BoardVO();
				vo.setBoardno(rs.getInt("board_no"));
				vo.setTitle(rs.getString("title"));
				vo.setWriter(rs.getString("writer"));
				vo.setCreationdate(rs.getString("creation_date"));

				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;

	}

	// 2. 상세화면(글번호3번)
	public BoardVO getBo(int boId) {
		conn = DAO.getConnection();
		sql = "select * from board where board_no = ?";
		BoardVO vo = new BoardVO();

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boId);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo.setBoardno(rs.getInt("board_no"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setWriter(rs.getString("writer"));
				vo.setCreationdate(rs.getString("creation_date"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return vo;

	}

	// 3. 등록
	public void insertBo(BoardVO vo) {
		conn = DAO.getConnection();
		String sql = "insert into board(board_no, title, content, writer, creation_date) values(?, ?, ?, ?, sysdate)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getBoardno());
			pstmt.setString(2, vo.getTitle());
			pstmt.setString(3, vo.getContent());
			pstmt.setString(4, vo.getWriter());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 입력됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 4. 삭제
	public void deleteBo(BoardVO vo) {
		conn = DAO.getConnection();
		String sql = "delete from board where board_no = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getBoardno());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 삭제됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 5. 수정
	public void updateBo(BoardVO vo) {
		conn = DAO.getConnection();
		String sql = "update board set title = ? content =? where board_no =?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setInt(3, vo.getBoardno());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 수정됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}

