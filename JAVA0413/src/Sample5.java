
public class Sample5 {

	public static void main(String[] args) {
		int num =1;
		double num2 = 2.4;
		
		int[] test1;
		test1 = new int[3];
		
		System.out.println("test1을 선언했습니다.");
		System.out.println("배열 요소를 생성했습니다.");
		
		test1[0] = 80;
		test1[1] = 60;
		test1[2] = 22;

		//test1 : 주소값 ------------->[80][60][22]	
		//test2 : null
		int[] test2;
		System.out.println("test2를 선언했습니다.");
		
		// test2 <- test1;
		test2 = test1;
		System.out.println("test2에test1을대입햇습니다.");
		
		test1[1] = 50;
		
		
		for(int i =0;i<3;i++) {
			System.out.println("test1이 가리키는 " + (i+1) + "번재 점수는" + test1[i]);
		}
		for(int i =0;i<3;i++) {
			System.out.println("test2이 가리키는 " + (i+1) + "번재 점수는" + test2[i]);
		}
	}
}
