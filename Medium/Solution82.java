/**  
* @Title: Solution82.java——
* @Package MiddleCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月28日 下午7:37:40
* @version V1.0  
*/
package MiddleCode;

import javax.naming.spi.DirStateFactory.Result;

/**
* @ClassName: Solution82——删除重复元素II 链表
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年3月28日 下午7:37:40
*/
public class Solution82 {
    public static ListNode deleteDuplicates(ListNode head) {
    	if(head == null || head.next == null)	return null;
    	
    	ListNode fakeNode = new ListNode(-1);
    	ListNode res = fakeNode;
    	ListNode pre = head;
    	ListNode cur = head;

//    	while(cur != null && cur.next != null){
//    		while(cur.next != null && cur.next.val == pre.val)
//    			cur = cur.next;
//    		
//    		if(cur == pre){
//    			res.next = pre;
//    			res = res.next;
//    		}
//    		pre = cur.next;
//        	cur = cur.next;
//    	}	
//    	res.next = cur;
//    	return fakeNode.next;
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	}
    }
    public static void main(String[] args) {
		int[] arr = {1,1,1,1};
		ListNode head = new ListNode(arr);
		ListNode retHead = deleteDuplicates(head);
		System.out.println(retHead);
	}
}
