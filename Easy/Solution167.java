/**  
* @Title: Solution167.java——
* @Package EasyCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月21日 下午9:48:31
* @version V1.0  
*/
package EasyCode;

import java.lang.annotation.Target;

/**
* @ClassName: Solution167——TwoSum  有序数组 ：对撞指针
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年3月21日 下午9:48:31
*/
public class Solution167 {
	
/*	//解法1：暴力解O(n2)     超时....
	  public int[] twoSum(int[] numbers, int target) {
		  int[] index = new int[2];
		  for(int i = 0 ; i < numbers.length ; i ++){
			  for(int j = i + 1 ; j < numbers.length ; j ++){
				  if(numbers[i] + numbers[j] == target){
					  index[0] = i+1;
					  index[1] = j+1;
				  }
			  }
		  }
		  return index;
	  }*/
	
/*	//解法2：遍历一次+二分搜索法  时间复杂度为On(logn)
	public static int[] twoSum(int[] numbers , int target){
		int index[] = new int[2];
		int n = numbers.length;
		for(int i = 0 ; i < numbers.length ; i ++){
			int ss = target - numbers[i];
			
			if(binarySerch(numbers, i + 1, ss) != -1){
				index[0] = i+1;
				index[1] = binarySerch(numbers, i +1, ss) + 1;
				break;
			}
		}
		return index;
	}
	
	private static int binarySerch(int[] arr ,int l ,int target){
		int r = arr.length - 1;     //在[l,r]的范围内寻找target
		while(l <= r){
			int mid = l + (r-l)/2;
			if(arr[mid] == target)	return mid;
			if(target > arr[mid])
				l = mid + 1;
			else {
				r = mid - 1;
			}
		}
		return -1;
	}*/
	
	//解法3：对撞指针  时间复杂度：O(n)
	public static int[] twoSum(int[] numbers , int target){
		int index[] = new int[2];
		int p = 0;
		int q = numbers.length - 1;
		while(p < q){
			if(target - numbers[p] == numbers[q]){
				index[0] = p + 1;
				index[1] = q + 1;
				break;
			}else if(target - numbers[p] > numbers[q])
				p ++;
			else 
				q--;
		}
		return index;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,4,9,45,65};
		int target = 8;
		int index[] = twoSum(arr,target);
		System.out.println(index[0] + " " + index[1]);
	}
}
