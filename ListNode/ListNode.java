/**  
* @Title: TestListNode.java����
* @Package EasyCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��3��27�� ����11:26:32
* @version V1.0  
*/
package EasyCode_01;

/**
* @ClassName: TestListNode������ӡ�������Ĺ�����  ��leetcode����Ҫʹ���������Ŀ��
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��3��27�� ����11:26:32
*/
public class ListNode {
	int val;
    ListNode next;
    ListNode(int x) { val = x; }
    
    public ListNode(int[] arr) {
		// TODO Auto-generated constructor stub
    	if(arr == null || arr.length == 0)
    		throw new IllegalArgumentException("arr can not be empty");
    	
    	this.val = arr[0];
    	ListNode curnode = this;
    	for (int i = 1; i < arr.length; i++) {
			curnode.next = new ListNode(arr[i]);
			curnode = curnode.next;
		}
	}
    
    //��������
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder("");
    	ListNode curnode = this;
    	while(curnode != null){
    		sb.append(Integer.toString(curnode.val));
    		sb.append("->");
    		curnode = curnode.next;
    	}
    	sb.append("NULL");
    	return sb.toString();
    }
}
