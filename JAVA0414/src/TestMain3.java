

public class TestMain3 {

	public static void main(String[] args) {
		//선택정렬
		int[] test = {22,80,57,60,50};
		
		/*
		 * 1회차 [80][22][57][60][50]
		 * 2회차 [80][60][22][57][50]
		 * 3회차 [80][60][57][22][50]
		 * 4회차 [80][60][57][50][22]
		 * 		 */
		//밖의 반복분의 횟수가 증가할수록 정렬되는 숫자가 발생한다.
		//밖의 반복문이 1회 반복하면 가장 첫번째 자리의 숫자가 결정한다.
		for(int i=0; i<test.length-1;i++) {
			/*
			 * 1-1회차 22와57비교 [80][22][57][60][50]
			 * 1-2회차 80과57비교 [80][60][22][57][50]
			 * 1-3회차 80과60비교[80][60][57][22][50]
			 * 1-4회차 80과50비교[80][60][57][50][22]
			 * 
			 * 2-1회차 22과57비교80[60][57][50][22]
			 * 2-2회차 57과60비교80[60][57][50][22]
			 * 2-3회차 60과50비교80[60][57][50][22]
			 * 
			 * 3-1회차 22과57비교 80 60[57][50][22]
			 * 3-2회차 22과50비교 80 60[57][50][22]
			 * 
			 * 4-1회차 22과57비교 80 60 57[50][22]
			 * 
			 * 1회차 4번
			 * 2회차 3번
			 * 3회차 2번
			 * 4회차 1번

			 * 		 */
			for(int j=i+1; j< test.length;j++) {
				
				if(test[j]>test[i]) {
					int temp = test[j];
					test[j]= test[i];
					test[i] = temp;
				}
				
			}
		}
		for(int j =0; j<test.length;j++) {
			System.out.println(test[j]);
		}

	}

}
