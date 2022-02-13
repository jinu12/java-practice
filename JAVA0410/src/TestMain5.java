
public class TestMain5 {

	public static void main(String[] args) {
		/*
		 *       *
		 *      **
		 *     ***
		 *    **** 
		 */
		
		for(int i=1;i<=4;i++) {
			
			for(int j=4;j>=1;j--) {
				//공백을 출력하는 조건
				if(j>i) {
					System.out.print(" ");
				}else {
					//병을 출력하는 조건
					System.out.print("*");
				}
			}
			System.out.println("");
		}

	}

}
