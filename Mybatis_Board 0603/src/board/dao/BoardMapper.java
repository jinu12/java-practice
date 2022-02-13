package board.dao;

import java.util.ArrayList;
import java.util.HashMap;

import board.vo.Board;

/**
 * Mapper XML�� SQL�� ��� �޼���
 */
public interface BoardMapper {
	//�� ����
	public int insertBoard(Board board);
	//�� ��� 	
	public ArrayList<Board> selectBoardAll();
	
	public Board selectBoardOne(int num);
	//���� ��ȸ�� ����
	
	public int updateBoard(int num);
	
	public int delectBoard(int num);
	
	public ArrayList<Board> selectBoardTitle(HashMap<String, Object> map);
	

//	public ArrayList<Board> selectBoardTitle(String word);

//	public ArrayList<Board> selectBoardName(String word);

//	public ArrayList<Board> selectBoardContent(String word);
}
