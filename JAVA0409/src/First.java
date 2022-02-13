import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ã¹¹øÂ° ¼ö¸¦ ÀÔ·Â");
		
		
		int num1 = sc.nextInt();
		
		System.out.println("µÎ¹øÂ° ¼ö¸¦ ÀÔ·Â");
		int num2 = sc.nextInt();
		System.out.println("================");
		System.out.println("1.µ¡¼À");
		System.out.println("2.»¬¼À");
		System.out.println("3.°ö¼À");
		System.out.println("4.³ª´°¼À");
		System.out.println("================");
		
		System.out.println("¸Ş´º ¼±ÅÃ :");
		
		int mun = sc.nextInt();
		if(mun==1) {
			System.out.println("µ¡¼À °á°ú :"+(num1+num2));
		}else if(mun ==2) {
			System.out.println("»¬¼À °á°ú:"+(num1-num2));
		}else if(mun ==3) {
			System.out.println("°ö¼À °á°ú :" +(num1*num2));
		}else {
			if(num1>num2) {
				System.out.println("³ª´°¼À °á°ú : ‘–Àº"+(num1 / num2));
				System.out.println("³ª¸ÓÁö´Â "+(num1%num2));
			}else {
				System.out.println("³ª´°¼À °á°ú : ‘–Àº"+(num2 / num1));
				System.out.println("³ª¸ÓÁö´Â "+(num2%num1));
			}
		}
		sc.close();
		
		
	}

}
