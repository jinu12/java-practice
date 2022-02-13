package board.mgr;

import java.util.ArrayList;

import board.vo.Board;
import vote.dao.BoardDAO;

public class BoardManager {
	
	private BoardDAO dao = new BoardDAO();
	
	//글 저장
	public boolean insertBoard(Board board) {
			int cnt = dao.insertBoard(board);
			if(cnt > 0) {
				return true;
			}
			return false;
		}

	//글 목록
	public ArrayList<Board> ListBoard() {
		return dao.ListBoard();
	}
	
	//1개의 글 읽고 조회수 증가
	public Board readBoard(int num) {
		return dao.readBoard(num);
	}
	
	//1개의 글삭제
	public boolean deleteBoard(int num) {
		int cnt = dao.deleteBoard(num);
		if(cnt > 0) {
			return true;
		}
		return false;
	}

	//글 검색
	public ArrayList<Board> searchBoard(String word) {
		return dao.searchBoard(word);
	}
}
