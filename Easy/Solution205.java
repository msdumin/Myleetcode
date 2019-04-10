/**  
* @Title: Solution205.java——
* @Package EasyCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月25日 下午8:40:01
* @version V1.0  
*/
package EasyCode;

import java.util.HashMap;
import java.util.HashSet;

/**
* @ClassName: Solution205——同构字符串
* 给定两个字符串 s 和 t，判断它们是否是同构的。
如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。
两个字符不能映射到同一个字符上，但字符可以映射自己本身。
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年3月25日 下午8:40:01
*/
public class Solution205 {
	public static boolean isIsomorphic(String s, String t) {
		
        if(s.length() != t.length())
        	return false;
        
        if(s == null && t == null)
        	return true;
        
        if(s == null && t != null)
        	return false;
        
        if(s != null && t == null)
        	return false;
        HashSet<Character> set = new HashSet<>(s.length());
        HashMap<Character, Character> map = new HashMap<>(s.length());
        
        for(int i = 0; i < s.length() ; i ++){
        	//不存在键值，就建立映射
        	if(!map.containsKey(s.charAt(i))){
        		//如果要存入的键不存在，但是对应的值却已经存在了，直接返回false
        		if(set.contains(t.charAt(i)))	return false;
        		else{
        			map.put(s.charAt(i) , t.charAt(i));
        			set.add(t.charAt(i));
        		}
        	}
        	else{//存在键值了，看t字符串中的字符是否和键中存储的值相等
        		if(map.get(s.charAt(i)) != t.charAt(i))
        			return false;
        	}
        }
        return true;
    }
	
	public static void main(String[] args) {
		String s = "ab";
		String t = "aa";
		System.out.println(isIsomorphic(s, t));
	}
}
