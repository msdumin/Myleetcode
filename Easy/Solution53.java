/**  
* @Title: Solution53.java����
* @Package EasyCode_02
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��4��17�� ����10:03:31
* @version V1.0  
*/
package EasyCode_02;

/**
* @ClassName: Solution53������������
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��4��17�� ����10:03:31
*/
public class Solution53 {
    public static int maxSubArray(int[] nums) {
        //�Ҿ��ÿ����û�������ȥ��   ������Ŀ˵�������÷��η�����ʲô��...�ȳ����»�������
    	//���������������º���û�д��ڳ��ȡ�������
    	
    	//O(n)����Ľⷨ
    	//˼·���ǣ��ӵ�һ������ʼ���һֱ����ȥ�Ͷ�Ϊ������maxSum�͸�ֵ��������У�һ���������Ϊ���ˣ�����������У����������еĿ�ͷ
    	if(nums.length == 0)
    		return 0;
    	int maxSum = nums[0] ; 
    	int thisSum = 0;
    	for (int i = 0; i < nums.length; i++) {
			thisSum += nums[i];
			if(thisSum > maxSum)
				maxSum = thisSum;
			if(thisSum <= 0)
				thisSum = 0;
		}
    	return maxSum;
    }
    public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}
}
