/**  
* @Title: T485.java——
* @Package EasyCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月13日 上午9:44:51
* @version V1.0  
*/
package EasyCode;

/**
* @ClassName: T485——最大连续1的个数
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年3月13日 上午9:44:51
*/
public class T485 {
	public static void main(String[] args) {
		int[] nums = {1,1,0,1,1,1};
		int counter = 0;
		int size = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 1){
				counter ++;
			}else{
				if(counter > size){
					size = counter;
				}
				counter = 0;
			}
		}
		System.out.println(size > counter ? size : counter);
	}
}
