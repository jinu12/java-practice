
public class TestMain {

	public static void main(String[] args) {
		
		//클래스이름 객체명 = new 생성자();
		String s1 = new String("test");
		String s2 = new String("test");

		String s3 = "test"; //이 스크립트를 넣으면 String s2 = new String("test");로 생성
		
//		String c = new String("test");
		
		// !=, == 연산자는 기본자료형일 경우에는 값을 비교하지만
		// 참조 자료형일 경우에는 주소값을 비교한다.
		if(s2 == s3) {
			System.out.println("s2와 s3은 같은 객체이다.");
		}else {
			System.out.println("s2와 s3은 같은 객체가 아니다.");
		}
		
		if(s2.equals(s3)) {
			System.out.println("s2와 s3의 같은 문자열이다.");
		}else {
			System.out.println("s2와 s3은 다른 문자령디ㅏ");
		}
		
		
		char c = s3.charAt(0);
		char d = s1.charAt(1);
		System.out.println(c);

		Car c1 = new Car();
		
		int[] array = new int[3];
		System.out.println(array);
		System.out.println(s3);
		System.out.println(c);
		System.out.println(d);
		
		c1.setGas(5);
		c1.run();
	}

}
