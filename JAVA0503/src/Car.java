
public class Car extends Vehicle {

	private int num;
	private double gas;
	
	public Car(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량번호"+num+", 연료양"+gas + "인 자동차가 만들어 졌습니다.");
	}
	
	public void CarMethod() {
		System.out.println("자동차 메소드 입니다.");
	}
	
	
	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("차량번호은 " + num + "입니다.");
		System.out.println("연료양은 " + gas + "입니다.");
		System.out.println("속도는  " + speed  + "입니다.");
		
	}
	


}
