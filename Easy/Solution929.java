/**  
* @Title: Solution929.java——
* @Package EasyCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年4月1日 下午9:57:32
* @version V1.0  
*/
package EasyCode_01;

import java.util.HashSet;

/**
* @ClassName: Solution929——
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年4月1日 下午9:57:32
*/
public class Solution929 {
	//非正则方法
    public int numUniqueEmails(String[] emails) {
    	HashSet<String> set = new HashSet<>();
        for(String s : emails){
        	String[] perform = s.split("@");
        	perform[0] = perform[0].replaceAll("\\.", "");
        	String[] perform1 = perform[0].split("\\+");
        	
        	set.add(perform1[0] + perform[1]);
        }
        return set.size();
    }
}
