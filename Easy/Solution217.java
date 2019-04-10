/**  
* @Title: Solution217.java����
* @Package EasyCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��3��26�� ����11:04:57
* @version V1.0  
*/
package EasyCode_01;

import java.util.HashMap;
import java.util.Map;

/**
* @ClassName: Solution217����
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��3��26�� ����11:04:57
*/
public class Solution217 {
	 public boolean containsDuplicate(int[] nums) {
		 //�Ǳ����ⷨ��
		 Map<Integer, Integer> map = new HashMap<>();
		 for(int i = 0 ; i < nums.length ; i++){
			 if(map.containsKey(nums[i]))
				 map.put(nums[i], map.get(nums[i]) + 1);
			 else
				 map.put(nums[i], 1);
		 }
		 for(Integer key : map.keySet()){
			 if(map.get(key) > 1)
				 return true;
		 }
		 return false;
		 
//		 //�����ⷨ����ʱ��
//		 for (int i = 0; i < nums.length; i++) {
//			 	for(int j = i + 1 ; j < nums.length ; j ++){
//			 		if(nums[j] == nums[i])
//			 			return true;
//			 	}
//		 	}
//		 return false;
	    }
}
