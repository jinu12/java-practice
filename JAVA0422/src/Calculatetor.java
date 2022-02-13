
public class Calculatetor {
	
	public int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	public double avg(int x,int y) {
		int sum = plus(x,y);
		double result = sum / 2;
		return result;
	}
	
	public void execute() {
		double result = avg(7,10);
	}
	
//	public void

}
