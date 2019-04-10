/**  
* @Title: Solution202.java——
* @Package EasyCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月25日 下午8:36:47
* @version V1.0  
*/
package EasyCode;

/**
* @ClassName: Solution202——编写一个算法来判断一个数是不是“快乐数”。

一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，
也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
小知识：当快乐数始终变不了1时，陷入无限循环时得到的最终结果就是4
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年3月25日 下午8:36:47
*/
public class Solution202 {
	//当快乐数始终变不了1时，陷入无限循环时得到的最终结果就是4
	  public boolean isHappy(int n) {
		  if(n < 0)
			  return false;
		  while(n != 1){
			  n = num(n);
			  if(n == 4)
				  return false;
		  }
		  return true;
	  }
	  
	  //求一个数的每一位上的数字的平方的和
	  public static int num(int x){
		  int ret = 0;
		  while(x!=0){
			  ret += (x%10)*(x%10);
			  x/=10;
		  }
		  return ret;
	  }
}
