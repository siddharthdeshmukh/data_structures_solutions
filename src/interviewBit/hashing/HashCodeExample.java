package interviewBit.hashing;

public class HashCodeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User(12, "A201");
		User user2 = new User(13, "A301");
		User user3 = new User(12, "A201");
		
		if(user1.equals(user2)){
			System.out.println("User 1 and User 2 are Equal");
		}
		if(user1.equals(user3)){
			System.out.println("User 1 and User 3 are Equal");
		}
	}

}
