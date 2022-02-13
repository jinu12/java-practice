
public class Sample6 {

	public static void main(String[] args) {
		
		int[] test = {80,60,22,50,75};
				
		for(int i =0;i<5;i++) {
			System.out.println("test1이 가리키는 " + (i+1) + "번재 점수는" + test[i]);
		}
		
		System.out.println("시험 응시자 수는 + " + test.length + "명 입니다.");

	}

}
