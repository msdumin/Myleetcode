/**  
* @Title: Solution215.java——
* @Package MiddleCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月15日 上午10:26:12
* @version V1.0  
*/
package MiddleCode;

import java.util.ArrayList;
import java.util.List;

/**
* @ClassName: Solution215——寻找第K大的元素
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年3月15日 上午10:26:12
*/
public class Solution215 {
	public static int findKthLargest(int[] nums, int k) {
    //思路1：先排序，再取出第K大的元素
		int p = 0;
		int r = nums.length -1;
		quick_sort(nums, p, r);
		return nums[nums.length - k];
	//思路2：TopK问题 优先队列
    }
	//快排
	public static void quick_sort(int[] arr ,int p,int r){
		//递归结束条件
		if(p >= r)
			return;
		int q = parTion(arr ,p ,r);
		quick_sort(arr , p,q-1);
		quick_sort(arr,q+1,r);
	}
	public static int parTion(int[] arr,int p,int r){
		int i = p;
		int pivot = arr[r];
		for(int j = p ; j < r ; j ++){
			if(arr[j] < pivot){
				int tmp = arr[j];
				arr[j] = arr[i];
				arr[i] = tmp;
				i++;
			}
		}
		int tmp = arr[i];
		arr[i] = arr[r];
		arr[r] = tmp;
		return i;
	}
	
	public static void main(String[] args) {
		int nums[] = {3,7,1,2,6,5,4};
		int k = 2;
		System.out.println(findKthLargest(nums, k));
		for(int i : nums)
			System.out.print(i + " ");
	}
}
