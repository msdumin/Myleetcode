/**  
* @Title: Solution455.java——
* @Package EasyCode_02
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年4月19日 上午10:27:59
* @version V1.0  
*/
package EasyCode_02;

import java.util.Arrays;
import java.util.Collections;

/**
* @ClassName: Solution455——分发饼干 (贪心算法)
* @Description: TODO 假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。对每个孩子 i ，
* 都有一个胃口值 gi ，这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j ，都有一个尺寸 sj 。
* 如果 sj >= gi ，我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。
* 你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。
* 注：(你可以假设胃口值为正,一个小朋友最多只能拥有一块饼干。)
* @author msdumin@gmail.com
* @date 2019年4月19日 上午10:27:59
*/
public class Solution455 {
    public static int findContentChildren(int[] g, int[] s) {
    	//先对两个数组进行排序，因为每次需要取最大值
    	//排序时间复杂度为O(nlogn)，所以整个算法的时间复杂度为O(nlogn)
    	Arrays.sort(g);
    	Arrays.sort(s);
    	
        int gi = g.length - 1;
        int si = s.length - 1;
        int res = 0;
        while(gi >= 0 && si >= 0){
        	if(g[gi] <= s[si]){
        		gi--;
        		si--;
        		res++;
        	}else{
        		gi--;
        	}
        }
        return res;
    }
    public static void main(String[] args) {
		int[] g = {1,2,3};
		int[] s = {1,1};
		System.out.println(findContentChildren(g, s));
	}
}
