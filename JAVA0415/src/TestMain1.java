
public class TestMain1 {

	public static void main(String[] args) {
		
		//총 2명의 정보를 저장하는데 한 사람당 5개의 과목의 점수를 가지는 배열을 저장할 수 있는 배열
		
		int[][] test = new int[2][5];
		
		int[] math = {80,60,22,50,75};
		int[] english = {90,55,68,72,58};
//		
		for(int i=0;i<test.length;i++) {
			for(int j=0;j<test[i].length;j++) {
				if(i==0) {
					test[i][j] = math[j];
					
				}else if(i==1) {
					test[i][j] = english[j];

				}	
			}
		}
		

		
//		test[0][0] = 80;
//		test[0][1] =60;
//		test[0][2] =22;
//		test[0][3] =50;
//		test[0][4] =75;
//		test[1][0] =90;
//		test[1][1] =55;
//		test[1][2] =68;
//		test[1][3] =72;
//		test[1][4] =58; 
		
		//세로
		for(int i=0;i<test.length;i++) {
			
			//가로
			for(int j=0;j<test[i].length;j++) {
				System.out.println((i+1)+ "번째 학생의 " + (j+1) +"번째 과목의 점수는" + test[i][j]);
				
			}
		}
		
		
	}

}
