
public class TestMain6 {

	public static void main(String[] args) {
		// 2�ܺ��� 9�ܱ����� �������� ����ϴµ�
		// �������� ���� ���� 1~5
		// �������� ���� ���� 6~9
		// ���� �ڵ尪 ���
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
