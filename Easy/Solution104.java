/**  
* @Title: Solution104.java����
* @Package EasyCode_02
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��4��13�� ����1:23:53
* @version V1.0  
*/
package EasyCode_02;

/**
* @ClassName: Solution104����
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��4��13�� ����1:23:53
*/
public class Solution104 {
    public int maxDepth(TreeNode root) {
    	//�ݹ���ֹ����
    	if(root == null)
    		return 0;
    	
    	int depth = 1;
    	int left = depth + maxDepth(root.left);
    	int right = depth + maxDepth(root.right);
    	return Math.max(left, right);
    }
}
