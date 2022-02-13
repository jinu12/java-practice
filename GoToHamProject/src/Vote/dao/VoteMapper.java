package Vote.dao;

import java.util.ArrayList;
import java.util.HashMap;

import Vote.vo.Board;

/**
 * Mapper XML의 SQL문 사용 메서드
 */
public interface VoteMapper {
	//글 저장
	public int insertBoard(Board board);
	//글 목록 	
	public ArrayList<Board> selectBoardAll();
	
	public Board selectBoardOne(int num);
	//글의 조회수 증가
	
	public int updateBoard(int num);
	
	public int delectBoard(int num);
	
	public ArrayList<Board> selectBoardTitle(HashMap<String, Object> map);
	

//	public ArrayList<Board> selectBoardTitle(String word);

//	public ArrayList<Board> selectBoardName(String word);

//	public ArrayList<Board> selectBoardContent(String word);
}
