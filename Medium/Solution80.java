/**  
* @Title: Solution80.java——
* @Package EasyCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月14日 下午5:11:23
* @version V1.0  
*/
package MiddleCode;

/**
* @ClassName: Solution80——删除排序数组中的重复项
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年3月14日 下午5:11:23
*/
public class Solution80 {
	//大神思维
//	public static int removeDuplicates(int[] nums) {
//			int i = 0;
//		    for (int n : nums)
//		    	if (i < 2 || n > nums[i-2])
//		    		nums[i++] = n;
//		        return i;
//		    }
	//我的思维
	public static int removeDuplicates(int[] nums){
		int count = 0;
		int i = 0;
		for(int j = 1 ; j < nums.length ; j++){
			if(nums[j] != nums[i]){
				++i;
				nums[i] = nums[j];
				count = 0;
			}else if(count == 0){
				++i;
				nums[i] = nums[j];
				count ++;
			}
		}
		return i+1;
	}
	
	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,1,2,3,3};
		int p = removeDuplicates(nums);
		for(int i : nums)
			System.out.print(i + " ");
		System.out.println();
		System.out.println(p);
	}
}
