/**  
* @Title: Solution112.java����
* @Package EasyCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��4��3�� ����4:41:26
* @version V1.0  
*/
package EasyCode_01;

/**
* @ClassName: Solution112����·���ܺ�    ���ڵ㵽Ҷ�ӽڵ�Ϊһ��·��
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��4��3�� ����4:41:26
*/

//ע��ݹ���ֹ�����Ŀ���  һ��Ҫ��ϸ˼����ȫ
public class Solution112 {
    public boolean hasPathSum(TreeNode root, int sum) {
    	if(root == null)
    		return false;
    	
        if(root.left == null && root.right == null)
        	return root.val == sum;
        
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
