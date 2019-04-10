/**  
* @Title: Solution03.java����
* @Package MiddleCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��3��25�� ����10:37:12
* @version V1.0  
*/
package MiddleCode;

/**
* @ClassName: Solution03�������ظ��ַ�����Ӵ�  �������������⣩
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��3��25�� ����10:37:12
*/
public class Solution03 {
	 public static int lengthOfLongestSubstring(String s) {
		 int l = 0 , r = -1;
		 
		 int res = 0;
		 if(s.length() == 0)
			 return 0;
		 
		 //��һ�����ұ�
		 int[] count = new int[256];
		 while(l < s.length()){
			 
			 if(r+1 < s.length() && count[s.charAt(r+1)] == 0)
				 count[s.charAt(++r)]++;
			 else
				 //����Ϊʲô��ֱ����ת���ظ��ַ���λ�ã��� ������Ϊʱ�临�ӶȻ��ߣ�����Ҫȥ����һ�����飬�ҵ�l�û�������λ��
				 count[s.charAt(l++)] --; 
			 
			 res = Math.max(res, r - l + 1);
		 }
		 return res;
	 }
	 public static void main(String[] args) {
		String string = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(string));
	}
}
