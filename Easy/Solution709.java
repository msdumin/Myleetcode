/**  
* @Title: Solution709.java——
* @Package EasyCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月27日 下午4:33:25
* @version V1.0  
*/
package EasyCode;

/**
* @ClassName: Solution709——
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年3月27日 下午4:33:25
*/
public class Solution709 {
    public String toLowerCase(String str) {
        if(str == null)
        	return null;
        
        StringBuilder sb = new StringBuilder();
       
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
        	char c = arr[i];
        	if(c >= 'a' && c <= 'z')
        		sb.append(c);
        	else if(c >= 'A' && c <= 'Z'){
        		c = (char) (c + ('a' - 'A'));
        		sb.append(c);
        	}else {
				sb.append(c);
			}	
		}
        return sb.toString();
    }
}
