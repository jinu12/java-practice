
public class Sample1 {

	//double <- int ����ȯ(�ڵ�) �Ҽ����� �����
	//int <- double (int)����ȯ(����) �Ҽ����� �������.
	
	//*��Ӱ���*
	//Vehicle <- Car �� ��ȯ
	//Car <- Vehicle (Car)����ȯ(����)
	public static void main(String[] args) {
		Vehicle[] vc;
		vc = new Vehicle[2];
		
		vc[0] = new Car(1234, 20.5);
		vc[0].setSpeed(60);
		
		
		vc[1] = new Plane(232);
		vc[1].setSpeed(500);
		
		
		
		for (int i = 0; i < vc.length; i++) {
			
			// ��ü�� instanceof Ŭ������
			if(vc[i] instanceof Car) {
				System.out.println((i+1) + "��° ��ü�� Car Ŭ���� �Դϴ�.");
				
				Car c =(Car)vc[i];
				c.CarMethod();
				
			}else {
				System.out.println((i+1) + "��° ��ü�� Car Ŭ������ �ƴմϴ�.");
				
				Car c =(Car)vc[i];
				c.CarMethod();
			}
		}
		

	}

}



