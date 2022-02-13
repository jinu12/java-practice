
//Inheritance(상속) , 계승

public class IntegerExample {

	public static void main(String[] args) {
		//박싱(boxing)
		//기본타입의 값을 포장객체(래퍼클래스)로 만드는 과정을 박싱
		// int -> Integer
		
		Integer num1 = new Integer(100);
		Integer num2 = new Integer("200");
		Integer num3 = Integer.valueOf("200");
		
		Integer numd = 400; // 보통 박싱
		
		String s= "123456";
		int i = Integer.parseInt(s);
		
		//언박싱(inboxing)
		//포장객체(래퍼클래스) 값을 기본타입의 값으로 만드는 과정
		//integer -> ubt

		int value1 = num1.intValue();		
		int value2 = num2.intValue();
		int value3 = num3.intValue();
	
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}
	

}
