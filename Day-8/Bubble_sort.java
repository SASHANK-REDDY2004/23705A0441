public class Bubble_sort{
    public static void main(String args[]){
        int[] nums={3,5,8,2,1,9,6,21,99,32,20};
        for(int j=0;j<nums.length-1;j++){
            boolean isSwapped=false;
            for(int i=0;i<nums.length-1-j;i++){
                if(nums[i]>nums[i+1]){
                    int temp=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped) break;
        }
        for(int k=0;k<nums.length;k++){
            System.out.print(nums[k]+" ");
        }
    } 
}