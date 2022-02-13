package vo;

// Value Object (VO)
public class Customer {
	
	private String name;
	private String phone;
	private String carNum;
	private String place;
	
	public Customer(String name,String phone,String carNum, String place) {
		this.name = name;
		this.phone = phone;
		this.carNum = carNum;
		this.place = place;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "이름 : " +name+", 전화번호 : "+phone+", 차번호 : "+carNum+",위치 : "+place;
	}
	

}
