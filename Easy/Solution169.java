/**  
* @Title: Solution169.java����
* @Package EasyCode_02
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��4��13�� ����2:35:50
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
* @ClassName: Solution169����������
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��4��13�� ����2:35:50
*/
public class Solution169 {
    public int majorityElement(int[] nums) {
    	//�Լ��ķ���  ��ʱ�е㳤
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for(int i : nums){
        	freq.put(i, freq.getOrDefault(i, 1) + 1);
        }
        //mapȡ����������Сvalue����
       /* Collection<Integer> collection = freq.values();
        Object[] obj = collection.toArray();
        Arrays.sort(obj);*/
        //mapȡ������Сvalueֵ����Ӧ��keyֵ�ķ���
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());
        Collections.sort(list , (o1,o2) -> (o1.getValue() - o2.getValue())); //lambda���ʽ  ��������
        return list.get(list.size() - 1).getKey();
    }
    //��������
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
