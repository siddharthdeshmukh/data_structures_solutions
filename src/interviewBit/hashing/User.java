package interviewBit.hashing;

public class User {
	
	private int age;
	private String address;
	
	public User(int age, String address) {
		super();
		this.age = age;
		this.address = address;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public int hashCode() {
		
		return 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return true;
	}
	
	

}
