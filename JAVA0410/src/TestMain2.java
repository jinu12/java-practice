
public class TestMain2 {

	public static void main(String[] args) {
		// 1에서 20까지의 수 중에서 짝수와 홀수를 구분하여 출력하는 코드를 작성하시오.
		// 1:짝수
		// 2:홀수
		
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				System.out.println(i+": 짝수");
			}else {
				System.out.println(i+": 홀수");
			}
		}

	}

}
