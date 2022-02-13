
public class Car implements iVehicle{

	private int num;
	private double gas;
	
	public Car(int n, double g) {
		num = n;
		gas = g;
		System.out.println("차량 번호가 " +num + "이며 , 연료 양이 " + gas+"인 자동차가 만들어졌습니다.");
	}
	
	
	@Override
	public void show() {
		System.out.println("차량번호는 "+num+"입니다.");
		System.out.println("연료 양은 "+gas+"입니다.");
		
	}

}
