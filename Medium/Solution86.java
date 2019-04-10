/**  
* @Title: Solution86.java����
* @Package MiddleCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��3��27�� ����2:39:01
* @version V1.0  
*/
package MiddleCode;

/**
* @ClassName: Solution86�����ָ�����
* @Description: TODO
* ����һ�������һ���ض�ֵ x����������зָ���ʹ������С�� x �Ľڵ㶼�ڴ��ڻ���� x �Ľڵ�֮ǰ��
��Ӧ����������������ÿ���ڵ�ĳ�ʼ���λ�á�
����: head = 1->4->3->2->5->2, x = 3
���: 1->2->2->4->3->5
* @author msdumin@gmail.com
* @date 2019��3��27�� ����2:39:01
*/
public class Solution86 {
//    public ListNode partition(ListNode head, int x) {
//    	
//    	if(head == null || head.next == null)
//    		return head;
        //��ʱ��
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
	            //��λ��Ҫ�����λ��;
	            if(cur.val>=x && insertPos==null){
	                insertPos=pre;
	            }
	            //�������;
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
