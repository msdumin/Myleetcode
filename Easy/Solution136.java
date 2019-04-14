/**  
* @Title: Solution136.java����
* @Package EasyCode_02
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��4��13�� ����1:59:22
* @version V1.0  
*/
package EasyCode_02;

import java.util.Arrays;

/**
* @ClassName: Solution136����ֻ����һ�ε�����
* @Description: TODO  �ǿ���������    Ҫ������ʱ�临�Ӷ�O��n�����ռ临�Ӷ�O��1��
* @author msdumin@gmail.com
* @date 2019��4��13�� ����1:59:22
*/
public class Solution136 {
	//���ʱ�临�Ӷ�ʵ�����ǲ�����Ҫ��ģ���������leetcode��ͨ���˲���
/*    public int singleNumber(int[] nums) {
        //������
    	Arrays.sort(nums);
    	for(int i = 0 , j = 1 ; j < nums.length ; ) {
    		if(nums[i] != nums[j])
    			return nums[i];
    		else{
    			i +=2;
    			j +=2;
    		}
    	}
    	return nums[nums.length - 1];
    }*/
    
    //����ⷨ���������������ص㣬��ͬ�����־�������������Ϊ0������������һ�ε������⣬�������ֶ��ǳ������εģ�
	//��ô��Щ���־�������������һ����0�����κ�������0����������㶼�Ǹ����ֱ������Զ���������Ԫ�ؽ���������㣬������������Ŀ�Ĵ𰸡�
    public static int singleNumber(int[] nums) {
        int ans = nums[0];
    	for(int i = 1, len = nums.length; i < len; i++){
    	    ans ^= nums[i];
    	}
    	return ans;
    }
    
    public static void main(String[] args) {
		int[] nums = {1,3,3,4,5,1,4,6,5};
		System.out.println(singleNumber(nums));
	}
}
