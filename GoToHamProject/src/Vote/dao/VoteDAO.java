package Vote.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import Vote.vo.Board;

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
	public ArrayList<Board> listBoard() {
		SqlSession session = null;
		ArrayList<Board> list = null;
		try {
			session = factory.openSession();
			VoteMapper mapper = session.getMapper(VoteMapper.class);
			list = mapper.selectBoardAll();
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
			int cnt = 0;
			try {
				session = factory.openSession();
				VoteMapper mapper = session.getMapper(VoteMapper.class);
				board = mapper.selectBoardOne(num);
				//조회수를 증가
				if( cnt > 0) {
					 cnt = mapper.updateBoard(num);
				}
				session.commit();
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
		
		public ArrayList<Board> searchBoard(HashMap<String, Object> map) {
			SqlSession session = null;
			ArrayList<Board> list = null;
			try {
				session = factory.openSession();
				VoteMapper mapper = session.getMapper(VoteMapper.class);
				list = mapper.selectBoardTitle(map);
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				if(session != null) {
					session.close();
				}
			}
			return list;
		}
		
//		public ArrayList<Board> searchBoard(String word) {
//			SqlSession session = null;
//			ArrayList<Board> list = null;
//			try {
//				session = factory.openSession();
//				VoteMapper mapper = session.getMapper(VoteMapper.class);
//				list = mapper.selectBoardName(word);
//			}catch (Exception e) {
//				e.printStackTrace();
//			}finally {
//				if(session != null) {
//					session.close();
//				}
//			}
//			return list;
//		}
//		public ArrayList<Board> searchBoard2(String word) {
//			SqlSession session = null;
//			ArrayList<Board> list = null;
//			try {
//				session = factory.openSession();
//				VoteMapper mapper = session.getMapper(VoteMapper.class);
//				list = mapper.selectBoardTitle(word);
//			}catch (Exception e) {
//				e.printStackTrace();
//			}finally {
//				if(session != null) {
//					session.close();
//				}
//			}
//			return list;
//		}
//		public ArrayList<Board> searchBoard3(String word) {
//			SqlSession session = null;
//			ArrayList<Board> list = null;
//			try {
//				session = factory.openSession();
//				VoteMapper mapper = session.getMapper(VoteMapper.class);
//				list = mapper.selectBoardContent(word);
//			}catch (Exception e) {
//				e.printStackTrace();
//			}finally {
//				if(session != null) {
//					session.close();
//				}
//			}
//			return list;
//		}
		
	
}
