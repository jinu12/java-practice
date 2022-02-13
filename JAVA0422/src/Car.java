
public class Car {
	
	//« µÂ
	private int gas;
	
	public void setGas(int gas) {
		this.gas = gas;
	}
	
	public boolean isLeftGas() {
		
		if(gas == 0) {
			System.out.println("gas∞° æ¯Ω¿¥œ¥Ÿ.");
			return false;
		}
		
		System.out.println("");
		return true;
	}
	
	public void run() {
		
		while(true) {
			
			if(gas > 0) {
				System.out.println("¥ﬁ∏≥¥œ¥Ÿ. (gas ¿‹∑Æ:"+gas+")");
				gas -=1;
			} else {
				System.out.println("∏ÿ√‰¥œ¥Ÿ. (gas ¿‹∑Æ:"+gas+")");
				return;
			}
		}
	}

}
