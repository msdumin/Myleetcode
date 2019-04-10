/**  
* @Title: Solution112.java——
* @Package EasyCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年4月3日 下午4:41:26
* @version V1.0  
*/
package EasyCode_01;

/**
* @ClassName: Solution112——路径总和    根节点到叶子节点为一条路径
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年4月3日 下午4:41:26
*/

//注意递归终止条件的考虑  一定要仔细思考周全
public class Solution112 {
    public boolean hasPathSum(TreeNode root, int sum) {
    	if(root == null)
    		return false;
    	
        if(root.left == null && root.right == null)
        	return root.val == sum;
        
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
