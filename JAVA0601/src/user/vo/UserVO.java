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
		return "회원 번호 : "+num +", 회원 이름" +name+", 회원 나이 :" +age + ", 가입일 : "+indate;
	}

}
