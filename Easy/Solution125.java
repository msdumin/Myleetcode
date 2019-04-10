/**  
* @Title: Solution125.java——
* @Package EasyCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月22日 上午11:18:42
* @version V1.0  
*/
package EasyCode;

import java.util.Stack;

/**
* @ClassName: Solution125——验证回文串   不考空格，只考虑子母和符号
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年3月22日 上午11:18:42
*/
public class Solution125 {
	
//思路没对...重来   
/*	public static boolean isPalindrome(String s) {
    	s = s.toLowerCase().replaceAll(" ", "");
        Stack<Character> stack = new Stack<>();
        if(s.length() % 2 != 0)
        	return false;
        for(int i = 0 ; i < s.length(); i++){
        	if(i < s.length() / 2)
        		stack.push(s.charAt(i));
        	else {
				if(!stack.pop().equals(s.charAt(i)))
					return false;
			}
        }
        return true;
    }*/
	
    public static boolean isPalindrome(String s) {
    if (s == null) return true;
    s = s.toLowerCase();
    int l = s.length();
    StringBuilder str = new StringBuilder(l);
    for (char c : s.toCharArray()) {
        if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
            str.append(c);
        }
    }
    return str.toString().equals(str.reverse().toString());
}
	
    public static void main(String[] args) {
		String string = "race a car";
//		string = string.replaceAll(" ", "");
//		System.out.println(string);
		System.out.println(isPalindrome(string));
	}
}
