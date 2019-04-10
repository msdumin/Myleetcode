/**  
* @Title: Solution03.java——
* @Package MiddleCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月25日 上午10:37:12
* @version V1.0  
*/
package MiddleCode;

/**
* @ClassName: Solution03——无重复字符的最长子串  （滑动窗口问题）
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年3月25日 上午10:37:12
*/
public class Solution03 {
	 public static int lengthOfLongestSubstring(String s) {
		 int l = 0 , r = -1;
		 
		 int res = 0;
		 if(s.length() == 0)
			 return 0;
		 
		 //建一个查找表
		 int[] count = new int[256];
		 while(l < s.length()){
			 
			 if(r+1 < s.length() && count[s.charAt(r+1)] == 0)
				 count[s.charAt(++r)]++;
			 else
				 //这里为什么不直接跳转到重复字符的位置？？ ——因为时间复杂度会变高，你需要去遍历一遍数组，找到l该滑动到的位置
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
