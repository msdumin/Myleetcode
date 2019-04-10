/**  
* @Title: Solution75.java——
* @Package MiddleCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月15日 上午9:50:57
* @version V1.0  
*/
package MiddleCode;

/**
* @ClassName: Solution75——sort colors
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年3月15日 上午9:50:57
*/
public class Solution75 {
/*	//方法1：暴力二次扫描
	public static void sortColors(int[] nums){
		int count[] = new int[3];
		for(int i = 0 ; i < nums.length ; i++){
			if(nums[i] >= 0 && nums[i] <= 2){
				count[nums[i]]++;
			}
		}
		for (int i = 0; i < count[0]; i++) 
			nums[i] = 0;
		for (int i = count[0]; i < count[0] + count[1]; i++) 
			nums[i] = 1;
		for (int i = count[0] + count[1]; i < nums.length; i++) 
			nums[i] = 2;
	}*/
	
	//方法二：扫描一次(三路快排思想的应用)
	public static void sortColors(int[] nums){
		int zero = -1;  //nums[0 ... zero] == 0
		int two = nums.length;  //nums[two ... nums.length] == 2
		for(int i = 0 ; i < two ; ){
			if(nums[i] == 2){
				two--;
				swap(nums , i , two);
			}else if(nums[i] == 1){
				i++;
			}else{
				zero++;
				swap(nums , zero , i);
				i++;
			}
		}
	}
	/*
	//错误的交换两数函数写法！！！ 只是进行了值传递
	private static void swap(int a , int b){
		int tmp = a;
		a = b;
		b = tmp;
	} */
	//正确的交换两数的函数写法
	private static void swap(int[] arr , int a , int b){
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}
	
	public static void main(String[] args) {
		int[] nums = {2,0,2,1,1,0};
		sortColors(nums);
		for(int i : nums)
		System.out.print(i + " ");
	}
}
