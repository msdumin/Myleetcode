/**  
* @Title: Solution102.java����
* @Package MiddleCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��4��2�� ����11:13:19
* @version V1.0  
*/
package MiddleCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javafx.util.*;


/**
* @ClassName: Solution102�����������Ĳ�α���
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��4��2�� ����11:13:19
*/


public class Solution102 {
	//�Խ�һ��Pair��
	private class Pair{
		TreeNode node;
		int level;
		public Pair(TreeNode node , int level) {
			this.node = node;
			this.level = level;
		}
		public TreeNode getNode() {
			return node;
		}
		public int getLevel() {
			return level;
		}
	}
    public List< List<Integer> > levelOrder(TreeNode root) {
    	
    	ArrayList<List<Integer>> list = new ArrayList<>();
        
        if(root == null)
        	return list;
        
        LinkedList<Pair> queue = new LinkedList<>();
        queue.addLast(new Pair(root, 0));
        
        while(!queue.isEmpty()){
        	TreeNode node = queue.getFirst().node;
        	int level = queue.getFirst().level;
        	queue.removeFirst();
        	//level��㻹û�У����½�һ����
        	if(level == list.size())
        		list.add(new ArrayList<>());
        	//����ֱ������һ�����Ԫ��
        	list.get(level).add(node.val);
        	
        	if(node.left != null){
        		queue.addLast(new Pair(node.left, level + 1));
        	}
        	if(node.right != null){
        		queue.addLast(new Pair(node.right, level + 1));
        	}
        }
        return list;
    }
}
