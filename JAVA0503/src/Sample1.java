
public class Sample1 {

	//double <- int 형변환(자동) 소수점이 생기고
	//int <- double (int)형변환(강제) 소수점이 사라진다.
	
	//*상속관계*
	//Vehicle <- Car 형 변환
	//Car <- Vehicle (Car)형변환(강제)
	public static void main(String[] args) {
		Vehicle[] vc;
		vc = new Vehicle[2];
		
		vc[0] = new Car(1234, 20.5);
		vc[0].setSpeed(60);
		
		
		vc[1] = new Plane(232);
		vc[1].setSpeed(500);
		
		
		
		for (int i = 0; i < vc.length; i++) {
			
			// 객체명 instanceof 클래스명
			if(vc[i] instanceof Car) {
				System.out.println((i+1) + "번째 객체는 Car 클래스 입니다.");
				
				Car c =(Car)vc[i];
				c.CarMethod();
				
			}else {
				System.out.println((i+1) + "번째 객체는 Car 클래스가 아닙니다.");
				
				Car c =(Car)vc[i];
				c.CarMethod();
			}
		}
		

	}

}



