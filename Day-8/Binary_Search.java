public class Binary_Search {
	public static void main (String[] args) {
		int[] nums= {1,2,3,8,9,10,19,22,45};
		int target=8;
		int left=0;
		int right=nums.length-1;
		int index=-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(target>nums[mid]) {
				left=mid+1;
			}
			else if(target<nums[mid]) {
				right=mid-1;
			}
			else {
				index=mid;
				break;
			}
		}
		System.out.println(index==-1?"The element is not found":"The element found at index:"+index);
	}
}