/**  
* @Title: Solution328.java����
* @Package MiddleCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��3��27�� ����2:41:29
* @version V1.0  
*/
package MiddleCode;

/**
* @ClassName: Solution328������ż����
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��3��27�� ����2:41:29
*/
public class Solution328 {
	 public ListNode oddEvenList(ListNode head) {
		 
		 if(head == null || head.next == null)
			 return head;
		 
		 ListNode o = head;
		 ListNode p = head.next;
		 ListNode e = p;
		 while(o.next != null && e.next != null){
			 o.next = e.next;
			 o = o.next;
			 e.next = o.next;
			 e = e.next;
		 }
		 o.next = p;
		 return head;
	 }
}
