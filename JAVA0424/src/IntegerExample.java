
//Inheritance(���) , ���

public class IntegerExample {

	public static void main(String[] args) {
		//�ڽ�(boxing)
		//�⺻Ÿ���� ���� ���尴ü(����Ŭ����)�� ����� ������ �ڽ�
		// int -> Integer
		
		Integer num1 = new Integer(100);
		Integer num2 = new Integer("200");
		Integer num3 = Integer.valueOf("200");
		
		Integer numd = 400; // ���� �ڽ�
		
		String s= "123456";
		int i = Integer.parseInt(s);
		
		//��ڽ�(inboxing)
		//���尴ü(����Ŭ����) ���� �⺻Ÿ���� ������ ����� ����
		//integer -> ubt

		int value1 = num1.intValue();		
		int value2 = num2.intValue();
		int value3 = num3.intValue();
	
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}
	

}
