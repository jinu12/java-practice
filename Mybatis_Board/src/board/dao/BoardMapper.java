package board.dao;

import java.util.ArrayList;

import board.vo.Board;

/**
 * Mapper XML의 SQL문 사용 메서드
 */
public interface BoardMapper {
	//글 저장
	public int insertBoard(Board board);
	//글 목록 	
	public ArrayList<Board> selectBoardAll();
	//글 읽기
	public Board selectBoardOne(int num);
	//글의 조회수 증가
	
	public int updateBoard(int num);
	
	public int delectBoard(int num);
	//글 삭제
	public ArrayList<Board> selectBoardTitle(String word);
	//글 검색	
}
