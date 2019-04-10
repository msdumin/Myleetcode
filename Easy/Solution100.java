/**  
* @Title: Solution100.java——
* @Package EasyCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年4月3日 下午3:20:11
* @version V1.0  
*/
package EasyCode_01;

/**
* @ClassName: Solution100——相同的树
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年4月3日 下午3:20:11
*/
public class Solution100 {
	//递归解法
   /* public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
        	return true;
        
        if((p != null && q == null) || (p == null) && (q != null))
        	return false;
        
        if(p.val != q.val)
        	return false;
        
        return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }*/
    
    //迭代解法
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	
    }
}
