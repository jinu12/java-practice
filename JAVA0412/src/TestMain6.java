
public class TestMain6 {

	public static void main(String[] args) {
		// 2단부터 9단까지의 구구단을 출력하는데
		// 구구단의 앞의 숫자 1~5
		// 구구단의 앞의 숫자 6~9
		// 곱한 코드값 출력
		for(int i=2;i<=9;i++) {
			
				for(int j=1; j<=9 ;j++) {
					
					if(i%2==0) {
						if(j>5) {
							continue;
						}
					}else {
						if(j<5) {
							continue;
						}
					}
					
					System.out.println(i + "*" + j+ "= " + (i*j) + " ");
					
				}
				System.out.println("");
				
			}
		}

}
