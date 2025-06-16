import java.util.Scanner;
public class Divisible_by_3{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%3==0){
            System.out.println("It is divisible by 3");
        }
        else{
            System.out.println("It is not divisible by 3");
        }
        
    }
}
