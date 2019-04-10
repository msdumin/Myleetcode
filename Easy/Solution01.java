/**  
* @Title: Solution01.java����
* @Package EasyCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��3��26�� ����2:51:49
* @version V1.0  
*/
package EasyCode;

import java.util.HashMap;
import java.util.Map;

/**
* @ClassName: Solution01��������֮��  
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��3��26�� ����2:51:49
*/
public class Solution01 {
	//����ѭ������O��n2��
	
	//����  + ��ײָ��  O(nlogn) + O(n)
	
	//���ұ�
    public int[] twoSum(int[] nums, int target) {
        
    	Map<Integer, Integer> map = new HashMap<>();
    	for (int i = 0; i < nums.length; i++) {
    		int complex = target - nums[i];
    		if(map.containsKey(complex)){
    			int[] res = {i , map.get(complex)};
    			return res;
    		}
    		map.put(nums[i], i);	
		}
    	throw new IllegalStateException("no solution!");
    }
    
    private static void pritArr(int[] nums){
    	for(int num : nums)
    		System.out.print(num + " ");
    }
    public static void main(String[] args) {
		int nums[] = {0,4,3,0};
		int target = 0;
		pritArr(new Solution01().twoSum(nums, target));
	}
}
