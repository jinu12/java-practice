
public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		System.out.println("이름 : "+s1.getName());
		
		Student s2 = new Student("홍길동",2,3,4);
		System.out.println("이름: "+s2.getName());
		

	}

}
