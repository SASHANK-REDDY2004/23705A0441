import java.util.Scanner;
public class Prime_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		primeNumber(x);
	}
	static void primeNumber(int x) {
		int count=1;
		for(int i=2; i<=10; i++) {
			if(x%i==0) {
				count++;
			}
		}
		if(count>2) System.out.println("Not a Prime Number");
		else System.out.println("Prime Number");
	}
}