/**  
* @Title: Solution300.java����
* @Package MiddleCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��4��18�� ����9:47:30
* @version V1.0  
*/
package MiddleCode_01;

import java.util.Arrays;

/**
* @ClassName: Solution300���������������
* @Description: TODO ����һ��������������飬�ҵ���������������еĳ��ȡ�
* @author msdumin@gmail.com
* @date 2019��4��18�� ����9:47:30
*/
public class Solution300 {
    public static int lengthOfLIS(int[] nums) {
    	//���������У�������Ԫ�����ʱ������������
    	
    	if(nums.length == 0 || nums == null)
    		return 0;
    	if(nums.length == 1)
    		return 1;
    	//ÿ��Ԫ�صĳ�ʼ����Ϊ1
    	int n = nums.length;
    	//memo[i]���������i��β��Ԫ�ص�����������еĳ���
        int[] memo = new int[n+1];
        Arrays.fill(memo, 1);
        int res = 1;
        
        for (int i = 1; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				if(nums[j] < nums[i])
					//memo[i]��ֵ������Ԫ��i��β������������еĳ����ټ�1
					memo[i] = Math.max(memo[i], memo[j] + 1);
			}
		}
        for (int i = 0; i < memo.length; i++) {
			res = Math.max(res, memo[i]);
		}
        return res;
    }
    public static void main(String[] args) {
		int[] nums = {};
		System.out.println(lengthOfLIS(nums));
	}
}
