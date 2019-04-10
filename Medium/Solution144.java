/**  
* @Title: Solution144.java����
* @Package MiddleCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��3��29�� ����5:24:14
* @version V1.0  
*/
package MiddleCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/**
* @ClassName: Solution144������������ǰ�����
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��3��29�� ����5:24:14
*/

 class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
public class Solution144 {
	//�ݹ�ʵ��
/*		public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> ls = new ArrayList<>();
		preorderTraversal(root , ls);
		return ls;
		}
     private void preorderTraversal(TreeNode node , List<Integer> list){
    	 if(node == null)
    		 return ;
    	 
    	 list.add(node.val);
    	 preorderTraversal(node.left , list);
    	 preorderTraversal(node.right, list);
     }*/
	
	//����ʵ�֣�ʹ��ջ��
	class Command{
		String s;
		TreeNode node;
		public Command(String s , TreeNode node) {
			this.s = s;
			this.node = node;
		}
	}
	public List<Integer> preorderTraversal(TreeNode root){
		List<Integer> ls = new ArrayList<>();
		if(root == null)
			return ls;
		
		Stack<Command> stack = new Stack<>();
		stack.push(new Command("go" , root));
		while(!stack.isEmpty()){
			Command command = stack.pop();
			if(command.s.equals("print"))
				ls.add(command.node.val);
			else{
				if(command.node.right != null)
					stack.push(new Command("go", command.node.right));
				if(command.node.left != null)
					stack.push(new Command("go", command.node.left));
				stack.push(new Command("print", command.node));
			}
		}
		return ls;
	}
}
