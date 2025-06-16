import java.util.Scanner;
public class Palindrome {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int y=n;
		int rev=0;
		while(n!=0) {
			int temp=n%10;
			rev=(rev*10)+temp;
			n=n/10;
		}
		if(y==rev) {
			System.out.println("Palindrome");
		}
		else System.out.println("Not a Palindrome");
	}
}
