/**  
* @Title: Solution27.java——
* @Package EasyCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月14日 下午5:02:42
* @version V1.0  
*/
package EasyCode;

/**
* @ClassName: Solution27——Remove Element
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年3月14日 下午5:02:42
*/
public class Solution27 {
	//要求空间复杂度为O（1）
	public static int removeElement(int[] nums , int val){
		int k = 0;
		for(int i = 0 ; i < nums.length; i ++){
			if(nums[i] != val){
				int tmp = nums[k];
				nums[k] = nums[i];
				nums[i] = tmp;
				k++;
			}
		}
		return k;
	}
	public static void main(String[] args) {
		int[] arr = {2,3,54,55,3,3,6,7};
		int val = 3;
		System.out.println(removeElement(arr, val));
	}
}
