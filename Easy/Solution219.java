/**  
* @Title: Solution219.java����
* @Package EasyCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��3��26�� ����9:47:17
* @version V1.0  
*/
package EasyCode_01;

import java.util.HashSet;
import java.util.Set;

/**
* @ClassName: Solution219���������ظ�Ԫ�� II
* @Description: TODO
* ����һ�����������һ������ k���ж��������Ƿ����������ͬ������ i �� j��ʹ�� nums [i] = nums [j]������ i �� j �Ĳ�ľ���ֵ���Ϊ k��
* @author msdumin@gmail.com
* @date 2019��3��26�� ����9:47:17
*/
public class Solution219 {
 /*   public boolean containsNearbyDuplicate(int[] nums, int k) {
        //�ⷨ1������O(n2)�ı����ⷨ  �ð���Ȼ��ʱ�Գ� ����Ȼͨ����...
    	for(int i = 0 ; i < nums.length ; i ++){
    		for(int j = i + 1 ; j < nums.length ; j ++){
    			if(nums[j] == nums[i]){
    				int dis = j - i;
    				if(dis <= k)
    					return true;
    			}
    		}
    	}
    	return false;
    }*/
	
	public boolean containsNearbyDuplicate(int[] nums, int k){
		//�ⷨ2���������ڷ�
		if(nums == null || nums.length <= 1)
			return false;
		if(k <= 0)
			return false;
		
		Set<Integer> record = new HashSet<>();
		for (int i = 0; i < nums.length; i ++) {
			if(record.contains(nums[i]))
				return true;
			
			record.add(nums[i]);
			//���ִ��ڳ���һֱΪk+1
			if(record.size() == k + 1)
				record.remove(nums[i - k]);
		}
		return false;
	}
}
