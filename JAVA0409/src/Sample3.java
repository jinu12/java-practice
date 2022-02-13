
public class Sample3 {

	public static void main(String[] args) {
		
		for(int i=2;i<10;i++) {
			System.out.print(i+"단입니다.   ");
		}
		
		for(int i=1; i<10;i++) {
			
			for(int j=2;j<10;j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"   ");
			}
			
			System.out.println("");
		}
//		for(int i=2; i<10;i++) {
//			
//			System.out.print(i+"단입니다.  ");
//			for(int j=1;j<10;j++) {
//				System.out.print(i+"*"+j+"="+(i*j));
//			}
//			System.out.println("");
//		}
	}

}
