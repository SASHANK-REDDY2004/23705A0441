import java.util.Scanner;
public class Task_1 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int count=0;
		if(x>1){
		if(x%2!=0){
		    x=x-1;
		    count++;
		    if(x==2) count++;
		    for(int i=2;i<x;i++){
		        if(x%i==0){
		            x=x/i;
		            count++;
		        }
		}
		}
		else if(x==2) count++;
		else if(x%2==0){
		    for(int i=2;i<x;i++){
		        if(x%i==0){
		            x=x/i;
		            count++;
		        }
		        x=x-1;
		        count++;
		    }
		}
		}
		System.out.println(count);
	}
}
