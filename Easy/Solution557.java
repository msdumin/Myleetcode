/**  
* @Title: Solution557.java——
* @Package EasyCode_02
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年4月3日 下午8:54:30
* @version V1.0  
*/
package EasyCode_02;

/**
* @ClassName: Solution557——反转字符串的单词
* @Description: TODO
* 	输入: "Let's take LeetCode contest"
	输出: "s'teL ekat edoCteeL tsetnoc" 
* @author msdumin@gmail.com
* @date 2019年4月3日 下午8:54:30
*/
public class Solution557 {

    public static String reverseWords(String s) {
        String[] tmp = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < tmp.length ; i ++){
        	
        	tmp[i] = new StringBuilder(tmp[i]).reverse().toString();
        	if(i == tmp.length - 1)
        		sb.append(tmp[i]);
        	else{
        		sb.append(tmp[i]).append(" ");
        	}
        }
        return sb.toString();
    }
	
/*	public static String reverseWords(String s) {
		
	}*/
    public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));
	}
}
