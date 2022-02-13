package Vote.mgr;

import java.util.ArrayList;
import java.util.HashMap;

import Vote.dao.VoteDAO;
import Vote.vo.Board;

public class VoteManager {
	
	private VoteDAO dao = new VoteDAO();
	
	//�� ����
	public boolean insertBoard(Board board) {
		int cnt = dao.insertBoard(board);
		if(cnt > 0) {
			return true;
		}
		return false;
	}

	//�� ���
	public ArrayList<Board> listBoard() {
		return dao.listBoard();
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
	public ArrayList<Board> searchBoard(String word, int type) {
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("type", type);
		map.put("word", word);
		
		return dao.searchBoard(map);
		
	}
//	public ArrayList<Board> searchBoard(String word, int type) {
//		return dao.searchBoard(word);
//	}
//	public ArrayList<Board> searchBoard2(String word, int type) {
//		return dao.searchBoard2(word);
//	}
//	public ArrayList<Board> searchBoard3(String word, int type) {
//		return dao.searchBoard3(word);
//	}
	
}
