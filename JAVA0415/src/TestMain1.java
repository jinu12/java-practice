
public class TestMain1 {

	public static void main(String[] args) {
		
		//�� 2���� ������ �����ϴµ� �� ����� 5���� ������ ������ ������ �迭�� ������ �� �ִ� �迭
		
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
		
		//����
		for(int i=0;i<test.length;i++) {
			
			//����
			for(int j=0;j<test[i].length;j++) {
				System.out.println((i+1)+ "��° �л��� " + (j+1) +"��° ������ ������" + test[i][j]);
				
			}
		}
		
		
	}

}
