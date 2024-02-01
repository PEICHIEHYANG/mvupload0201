package model;

public class UserData {
	String user;
	String phone;
	String address;

	public UserData() {
	}

	public UserData(String user, String phone, String address) {
		this.user = user;
		this.phone = phone;
		this.address = address;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserData [user=" + user + ", phone=" + phone + ", address=" + address + "]";
	}

}
