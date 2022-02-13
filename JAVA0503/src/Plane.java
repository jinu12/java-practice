
public class Plane extends Vehicle {

	private int flight;
	
	public Plane(int f) {
		flight = f;
		System.out.println("비행기 번호가 "+flight + "인 비행기가 만들어졌습니다.");
	}
	
	public void PlaneMethod() {
		System.out.println("비행기 메소드 입니다.");
	}
	
	
	
	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("비행기 번호는 "+flight + "입니다.");
		System.out.println("속도는 "+speed+ "입니다.");
	}

}
