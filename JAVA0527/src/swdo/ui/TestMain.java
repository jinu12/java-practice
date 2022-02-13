package swdo.ui;

import swdo.dao.StudentDAO;
import swdo.vo.Student;

public class TestMain {

	public static void main(String[] args) {
		
		StudentDAO dao = new StudentDAO();
		
		Student vo = new Student();
		vo.setName("±èÁø¿ì");
		vo.setAge(26);
		
		dao.insertStudent(vo);
		

	}

}
