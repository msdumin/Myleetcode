/**  
* @Title: Solution220.java——
* @Package MiddleCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月27日 上午9:11:22
* @version V1.0  
*/
package MiddleCode;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
* @ClassName: Solution220——存在重复元素 III
* @Description: TODO
* 给定一个整数数组，判断数组中是否有两个不同的索引 i 和 j，使得 nums [i] 和 nums [j] 的差的绝对值最大为 t，并且 i 和 j 之间的差的绝对值最大为 ķ。
* @author msdumin@gmail.com
* @date 2019年3月27日 上午9:11:22
*/
public class Solution220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        
    	if(nums == null || nums.length == 0)
    		return false;
    	
    	if(k<=0||t<0)
    		return false;
    	
    	TreeSet<Long> record = new TreeSet<>();
    	for (int i = 0; i < nums.length; i++) {	//nums[i] + t要注意整型溢出问题,果然溢出了...
			if(record.ceiling((long)nums[i] - (long)t) != null 
					&& record.ceiling(((long)nums[i] - (long)t)) <= (long)nums[i] + (long)t)
				return true;
				
			record.add((long)nums[i]);
			//保持窗口长度一直为k+1
			if(record.size() == k+1)
				record.remove((long)nums[i - k]);
		}
    	return false;
    }
}
