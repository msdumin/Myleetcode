/**  
* @Title: Solution557.java����
* @Package EasyCode_02
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��4��3�� ����8:54:30
* @version V1.0  
*/
package EasyCode_02;

/**
* @ClassName: Solution557������ת�ַ����ĵ���
* @Description: TODO
* 	����: "Let's take LeetCode contest"
	���: "s'teL ekat edoCteeL tsetnoc" 
* @author msdumin@gmail.com
* @date 2019��4��3�� ����8:54:30
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
