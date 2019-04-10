/**  
* @Title: Solution279.java——
* @Package MiddleCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年4月2日 下午5:19:08
* @version V1.0  
*/
package MiddleCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

/**
* @ClassName: Solution279——完全平方数
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年4月2日 下午5:19:08
*/


public class Solution279 {
	
	private class Pair{
		int number;
		int step;
		public Pair(int number , int step) {
			this.number = number;
			this.step = step;
		}
	}
    public int numSquares(int n) {
    	
    	Queue<Pair> queue = new ArrayDeque<>();
    	queue.add(new Pair(n , 0));
    	boolean[] visited = new boolean[n+1];
    	visited[n] = true;
    	
    	while(!queue.isEmpty()){
    		int num = queue.peek().number;
    		int step = queue.peek().step;
    		queue.poll();
    		
    		if(num == 0)
    			return step;
    		
    		for(int i = 1 ; num - i*i >= 0 ; i ++){
    			if(!visited[num - i*i]){
    				queue.add(new Pair(num - i*i, step + 1));
    				visited[num - i*i] = true;
    			}
    		}
    	}
    	throw new IllegalStateException("No solution");
    }
    public static void main(String[] args) {
		int n = 17;
		Solution279 sol = new Solution279();
		int ans = sol.numSquares(n);
		System.out.println(ans);
	}
}
