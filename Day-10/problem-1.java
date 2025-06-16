public class Main{
    public static void main (String[] args) {
        int vals=ways(5);
        System.out.println(vals);
    }
    public static int ways(int n){
        if(n==0 || n==1) return 1;
        return ways(n-1)+ways(n-2);
    }
    
}