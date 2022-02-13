package vote.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import board.vo.Board;

public class VoteDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // 마이바티스 객체
	
	//글 저장
	public int insertBoard(Board board) {
		SqlSession session = null;
		int cnt = 0;
		try {
			session = factory.openSession();
			VoteMapper mapper = session.getMapper(VoteMapper.class);
			cnt = mapper.insertBoard(board);
			session.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return cnt;
	}

	//글 목록
	public ArrayList<Board> ListBoard() {
		SqlSession session = null;
		ArrayList<Board> list = null;
		int cnt =0;
		try {
			session = factory.openSession();
			VoteMapper mapper = session.getMapper(VoteMapper.class);
			list = mapper.selectBoardAll();
			session.commit();
			//조회수를 증가
			//조회

		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return list;
	}
	
	//1개의 글 읽고 조회수 증가
	public Board readBoard(int num) {
		SqlSession session = null;
		Board board = null;
		try {
			session = factory.openSession();
			VoteMapper mapper = session.getMapper(VoteMapper.class);
			board = mapper.selectBoardOne(num);
//			int hits = board.getHits();
//			hits++;
//			board.setHits(hits);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return board;
	}
	
	//1개의 글삭제
	public int deleteBoard(int num) {
		SqlSession session = null;
		int cnt = 0;
		try {
			session = factory.openSession();
			VoteMapper mapper = session.getMapper(VoteMapper.class);
			cnt = mapper.delectBoard(num);
			session.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return cnt;
	}

	//글 검색
	public ArrayList<Board> searchBoard(String word) {
		SqlSession session = null;
		ArrayList<Board> list = null;
		try {
			session = factory.openSession();
			VoteMapper mapper = session.getMapper(VoteMapper.class);
			list = mapper.selectBoardTitle(word);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return list;
	}
	
}
