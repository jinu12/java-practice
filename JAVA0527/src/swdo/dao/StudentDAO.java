package swdo.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import swdo.vo.Student;

public class StudentDAO {

	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	
	public void insertStudent(Student student) {
		SqlSession session = null;
		
		try {
			//DB����
			session = factory.openSession();
			//������ ������ �ƴ϶� ������ �� ó�� ���
			//SQL������ ���� - > Mapper �������̽��� �߻�޼ҵ带 �����Ѵ�.
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			//SQL���� ����
			mapper.insertStudent(student);
			//������ SQL������ insert , update , delete �� ��쿡�� ��!��!��! commit�� �Ѵ�.
			session.commit();
			
		} catch (Exception e) {
			//� ���ܰ� �߻��߈d�� Ȯ���ϱ� ���ؼ� ��±����� �ۼ��Ѵ�.
			e.printStackTrace();
			
		}finally {
			if(session != null) {
				session.close();
			}
		}
		
	}
	
}
