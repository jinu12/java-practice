package Vote.dao;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import Vote.vo.Board;

public class VoteDAO {
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory(); // ���̹�Ƽ�� ��ü
	
	//�� ����
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

	//�� ���
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
	
	//1���� �� �а� ��ȸ�� ����
		public Board readBoard(int num) {
			SqlSession session = null;
			Board board = null;
			int cnt = 0;
			try {
				session = factory.openSession();
				VoteMapper mapper = session.getMapper(VoteMapper.class);
				board = mapper.selectBoardOne(num);
				//��ȸ���� ����
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
		
		//1���� �ۻ���
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

		//�� �˻�
		
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
