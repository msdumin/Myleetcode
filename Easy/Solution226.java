/**  
* @Title: Solution226.java——
* @Package EasyCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年4月3日 下午2:51:22
* @version V1.0  
*/
package EasyCode_01;

import javax.xml.soap.Node;

/**
* @ClassName: Solution226——翻转二叉树
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年4月3日 下午2:51:22
*/
public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
    	
        if(root == null)
        	return null;
        
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        
        root.left = right;
        root.right = left;
//        swapNodeLeftandRight(root);
        return root;
    }
    //不用写这个swap函数，invertTree这个函数是有返回根节点的 所以直接保存一下这个根节点就能用了
/*    private void swapNodeLeftandRight(TreeNode root){
    	TreeNode pNode = new TreeNode(-1);
    	   pNode.left = root.left;
           pNode.right = root.right;
           root.left = pNode.right;
           root.right = pNode.left;
           pNode.left = null;
           pNode.right = null;
    }*/
}
