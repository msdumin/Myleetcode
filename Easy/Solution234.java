/**  
* @Title: Solution234.java����
* @Package EasyCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��3��29�� ����2:44:50
* @version V1.0  
*/
package EasyCode_01;

/**
* @ClassName: Solution234������������
* @Description: TODOҪ����O(1)�ռ临�Ӷ� ���Բ��ܽ����ⲿ������  Ҫ��ԭ��ʵ��
* @author msdumin@gmail.com
* @date 2019��3��29�� ����2:44:50
*/
public class Solution234 {
	//�Լ�д������ܲ������е�leetcode��������
/*    public static boolean isPalindrome(ListNode head) {
    	
        if(head == null)	return true;
        if(head.next == null)	return true;
        
        ListNode dummyHead = new ListNode(-1);
        ListNode p = head;
        ListNode halfHead = head;
        dummyHead.next = head;
        ListNode count = dummyHead;
        
        int n = 0;
        //����������
        while(count.next != null){
        	n++;
        	count = count.next;
        }
      //ż�����ڵ�
    	if(n % 2 != 0)	n += 1;
    	for(int i = 0 ; i < n / 2 ; i++){
    		p = p.next;
    	}
    	//��ת��벿������...
    	ListNode pre = p;
    	ListNode cur = p.next;
    	halfHead = cur;
    	if(halfHead == null){
    		return pre.val == head.val;
    	}else{
    		while(cur != null){//ע���Ƿ�Խ��
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
	//���˵Ĵ���
	public static boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)//�ҵ������е�
            return true;
        ListNode p = head, q = head;
        while(q != null && q.next != null){
            p = p.next;
            q = q.next.next;
        }
        ListNode prev = null;//����ԭ�ط�ת
        while(p!= null){
            ListNode temp = p.next;
            p.next = prev;
            prev = p;
            p = temp;
        }
        //��ʼ�ȽϽڵ��Ƿ���ͬ
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
