/**  
* @Title: Solution145.java——
* @Package HardCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年4月2日 上午10:48:27
* @version V1.0  
*/
package HardCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
* @ClassName: Solution145——二叉树的后序遍历
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年4月2日 上午10:48:27
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
	//迭代实现（使用栈）
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

