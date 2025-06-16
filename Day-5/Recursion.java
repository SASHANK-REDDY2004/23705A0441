import java.util.Stack;

public class Recursion {
	public static void main(String args[]) {
		Stack<Integer> s=new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		pushBottom(s,40);
		System.out.println(s);
	}
	static void printRange(int start,int end) {
		if(start>end) {
			return ;
		}
		System.out.print(start+"-->");
		printRange(start+1,end);
		return;
	}
	static int fact(int n) {   //factorial of a number
		if(n==1) return 1;
		int val=n*fact(n-1);
		return val;
	}
	static int pow(int n,int x) {    //power of number
		if(x==0) return 1;
		int val=n*pow(n,x-1);
		return val;
	}
	static void pushBottom(Stack<Integer> stack,int ele) {
		if(stack.isEmpty()) {
			stack.push(ele);
			return;
		}
		int val=stack.pop();
		pushBottom(stack,ele);
		stack.push(val);
	}
}
