package user.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import user.vo.UserVO;

public class UserDAO {

	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	public int insertUser(UserVO vo) {
		
		SqlSession session = null;
		int cnt = 0;
		try {
			session = factory.openSession();
			UserMapper mapper = session.getMapper(UserMapper.class);
			cnt = mapper.insertUser(vo);
			session.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session !=null) {
				session.close();
			}
		}
		
		return cnt;
		
	}
	
	public ArrayList<UserVO>selectUser() {
		SqlSession session = null;
		ArrayList<UserVO> list = null;
		
		try {
			session = factory.openSession();
			UserMapper mapper = session.getMapper(UserMapper.class);
			list = mapper.selectUser();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return list;
	}
	public int deleteUser(int num) {
		SqlSession session = null;
		int cnt = 0;
		
		try {
			session = factory.openSession();
			UserMapper mapper = session.getMapper(UserMapper.class);
			cnt = mapper.delectUser(num);
			session.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session !=null) {
				session.close();
			}
		}
		
		
		return cnt;
	}
	public  ArrayList<UserVO>selectUserName(String name) {
		ArrayList<UserVO> list = null;
		SqlSession session = null;
		
		try {
			session = factory.openSession();
			UserMapper mapper = session.getMapper(UserMapper.class);
			list = mapper.selectUserName(name);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session !=null) {
				session.close();
			}
		}
		return list;

	}
	
	public int updateUser(UserVO vo) {
		
		SqlSession session = null;
		int cnt = 0;
		try {
			session = factory.openSession();
			UserMapper mapper = session.getMapper(UserMapper.class);
			cnt = mapper.updateUser(vo);
			session.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session !=null) {
				session.close();
			}
		}
		
		return cnt;
		
	}
	
	public UserVO selectByNum(int num) {
		
		UserVO list = null;
		SqlSession session = null;
		
		try {
			session = factory.openSession();
			UserMapper mapper = session.getMapper(UserMapper.class);
			list = mapper.selectByNum(num);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session !=null) {
				session.close();
			}
		}
		return list;
		
	}
	
	
	
}
