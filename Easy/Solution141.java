/**  
* @Title: Solution141.java����
* @Package EasyCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��3��29�� ����11:03:37
* @version V1.0  
*/
package EasyCode_01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
* @ClassName: Solution141������������
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��3��29�� ����11:03:37
*/
public class Solution141 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> s = new HashSet<>();
        
        while(head != null){
        	if(s.contains(head))
        		return true;
        	else
        		s.add(head);
        	//û��Խ���쳣
        	head = head.next;	
        }
        return false;
    }
}
