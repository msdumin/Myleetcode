/**  
* @Title: T485.java����
* @Package EasyCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��3��13�� ����9:44:51
* @version V1.0  
*/
package EasyCode;

/**
* @ClassName: T485�����������1�ĸ���
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��3��13�� ����9:44:51
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
