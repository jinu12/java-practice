
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
				//������ ����ϴ� ����
				if(j>i) {
					System.out.print(" ");
				}else {
					//���� ����ϴ� ����
					System.out.print("*");
				}
			}
			System.out.println("");
		}

	}

}
