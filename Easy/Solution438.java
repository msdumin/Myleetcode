/**  
* @Title: Solution438.java——
* @Package EasyCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月25日 上午10:48:23
* @version V1.0  
*/
package EasyCode;

import java.util.ArrayList;
import java.util.List;

/**
* @ClassName: Solution438——找到字符串中所有字母异位词  （滑动窗口）
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年3月25日 上午10:48:23
*/
public class Solution438 {
	public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ls = new ArrayList<>();
      
        if(s.length() < p.length() || s == null || p == null)
        	return ls;
        //按题意p非空，只包含小写字母
        //建查找表   
        int[] freq = new int[26];
        for(int i = 0 ; i < p.length() ; i ++){
        	freq[p.charAt(i) - 'a'] ++;
        }
        
        int[] sfreq = new int[26];
        int l = 0 , r = -1;
        //窗口的左边界最多滑动到(s.length() - p.length()) + 1
        while(l <= s.length() - p.length()){
        	//窗口小于p.length()时扩大窗口
        	if(r-l+1 < p.length() && r < s.length()){
        		++r;
        		sfreq[s.charAt(r) - 'a'] ++;
        	}//移动窗口
        	else{
        		int i = 0;
            	for( ; i < 26 ; i++){
            		if(freq[i] != sfreq[i])	break;
            	}
            	if(i == 26) ls.add(l);
            	//加一个数组越界判定
            	if(r + 1  == s.length())	break;
            	
            	sfreq[s.charAt(++r) - 'a'] ++;
            	sfreq[s.charAt(l++) - 'a'] --;
            	
        	}
        }
        return ls;
    }
	
	public static void main(String[] args) {
		String s = "abab";
		String p = "ab";
		List<Integer> list = new ArrayList<>();
		list = findAnagrams(s, p);
		for(int i : list)
			System.out.print(i + " ");
	}
}
