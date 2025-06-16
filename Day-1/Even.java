class Main {
    public static void main(String[] args) {
        int range=160;
        int count=0;
        int single=0;
        int x;
        for (int i=1;i<=range;i++){
                single=SingleNumber(i);
                if(single%2==0){
                    count++;
                }
            }
        System.out.println(count);
    }
    public static int  SingleNumber(int i){
        while(i>9){
            int single=0;
            while(i>0){
                        int temp=i%10;
                        single+=temp;
                        i=i/10;
                }
            i=single;
        }
    return i;
}
    
}