/**  
* @Title: Solution226.java����
* @Package EasyCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��4��3�� ����2:51:22
* @version V1.0  
*/
package EasyCode_01;

import javax.xml.soap.Node;

/**
* @ClassName: Solution226������ת������
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��4��3�� ����2:51:22
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
    //����д���swap������invertTree����������з��ظ��ڵ�� ����ֱ�ӱ���һ��������ڵ��������
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
