/**  
* @Title: Solution345.java——
* @Package EasyCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月22日 上午11:25:02
* @version V1.0  
*/
package EasyCode;

/**
* @ClassName: Solution345——反转字符串中的元音字母
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年3月22日 上午11:25:02
*/
public class Solution345 {
    public static String reverseVowels(String s) {
        char[] cs= s.toCharArray();
        int front = 0;
        int tail = cs.length - 1;
        while(front < tail){
        	if(isAeiou(cs[front]) && isAeiou(cs[tail])){
        		Character c = cs[front];
        		cs[front] = cs[tail];
        		cs[tail] = c;
        		front ++;
        		tail --;
        	}
        	if(!isAeiou(cs[front]))
        		front ++;
        	if(!isAeiou(cs[tail]))
        		tail --;
        }
        return new String(cs);
    }
    
    //判是否为aeiouaeiou的函数
    private static boolean isAeiou(Character c){
    	if("aeiouAEIOU".indexOf(c) != -1)	return true;
    	return false;
    }
    
    public static void main(String[] args) {
		String string = "hello";
		System.out.println(reverseVowels(string));
	}
}
