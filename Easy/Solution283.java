/**  
* @Title: Solution283.java——
* @Package EasyCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月14日 下午4:13:50
* @version V1.0  
*/
package EasyCode;

import java.util.Vector;

/**
* @ClassName: Solution283——Move Zeros
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年3月14日 下午4:13:50
*/
public class Solution283 {
	//时间空间复杂度均为O(n)级别
/*	public static void moveZeros(int[] nums){
		Vector<Integer> newnums = new Vector<>();
		
		for(int i = 0 ; i < nums.length ; i++){
			if(nums[i] != 0)
				newnums.add(nums[i]);
		}
		for(int i = 0 ; i < newnums.size() ; i ++)
			nums[i] = newnums.get(i);
		for(int i = newnums.size() ; i < nums.length ; i ++)
			nums[i] = 0;
	}*/
	//原地执行算法，不需要申请额外的空间
/*	public static void moveZeros(int[] nums){
		int r = 0 ;
		for(int i = 0 ; i < nums.length ; i++){
			if(nums[i] != 0){
				nums[r] = nums[i];
				r++;
			}
		}
		for(int i = r ; i < nums.length - 1 ; i ++)
			nums[i] = 0;
	}*/
	//再次优化，减少多重循环
	public static void moveZeros(int[] nums){
	int r = 0 ;
	for(int i = 0 ; i < nums.length ; i++){
		if(nums[i] != 0){
			int tmp = nums[r];
			nums[r] = nums[i];
			nums[i] = tmp;
			r++;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,5,0,34,0,2,3,7,0};
		moveZeros(arr);
		for(int i : arr)
			System.out.print(i);
	}
}
