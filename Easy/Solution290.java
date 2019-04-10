/**  
* @Title: Solution290.java——
* @Package EasyCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月25日 下午8:37:45
* @version V1.0  
*/
package EasyCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
* @ClassName: Solution290——单词模式
* 给定一种 pattern(模式) 和一个字符串 str ，判断 str 是否遵循相同的模式。
* 	输入: pattern = "abba", str = "dog cat cat dog"
	输出: true
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年3月25日 下午8:37:45
*/
public class Solution290 {
	 public static boolean wordPattern(String pattern, String str) {
		 //其实就是一个映射问题
		 String[] s = str.split(" ");
		 if(s.length != pattern.length())
			 return false;
		 if(s.length == 0 && pattern.length() != 0)
			 return false;
		 if(s.length != 0 && pattern.length() == 0)
			 return false;
		 if(s.length == 0 && pattern.length() == 0)
			 return true;
		 
		 Map<Character, String> map = new HashMap<>();
		 Set<String> set = new HashSet<>();
		 
		 for(int i = 0 ; i < pattern.length() ; i ++){
			 if(!map.containsKey(pattern.charAt(i))){
				 if(set.contains(s[i]))
					 return false;
				 else{
					 map.put(pattern.charAt(i), s[i]);
					 set.add(s[i]);
				 }
			 }else{
				 if(!map.get(pattern.charAt(i)).equals(s[i]))
					 return false;
			 }
		 }
		 return true;
	}
	 
	 public static void main(String[] args) {
		String pattern = "abba";
		String str = "dog cat cat dog";
		System.out.println(wordPattern(pattern, str));
	}
}
