/**  
* @Title: Solution86.java——
* @Package MiddleCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月27日 下午2:39:01
* @version V1.0  
*/
package MiddleCode;

/**
* @ClassName: Solution86——分隔链表
* @Description: TODO
* 给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。
你应当保留两个分区中每个节点的初始相对位置。
输入: head = 1->4->3->2->5->2, x = 3
输出: 1->2->2->4->3->5
* @author msdumin@gmail.com
* @date 2019年3月27日 下午2:39:01
*/
public class Solution86 {
//    public ListNode partition(ListNode head, int x) {
//    	
//    	if(head == null || head.next == null)
//    		return head;
        //超时了
//    	ListNode p = head;
//    	ListNode point = head;
//    	ListNode q = head;
//    	ListNode qHead = head;
//    	
//    	while(point.next != null){
//    		if(point.next != null && point.next.val < x)
//    			point = point.next;
//    		else if(point.next != null && point.next.val >= x){
//    			p = point;
//    			point = point.next;
//    			q = point;
//    			qHead = point;
//    			break;
//    		}
//    	}
//    	while(point.next != null){
//    		if(point.next != null && point.next.val < x){
//    			p.next = point.next;
//    			p = p.next;
//    			point = point.next;
//    		}else if(point.next != null && point.next.val >=x){
//    			qHead.next = point.next;
//    			q = q.next;
//    			point = point.next;
//    		}
//    	}
//    	p.next = qHead;
//    	return head;
//    }
	 public static ListNode partition(ListNode head, int x) {
	        ListNode preHead=new ListNode(0);
	        preHead.next=head;
	        ListNode pre=preHead;
	        ListNode cur=head;
	        ListNode insertPos=null;
	        while(cur!=null){
	            //定位需要插入的位置;
	            if(cur.val>=x && insertPos==null){
	                insertPos=pre;
	            }
	            //插入操作;
	            if(cur.val<x && insertPos!=null){
	                pre.next=pre.next.next;
	                cur.next=insertPos.next;
	                insertPos.next=cur;
	                insertPos=insertPos.next;
	                cur=pre.next;
	                continue;
	            }
	            pre=pre.next;
	            cur=cur.next;
	        }
	        return preHead.next;
	    }
    public static void main(String[] args) {
		int[] arr = {1,4,3,2,5,2,7};
		int x = 3;
		ListNode head = new ListNode(arr);
		System.out.println(partition(head, x));;
	}
}
