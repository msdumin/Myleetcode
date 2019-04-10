/**  
* @Title: Solution206.java——
* @Package EasyCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月27日 上午10:04:25
* @version V1.0  
*/
package EasyCode_01;

/**
* @ClassName: Solution206——反转链表
* @Description: TODO
* 	输入: 1->2->3->4->5->NULL
	输出: 5->4->3->2->1->NULL
* @author msdumin@gmail.com
* @date 2019年3月27日 上午10:04:25
*/

 
public class Solution206 {
    public static ListNode reverseList(ListNode head) {
    	
        ListNode pre = null;
        ListNode cur = head;
        
        while(cur != null){
        	ListNode next = cur.next;
        	cur.next = pre;
        	pre = cur;
        	cur = next;
        }
        return pre;
    }
    
    public static void main(String[] args) {
    	int[] arr = {1,2,3,4,5};
		ListNode head = new ListNode(arr);
		System.out.println(head);
		ListNode myHead = reverseList(head);
		System.out.println(myHead);
	}
}