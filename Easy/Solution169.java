/**  
* @Title: Solution169.java——
* @Package EasyCode_02
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年4月13日 下午2:35:50
* @version V1.0  
*/
package EasyCode_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @ClassName: Solution169——求众数
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年4月13日 下午2:35:50
*/
public class Solution169 {
    public int majorityElement(int[] nums) {
    	//自己的方法  用时有点长
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for(int i : nums){
        	freq.put(i, freq.getOrDefault(i, 1) + 1);
        }
        //map取出最大或者最小value方法
       /* Collection<Integer> collection = freq.values();
        Object[] obj = collection.toArray();
        Arrays.sort(obj);*/
        //map取最大或最小value值所对应的key值的方法
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());
        Collections.sort(list , (o1,o2) -> (o1.getValue() - o2.getValue())); //lambda表达式  升序排序
        return list.get(list.size() - 1).getKey();
    }
    //其他方法
/*    public int majorityElement(int[] nums) {
    	if(nums.length == 1)
    		return nums[0];
    	
    	Arrays.sort(nums);
    	int count = 1;
    	int pre = nums[0];
    	for(int i = 1 ; i < nums.length ; i++ ){
    		if(pre == nums[i]){
    			count ++ ;
    			if(count > nums.length / 2)
    				return pre;
    		}else{
    			pre = nums[i];
    			count = 1;
    		}
    	}
    	return 0;
    }*/
}
