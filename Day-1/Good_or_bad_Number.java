public class Good_or_bad_Number {
	public static void main(String[]args) {
		int x=4;
		int count=0;
		for(int i=1; i<=x; i++) {
			if(x%i==0) count++;
		}
		if(count<=3) System.out.println("GOOD NUMBER");
		else System.out.println("BAD NUMBER");

	}
}