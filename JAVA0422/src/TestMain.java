
public class TestMain {

	public static void main(String[] args) {
		
		//Ŭ�����̸� ��ü�� = new ������();
		String s1 = new String("test");
		String s2 = new String("test");

		String s3 = "test"; //�� ��ũ��Ʈ�� ������ String s2 = new String("test");�� ����
		
//		String c = new String("test");
		
		// !=, == �����ڴ� �⺻�ڷ����� ��쿡�� ���� ��������
		// ���� �ڷ����� ��쿡�� �ּҰ��� ���Ѵ�.
		if(s2 == s3) {
			System.out.println("s2�� s3�� ���� ��ü�̴�.");
		}else {
			System.out.println("s2�� s3�� ���� ��ü�� �ƴϴ�.");
		}
		
		if(s2.equals(s3)) {
			System.out.println("s2�� s3�� ���� ���ڿ��̴�.");
		}else {
			System.out.println("s2�� s3�� �ٸ� ���ڷɵ�");
		}
		
		
		char c = s3.charAt(0);
		char d = s1.charAt(1);
		System.out.println(c);

		Car c1 = new Car();
		
		int[] array = new int[3];
		System.out.println(array);
		System.out.println(s3);
		System.out.println(c);
		System.out.println(d);
		
		c1.setGas(5);
		c1.run();
	}

}
