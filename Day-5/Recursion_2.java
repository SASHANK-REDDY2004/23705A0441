import java.util.Stack;
public class Recursion_2{
    public static void Main(String[] args){
        Stack<Integer> s=new Stack<Integer>();
        s.push(10);
        s.push(20);
        s.push(30);
        int val=s.pop();
        s.pushBottom(s,val);
        val=s.pop();
        s.pushBottom(s,val);
        val=s.pop();
        s.pushBottom(s,val);
    }
    static void pushBottom(Stack<Integer>,int val){
        if(stack.isEmpty()){
            return;
        }
        int val=stack.pop();
        pushBottom(stack,ele);
        stack.push(val);
    }
}
