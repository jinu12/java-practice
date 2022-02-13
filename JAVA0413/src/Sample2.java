
public class Sample2 {

	public static void main(String[] args) {
		
		//[0][0][0][0][0]
		int[] test;
		test = new int[5];
		
		test[0] = 80;
		test[1] = 60;
		test[2] = 22;
		test[3] = 50;
		test[4] = 55;
		
		//[80][60][22][50][75]
		
		for(int i=0;i<5;i++) {
			System.out.println((i+1) + "번째 사람의 점수는"+ test[i]+"입니다.");
		}

	}

}
