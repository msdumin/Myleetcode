/**  
* @Title: Solution876.java����
* @Package EasyCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��3��29�� ����10:14:20
* @version V1.0  
*/
package EasyCode_01;

/**
* @ClassName: Solution876����
* @Description: TODO
* ����һ������ͷ��� head �ķǿյ���������������м��㡣
����������м��㣬�򷵻صڶ����м��㡣
* @author msdumin@gmail.com
* @date 2019��3��29�� ����10:14:20
*/
public class Solution876 {
    public static ListNode middleNode(ListNode head) {
    	
    	ListNode dummyHead = new ListNode(-1);
    	dummyHead.next = head;
    	ListNode p = dummyHead;
    	ListNode q = dummyHead;
    	
    	
    	//ͳ������ĳ���
    	int n = 0;
    	while(p.next != null){
    		n++;
    		p = p.next;
    	}
//    	if(n % 2 == 0){
    		for(int i = 0 ; i < n/2 ; i ++){
    			q = q.next;
    		}
    		ListNode deListNode = q.next;
			q.next = deListNode.next;
			return deListNode;
//    	}
    		
    }
    public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		ListNode head = new ListNode(arr);
		ListNode myhead = middleNode(head);
		System.out.println(myhead);
	}
}
