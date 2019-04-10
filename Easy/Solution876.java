/**  
* @Title: Solution876.java——
* @Package EasyCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月29日 上午10:14:20
* @version V1.0  
*/
package EasyCode_01;

/**
* @ClassName: Solution876——
* @Description: TODO
* 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
如果有两个中间结点，则返回第二个中间结点。
* @author msdumin@gmail.com
* @date 2019年3月29日 上午10:14:20
*/
public class Solution876 {
    public static ListNode middleNode(ListNode head) {
    	
    	ListNode dummyHead = new ListNode(-1);
    	dummyHead.next = head;
    	ListNode p = dummyHead;
    	ListNode q = dummyHead;
    	
    	
    	//统计链表的长度
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
