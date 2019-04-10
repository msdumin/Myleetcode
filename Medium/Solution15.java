/**  
* @Title: Solution15.java——
* @Package MiddleCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月26日 下午2:43:00
* @version V1.0  
*/
package MiddleCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
* @ClassName: Solution15——三数之和  给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c,
* 使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年3月26日 下午2:43:00
*/
public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
    	
    	List<List<Integer>> record = new ArrayList<>();
    	
    	if(nums == null || nums.length < 3)
    		return record;
    	//排序
        Arrays.sort(nums);
        
        for(int i = 0 ; i < nums.length ; i ++){
        	
        	if(nums[i] > 0)
        		break;
        	
        	if(i > 0 && nums[i] == nums[i-1])
        		continue;
        	
        	int begin = i + 1;
        	int end = nums.length - 1;
        	//找i之后 的数组
        	while(begin < end){
        		int sum = nums[i] + nums[begin] + nums[end];
        		if(sum == 0){
        			record.add(Arrays.asList(nums[i],nums[begin],nums[end]));
        			begin ++;
        			end --;
        			//避免重复
        			while(begin < end && nums[begin] == nums[begin - 1])
        				begin ++;
        			while(begin < end && nums[end] == nums[end + 1])
        				end --;
        		}else if(sum > 0)
        			end --;
        		else 
        			begin ++;
        	}
        }
        return record;
    }
	
    private static void sortNums(int[] nums){
    	quickSort(nums, nums.length);
    }
    private static void quickSort(int[] nums ,int n){
    	quickSort_p(nums, 0, n-1);
    }
    private static void quickSort_p(int[] nums ,int p,int r){
    	//递归结束条件
    	if(p >= r)
    		return ;
    	int q = partition(nums,p,r);
    	quickSort_p(nums, p, q - 1);
    	quickSort_p(nums, q+1, r);
    }
    private static int partition(int[] nums,int p,int r){
    	int pivot = nums[r];
    	int i = p;
    	for(int j = p ; j < r; j ++){
    		if(nums[j] < pivot){
    			int tmp = nums[i];
    			nums[i] = nums[j];
    			nums[j] = tmp;
    			i++;
    		}
    	}
    	int tmp = nums[i];
    	nums[i] = nums[r];
    	nums[r] = tmp;
    	return i;
    }
    
    public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		sortNums(nums);
		for(int num : nums)
			System.out.print(num + " ");
	}
}
