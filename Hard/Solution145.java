/**  
* @Title: Solution145.java����
* @Package HardCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��4��2�� ����10:48:27
* @version V1.0  
*/
package HardCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
* @ClassName: Solution145�����������ĺ������
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��4��2�� ����10:48:27
*/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class Command{
	String s;
	TreeNode node;
	public Command(String s , TreeNode node) {
		this.s = s;
		this.node = node;
	}
}
public class Solution145 {
	//����ʵ�֣�ʹ��ջ��
	public List<Integer> postorderTraversal(TreeNode root){
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
				stack.push(new Command("print", command.node));
				
				if(command.node.right != null)
					stack.push(new Command("go", command.node.right));

				if(command.node.left != null)
					stack.push(new Command("go", command.node.left));
			}
		}
		return ls;
	}
}

