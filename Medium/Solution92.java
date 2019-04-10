/**  
* @Title: Solution92.java����
* @Package MiddleCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��3��27�� ����10:36:28
* @version V1.0  
*/
package MiddleCode;

import java.time.Period;

/**
* @ClassName: Solution92������ת����II
* @Description: TODO������ת��λ�� m �� n ��������ʹ��һ��ɨ����ɷ�ת
* @author msdumin@gmail.com
* @date 2019��3��27�� ����10:36:28
*/


public class Solution92 {
    public static ListNode reverseBetween(ListNode head, int m, int n) {
    	
    	if(head == null || head.next == null || m == n)
    		return head;
    	
    	//��һ������ͷ���
    	ListNode dummyHead = new ListNode(-1);
    	dummyHead.next = head;
    	head = dummyHead;
    	
    	//�ҵ���m���ڵ��ǰһ���ڵ�  ��������ڵ�
    	for(int i = 1 ; i < m ; i ++){
    		head = head.next;
    	}
    	ListNode leftNode = head;
    	//��m���ڵ�
    	ListNode mNode = head.next;
    	//���з�ת
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
