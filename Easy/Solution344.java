/**  
* @Title: Solution344.java����
* @Package EasyCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��3��22�� ����11:22:33
* @version V1.0  
*/
package EasyCode;

/**
* @ClassName: Solution344������ת�ַ���
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��3��22�� ����11:22:33
*/
public class Solution344 {
	  public void reverseString(char[] s) {
		  int front = 0;
	      int tail = s.length - 1;
	      while(front < tail){
	    	  Character c = s[front];
	    	  s[front] = s[tail];
	    	  s[tail] = c;
	    	  front ++;
	    	  tail--;
	      }
	  }
}
