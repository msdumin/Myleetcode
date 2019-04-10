/**  
* @Title: Solution94.java����
* @Package MiddleCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��3��29�� ����5:27:49
* @version V1.0  
*/
package MiddleCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
* @ClassName: Solution94�������������������
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��3��29�� ����5:27:49
*/

class Command{
	String s;
	TreeNode node;
	public Command(String s , TreeNode node) {
		this.s = s;
		this.node = node;
	}
}
public class Solution94 {
	//����ʵ�֣�ʹ��ջ��
	public List<Integer> inorderTraversal(TreeNode root){
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
				
				stack.push(new Command("print", command.node));
				
				if(command.node.left != null)
					stack.push(new Command("go", command.node.left));
			}
		}
		return ls;
	}
}
