/**  
* @Title: Solution26.java——
* @Package EasyCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月14日 下午5:10:55
* @version V1.0  
*/
package EasyCode;

/**
* @ClassName: Solution26——Remove Duplicates from Sorted Array
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年3月14日 下午5:10:55
*/
//要求原地算法
public class Solution26 {
	public int removeDuplicates(int[] nums){
/*		if(nums.length == 0)
			return 0;
		if(nums.length == 1)
			return 1;
		int tmp = nums[0];
		int i = 1;
		int count = 0;
		while(i < nums.length){
			if(nums[i] == tmp)
				count ++; 
			else
			{
				tmp = nums[i];
				nums[i - count] = tmp;
			}
			i++;
		}
		return nums.length - count;*/
		
		//解法2
		int i = 0,j = 1;
		while(j < nums.length){
			if(nums[i] == nums[j])
				j++;
			else{
				nums[i + 1] = nums[j];
				i++;
				j++;
			}
		}
		return i + 1;
	}
}
