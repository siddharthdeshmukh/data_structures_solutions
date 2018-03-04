package interviewBit.BS;
import java.math.*;

public class SquareRootOfIntegerSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sqrt(11));
	}
	
	public static int sqrt(int a) {
		int s = 0, e = a;
        long ans = 0L;
        while(s <= e)
        {
            long m = s + (e - s) / 2;
            long prod = m * m;
            if(prod <= a)
            {
                s = (int)(m + 1);
                ans = m;
            }
            else e = (int)m - 1;
        }
        return (int)ans;
	}

}
