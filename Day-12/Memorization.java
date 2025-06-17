import java.util.Arrays;
public class Memorization{
    public static void main (String[] args) {
        int [] memo=new int[10];
        memo[0]=0;
        memo[1]=1;
        System.out.println(fibMemorization(9,memo));
        System.out.println(Arrays.toString(memo));
    }
    public static int fibMemorization(int n,int[] memo){
        if(n==0||n==1) return n;
        if(memo[n]!=0) return memo[n];
        int val=fibMemorization(n-1,memo)+fibMemorization(n-2,memo);
        memo[n]=val;
        return memo[n];
    }
}