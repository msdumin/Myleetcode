/**  
* @Title: Solution46.java——
* @Package MiddleCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年4月10日 下午8:53:24
* @version V1.0  
*/
package MiddleCode_01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
* @ClassName: Solution46——全排列（回溯算法）
* @Description: TODO
* 
输入: [1,2,3]
输出:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
* @author msdumin@gmail.com
* @date 2019年4月10日 下午8:53:24
*/
public class Solution46 {
	
	ArrayList<List<Integer>> res;
	boolean[] used;
	
	//数组p中保存了一个有index个元素的排列
	//函数向这个排列的末尾添加第index+1个元素，获得一个有index+1个元素的排列
	@SuppressWarnings("unchecked")
	private void generatePermute(int[] nums , int index , LinkedList<Integer> p){
		//递归终止条件
		if(index == nums.length){
			//这里有一个陷阱，如果直接add(p)的话，相当于存入的是指向p的索引，当p发生改变时res所存储的数据也会跟着改变
			//所以此处要使用add((LinkedList<Integer>) p.clone)  浅表副本(shallow copy)——只是将原对象的每个字段的值拷贝到克隆体中
			res.add((List<Integer>) p.clone());
			return ;
		}
		//递归函数体
		for(int i = 0 ; i < nums.length ; i ++)
			if(!used[i]){
				p.addLast(nums[i]);
				used[i] = true;
				generatePermute(nums, index + 1, p);
				//用过nums[i]之后现在程序回溯到了这里
				p.removeLast();
				used[i] = false;
			}
		return ;
	}
	
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<List<Integer>>();
    	
    	if(nums.length == 0 || nums == null)
    		return res;
    	
    	LinkedList<Integer> p = new LinkedList<>();
    	used = new boolean[nums.length];
    	generatePermute(nums, 0, p);
    	
    	return res;
    }
    
    public static void main(String[] args) {
    	int[] nums = {1,2,3};
    	List<List<Integer>> res = new Solution46().permute(nums);
    	for(List<Integer> list : res)
    		for(int i : list)
    			System.out.println(i);
	}
}
