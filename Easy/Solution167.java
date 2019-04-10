/**  
* @Title: Solution167.java����
* @Package EasyCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��3��21�� ����9:48:31
* @version V1.0  
*/
package EasyCode;

import java.lang.annotation.Target;

/**
* @ClassName: Solution167����TwoSum  �������� ����ײָ��
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��3��21�� ����9:48:31
*/
public class Solution167 {
	
/*	//�ⷨ1��������O(n2)     ��ʱ....
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
	
/*	//�ⷨ2������һ��+����������  ʱ�临�Ӷ�ΪOn(logn)
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
		int r = arr.length - 1;     //��[l,r]�ķ�Χ��Ѱ��target
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
	
	//�ⷨ3����ײָ��  ʱ�临�Ӷȣ�O(n)
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
