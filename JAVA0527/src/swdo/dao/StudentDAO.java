package swdo.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import swdo.vo.Student;

public class StudentDAO {

	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	
	public void insertStudent(Student student) {
		SqlSession session = null;
		
		try {
			//DB접속
			session = factory.openSession();
			//실제로 구현이 아니라 구현한 것 처럼 사용
			//SQL구문을 실행 - > Mapper 인터페이스의 추상메소드를 실행한다.
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			//SQL구문 실행
			mapper.insertStudent(student);
			//실행한 SQL구문이 insert , update , delete 일 경우에는 반!드!시! commit을 한다.
			session.commit();
			
		} catch (Exception e) {
			//어떤 예외가 발생했늕지 확인하기 위해서 출력구문을 작성한다.
			e.printStackTrace();
			
		}finally {
			if(session != null) {
				session.close();
			}
		}
		
	}
	
}
