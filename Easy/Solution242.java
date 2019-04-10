/**  
* @Title: Solution242.java——
* @Package EasyCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月25日 下午8:35:19
* @version V1.0  
*/
package EasyCode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
* @ClassName: Solution242——有效的字母异位词
* 	输入: s = "anagram", t = "nagaram"
	输出: true
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年3月25日 下午8:35:19
*/
public class Solution242 {
	//我的解法：
//	public boolean isAnagram(String s, String t) {
//		
//		if(s.length() != t.length())
//			return false;
//		
//         int[] freq = new int[26];
//         int[] sfreq = new int[26];
//         
//         
//         for(int i = 0 ; i < s.length() ; i ++){
//        	 freq[s.charAt(i) - 'a'] ++;
//         }
//         for(int i = 0; i < t.length() ; i ++){
//        	 sfreq[t.charAt(i) - 'a'] ++;
//         }
//         int i = 0;
//         for( ;i < 26 ; i ++){
//        	 if(freq[i] != sfreq[i])
//        		 break;
//         }
//         if(i == 26)
//        	 return true;
//         return false;
//    }
	
	//老师的解法：思路是先排序 再判断是否相等
	public boolean isAnagram(String s, String t) {
		char[] sArr = s.toCharArray();
		char[] tArr = t.toCharArray();
		
		Arrays.sort(sArr);
		Arrays.sort(tArr);
		//valueOf()
		return String.valueOf(sArr).equals(String.valueOf(tArr));
	}
}
