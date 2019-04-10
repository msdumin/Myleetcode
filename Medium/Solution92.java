/**  
* @Title: Solution92.java——
* @Package MiddleCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月27日 上午10:36:28
* @version V1.0  
*/
package MiddleCode;

import java.time.Period;

/**
* @ClassName: Solution92——反转链表II
* @Description: TODO——反转从位置 m 到 n 的链表。请使用一趟扫描完成反转
* @author msdumin@gmail.com
* @date 2019年3月27日 上午10:36:28
*/


public class Solution92 {
    public static ListNode reverseBetween(ListNode head, int m, int n) {
    	
    	if(head == null || head.next == null || m == n)
    		return head;
    	
    	//建一个虚拟头结点
    	ListNode dummyHead = new ListNode(-1);
    	dummyHead.next = head;
    	head = dummyHead;
    	
    	//找到第m个节点的前一个节点  保存这个节点
    	for(int i = 1 ; i < m ; i ++){
    		head = head.next;
    	}
    	ListNode leftNode = head;
    	//第m个节点
    	ListNode mNode = head.next;
    	//进行反转
    	ListNode pre = null;
		ListNode cur = mNode;
    	for(int i = m ; i <= n ; i++){
    		ListNode next = cur.next;
    		cur.next = pre;
    		pre = cur;
    		cur = next;
    	}
    	leftNode.next = pre;
    	mNode.next = cur;
    	return dummyHead.next;
    }
    public static void main(String[] args) {
    	int[] arr = {1,2,3,4,5,6,7,8};
		ListNode head = new ListNode(arr);
		System.out.println(head);
		int m = 2 ,n = 5;
		ListNode head2 = reverseBetween(head, m, n);
		System.out.println(head2);
	}
}
