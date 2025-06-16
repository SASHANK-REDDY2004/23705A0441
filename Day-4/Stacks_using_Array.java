public class Stacks_using_Array{
    public static void main(String[] args) {
        Stack s=new Stack(6);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.print();
        s.pop();
        s.pop();
        s.print();

    }
}


class Stack{
    int[] arr;
    int top;
    int size;
    Stack(int size){
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }
    boolean isEmpty(){
        if(top==-1) return true;
        else return false;
    }
    boolean isFull(){
        if(top==size-1) return true;
        else return false;
    }
    void push(int data){
        if(isFull()){
            return;             
        }
        top=top+1;
        arr[top]=data;
    }
    int pop(){
        if(isEmpty()){
            return -1;
        }
        int removeEle=arr[top];
        top--;
        return removeEle;
    }
    int peak(){
        if(isEmpty()) return -1;
        return arr[top];
    } 
    void print(){
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
        System.out.println("---------------------------------");
    }
    }