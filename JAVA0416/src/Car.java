
public class Car {
	public int number;
	public double gas;
	

	
	/*
	 *   리턴 값의 형(type) 메소드(method) 명칭 (인수 목록) {
	 *   		문장
	 *   		return 식;
	 *   }
	 */
	
	public void show() {
		System.out.println("차량 번호는 " +number+ "입니다.");
		System.out.println("남은 연료 양은 " +gas+ "입니다.");
	}
	
	public void showCar() {
		System.out.println("차량 번호는 " +number+ "입니다.");
		show();
		System.out.println("차량 번호는 " +number+ "입니다.");
	}
	
	//파라메타, 인수, 매개변수, 아규먼트
	public void setNumber(int number) {
		this.number = number;
		System.out.println("차량 번호를 " + number + "으로 바꾸었습니다.");
	}
	
	public void setGas(double g) {
		gas = g;
		System.out.println("변경된 연료 양은 " +gas+ "입니다.");
		
	}
	public int getNumber() {
		return number;
	}
	public void setInfo(int n,double g) {
		number = n;
		gas = g;
		System.out.println("차량의 번호가 변경되었습니다.");
	}
}
