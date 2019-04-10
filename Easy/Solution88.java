/**  
* @Title: Solution88.java——
* @Package EasyCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月15日 上午10:23:47
* @version V1.0  
*/
package EasyCode;

/**
* @ClassName: Solution88——Sorted Array给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年3月15日 上午10:23:47
*/
public class Solution88 {
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
		 	//归并排序的merge过程
		 int i = m - 1,j = n - 1;
		 int index = m+n-1;
		 
		 while(index >= 0){
			 if(i < 0){
				 nums1[index--] = nums2[j--];
			 }else if(j < 0){
				 nums1[index--] = nums1[i--];
			 }else if(nums1[i] > nums2[j] && i>=0)
				 nums1[index--] = nums1[i--];
			 else if(nums1[i] <= nums2[j] && j>=0)
				 nums1[index--] = nums2[j--];
		 }
	 }
	 
	 public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int m = nums1.length;
		int[] nums2 = {2,5,6};
		int n = nums2.length;
		merge(nums1, m, nums2, n);
		for(int i : nums1)
		System.out.println(i);
	}
}
