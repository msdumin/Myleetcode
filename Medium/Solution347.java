/**  
* @Title: Solution347.java——
* @Package MiddleCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年4月2日 下午10:03:59
* @version V1.0  
*/
package MiddleCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
* @ClassName: Solution347——TOPK问题
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年4月2日 下午10:03:59
*/
public class Solution347 {
	public class Freq implements Comparable<Freq>{
		int e;
		int freq;
		public Freq(int e , int freq) {
			this.e = e;
			this.freq = freq;
		}
		@Override
		public int compareTo(Freq o) {
			if(this.freq > o.freq)
				return 1;
			else if(this.freq < o.freq)
				return -1;
			else
				return 0;
		}
		@Override
		public String toString() {
			return "[" + this.e + "," + this.freq + "]";
		}
	}
	
    public List<Integer> topKFrequent(int[] nums, int k) {
    	//方法1：先对数组排序 再取前K元素 时间复杂度为O(nlogn)
    	//----------------------------------
    	//方法2：优先队列维护K个元素  时间复杂度O(nlogk)
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        
        for(int i = 0 ; i < nums.length ; i ++){
        	map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        PriorityQueue<Freq> queue = new PriorityQueue<>();
        for(int key : map.keySet()){
        	if(queue.size() < k)
        		queue.add(new Freq(key, map.get(key)));
        	else{
        		if(map.get(key) > queue.peek().freq){
        			queue.poll();
        			queue.add(new Freq(key, map.get(key)));
        		}
        	}
        }
        while(!queue.isEmpty()){
        	res.add(queue.poll().e);
        }
        return res;
     /*   int[] arr = new int[queue.size()];
        arr = set.toArray();*/
    }
    private static void printList(List<Integer> nums){
        for(Integer num: nums)
            System.out.print(num + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] nums = {4,1,-1,2,-1,2,3};
        int k = 2;
        printList(new Solution347().topKFrequent(nums, k));
	}
}
