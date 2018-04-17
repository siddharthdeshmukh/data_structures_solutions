package hackerrank.java;

public class PrimalitySolution {
	
	private static final String PRIME= "Prime";
	private static final String NOTPRIME = "Not Prime";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static String checkPrime(int a) {
		if(a==1) {
			return PRIME;
		}
		if(a==2) {
			return PRIME;
		}
		for(int i=1;i< a;i++) {
			if(i!=1 && a%i==0) {
				return NOTPRIME;
			}
		}
		return PRIME;
	}

}
