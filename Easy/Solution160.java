/**  
* @Title: Solution160.java——
* @Package EasyCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月29日 上午10:43:47
* @version V1.0  
*/
package EasyCode_01;

/**
* @ClassName: Solution160——相交链表
* @Description: TODO编写一个程序，找到两个单链表相交的起始节点。
* @author msdumin@gmail.com
* @date 2019年3月29日 上午10:43:47
*/
public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
    	ListNode dummyHeadA = headA;
    	ListNode dummyheadB = headB;
    	ListNode pA = dummyHeadA;
    	ListNode pB = dummyheadB;
    	while(pA.next != null && pB.next != null){
    		if(pA.next.val == pB.next.val)
    	}
    	
    }
}
