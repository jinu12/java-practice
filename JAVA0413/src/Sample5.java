
public class Sample5 {

	public static void main(String[] args) {
		int num =1;
		double num2 = 2.4;
		
		int[] test1;
		test1 = new int[3];
		
		System.out.println("test1�� �����߽��ϴ�.");
		System.out.println("�迭 ��Ҹ� �����߽��ϴ�.");
		
		test1[0] = 80;
		test1[1] = 60;
		test1[2] = 22;

		//test1 : �ּҰ� ------------->[80][60][22]	
		//test2 : null
		int[] test2;
		System.out.println("test2�� �����߽��ϴ�.");
		
		// test2 <- test1;
		test2 = test1;
		System.out.println("test2��test1�������޽��ϴ�.");
		
		test1[1] = 50;
		
		
		for(int i =0;i<3;i++) {
			System.out.println("test1�� ����Ű�� " + (i+1) + "���� ������" + test1[i]);
		}
		for(int i =0;i<3;i++) {
			System.out.println("test2�� ����Ű�� " + (i+1) + "���� ������" + test2[i]);
		}
	}
}
