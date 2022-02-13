
public abstract class Vehicle {

	protected int speed;
	
	public void setSpeed(int s) {
		speed = s;
		System.out.println("속도를" + speed + "으로 변경했습니다.");
	}
		
		 abstract void show();
}
