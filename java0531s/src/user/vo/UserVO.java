package user.vo;

public class UserVO {
	private int num;
	private String name;
	private int age;
	private String indate;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getIndate() {
		return indate;
	}
	public void setIndate(String indate) {
		this.indate = indate;
	}
	public String toString() {
		return "ȸ�� ��ȣ : "+num +", ȸ�� �̸�" +name+", ȸ�� ���� :" +age + ", ������ : "+indate;
	}

}
