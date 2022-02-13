
public class CarMain {

	public static void main(String[] args) {
		
		Car.showSum(); 		//클래스 메소드 호출 static은 객체 생성없이 호출할 수있음
		
		Car Car1 = new Car();
		Car1.setCar(100, 51.3);
		
		Car.showSum();
		
		Car car2 = new Car();
		car2.setCar(4567, 50.47);
		
		Car.showSum();

	}

}
