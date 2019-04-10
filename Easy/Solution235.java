/**  
* @Title: Solution235.java����
* @Package EasyCode_02
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��4��9�� ����11:04:16
* @version V1.0  
*/
package EasyCode_02;

/**
* @ClassName: Solution235���������������Ĺ�������
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��4��9�� ����11:04:16
*/
public class Solution235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      
    	if(root == null)
        	return null;
        
        if(p.val < root.val && q.val < root.val)
        	return lowestCommonAncestor(root.left, p, q);
        if(p.val > root.val && q.val > root.val)
        	return lowestCommonAncestor(root.right, p, q);
        
        return root;
    }
}
