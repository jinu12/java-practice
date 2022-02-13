
public class CarMain {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		car1.number = 1234;
		
		car1.gas = 10.5;
		//setter
		
		//System.out.println("차량번호는 " + car1.number + "입니다.");
		//System.out.println("남은연료는 " + car1.gas + "입니다.");
		
		//메소드를 호출했다.(메소드를 실행했다.)
		car1.show();
		int n = car1.getNumber();
		System.out.println("전달받은 차량번호" + n + "입니다.");
		car1.setNumber(7777);
//		car1.setGas(50,5.0);
		car1.setInfo(5, 2.4);
		
		Car car2 = new Car();
		
		car2.number = 312;
		car2.gas = 10.5;
		
		car2.show();
		
		System.out.println("차량번호는 " + car2.number + "입니다.");
		System.out.println("남은연료는 " + car2.gas + "입니다.");
		
		

		
	}

}
