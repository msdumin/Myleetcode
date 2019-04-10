/**  
* @Title: Solution215.java����
* @Package MiddleCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��3��15�� ����10:26:12
* @version V1.0  
*/
package MiddleCode;

import java.util.ArrayList;
import java.util.List;

/**
* @ClassName: Solution215����Ѱ�ҵ�K���Ԫ��
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��3��15�� ����10:26:12
*/
public class Solution215 {
	public static int findKthLargest(int[] nums, int k) {
    //˼·1����������ȡ����K���Ԫ��
		int p = 0;
		int r = nums.length -1;
		quick_sort(nums, p, r);
		return nums[nums.length - k];
	//˼·2��TopK���� ���ȶ���
    }
	//����
	public static void quick_sort(int[] arr ,int p,int r){
		//�ݹ��������
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
