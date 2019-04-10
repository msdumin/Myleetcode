/**  
* @Title: Solution217.java——
* @Package EasyCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月26日 下午11:04:57
* @version V1.0  
*/
package EasyCode_01;

import java.util.HashMap;
import java.util.Map;

/**
* @ClassName: Solution217——
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年3月26日 下午11:04:57
*/
public class Solution217 {
	 public boolean containsDuplicate(int[] nums) {
		 //非暴力解法：
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
		 
//		 //暴力解法：超时了
//		 for (int i = 0; i < nums.length; i++) {
//			 	for(int j = i + 1 ; j < nums.length ; j ++){
//			 		if(nums[j] == nums[i])
//			 			return true;
//			 	}
//		 	}
//		 return false;
	    }
}
