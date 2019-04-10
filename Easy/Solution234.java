/**  
* @Title: Solution234.java——
* @Package EasyCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月29日 下午2:44:50
* @version V1.0  
*/
package EasyCode_01;

/**
* @ClassName: Solution234——回文链表
* @Description: TODO要求是O(1)空间复杂度 所以不能借助外部容器类  要在原地实现
* @author msdumin@gmail.com
* @date 2019年3月29日 下午2:44:50
*/
public class Solution234 {
	//自己写的这个跑不完所有的leetcode测试用例
/*    public static boolean isPalindrome(ListNode head) {
    	
        if(head == null)	return true;
        if(head.next == null)	return true;
        
        ListNode dummyHead = new ListNode(-1);
        ListNode p = head;
        ListNode halfHead = head;
        dummyHead.next = head;
        ListNode count = dummyHead;
        
        int n = 0;
        //计算链表长度
        while(count.next != null){
        	n++;
        	count = count.next;
        }
      //偶数个节点
    	if(n % 2 != 0)	n += 1;
    	for(int i = 0 ; i < n / 2 ; i++){
    		p = p.next;
    	}
    	//反转后半部分链表...
    	ListNode pre = p;
    	ListNode cur = p.next;
    	halfHead = cur;
    	if(halfHead == null){
    		return pre.val == head.val;
    	}else{
    		while(cur != null){//注意是否越界
        		pre.next = cur.next;
        		cur.next = pre;
        		cur = pre.next;
        	}	
    	}
    	for(int i = 0 ; i < n / 2 ; i ++){
    		if(head.val != halfHead.val)
    			return false;
    	}
    	return true;
    }*/
	ERRO
	//别人的代码
	public static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)//找到链表中点
            return true;
        ListNode p = head, q = head;
        while(q != null && q.next != null){
            p = p.next;
            q = q.next.next;
        }
        ListNode prev = null;//链表原地反转
        while(p!= null){
            ListNode temp = p.next;
            p.next = prev;
            prev = p;
            p = temp;
        }
        //开始比较节点是否相同
        ListNode p1 = head;
        ListNode q1=prev;
        while(p1!=null && q1!=null && p1.val==q1.val){
            p1 = p1.next;
            q1 = q1.next;
        }
        return q1==null;
    }

	
    public static void main(String[] args) {
		int[] arr = {1,0,0};
		ListNode head = new ListNode(arr);
		System.out.println(isPalindrome(head));
	}
}
