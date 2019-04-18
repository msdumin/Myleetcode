/**  
* @Title: Solution53.java——
* @Package EasyCode_02
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年4月17日 下午10:03:31
* @version V1.0  
*/
package EasyCode_02;

/**
* @ClassName: Solution53——最大子序和
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年4月17日 下午10:03:31
*/
public class Solution53 {
    public static int maxSubArray(int[] nums) {
        //我觉得可以用滑动窗口去做   但是题目说还可以用分治法？是什么鬼...先尝试下滑动窗口
    	//。。。。。想了下好像没有窗口长度。。算了
    	
    	//O(n)级别的解法
    	//思路就是：从第一个数开始如果一直加下去和都为整数则maxSum就赋值给这个序列，一旦这个序列为负了，则丢弃这个序列，从新找序列的开头
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
