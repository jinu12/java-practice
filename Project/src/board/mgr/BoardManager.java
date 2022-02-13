package board.mgr;

import java.util.ArrayList;

import board.vo.Board;
import vote.dao.BoardDAO;

public class BoardManager {
	
	private BoardDAO dao = new BoardDAO();
	
	//�� ����
	public boolean insertBoard(Board board) {
			int cnt = dao.insertBoard(board);
			if(cnt > 0) {
				return true;
			}
			return false;
		}

	//�� ���
	public ArrayList<Board> ListBoard() {
		return dao.ListBoard();
	}
	
	//1���� �� �а� ��ȸ�� ����
	public Board readBoard(int num) {
		return dao.readBoard(num);
	}
	
	//1���� �ۻ���
	public boolean deleteBoard(int num) {
		int cnt = dao.deleteBoard(num);
		if(cnt > 0) {
			return true;
		}
		return false;
	}

	//�� �˻�
	public ArrayList<Board> searchBoard(String word) {
		return dao.searchBoard(word);
	}
}
