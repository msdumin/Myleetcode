/**  
* @Title: Solution198.java����
* @Package EasyCode_02
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��4��16�� ����11:25:35
* @version V1.0  
*/
package EasyCode_02;

import java.util.Arrays;

/**
* @ClassName: Solution198������ҽ���
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��4��16�� ����11:25:35
*/
public class Solution198 {
	//���仯��������
	public int[] memo;
	private int tryRob(int[] nums , int index){
		//�ݹ��������
		if(index >= nums.length)
			return 0;
		
        if(memo[index] != -1)
        	return memo[index];
		//�ݹ麯��
		int res = 0;
		for (int i = index; i < nums.length; i++) {
			res = Math.max(res , nums[i] + tryRob(nums, i + 2));
		}
		memo[index] = res;
		return res;
	} 
    public int rob(int[] nums) {
    	memo = new int[nums.length];
    	Arrays.fill(memo, -1);
        int res = tryRob(nums, 0);
        return res;
    }
    
    //��̬�滮�ⷨ
    public int rob1(int[] nums) {
    	int[] record;
    	int n = nums.length;
    	if(nums.length == 0)
    		return 0;
    	
    	record = new int[nums.length];
    	Arrays.fill(record, -1);
    	
    	//record[i] ��ʾ����͵ȡ[i...n-1]��Χ�ڵķ���
    	record[n-1] = nums[n-1];
    	for(int i = n-2 ; i >= 0 ; i --)
    		for(int j = i ; j < n ; j ++){
    			record[i] = Math.max(record[i], nums[j] + (j+2 < n ? record[j + 2] : 0));
    		}
    	return record[0];
    }
    
    
    public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		System.out.println(new Solution198().rob1(nums));
	}
}
