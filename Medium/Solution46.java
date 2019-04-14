/**  
* @Title: Solution46.java����
* @Package MiddleCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��4��10�� ����8:53:24
* @version V1.0  
*/
package MiddleCode_01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
* @ClassName: Solution46����ȫ���У������㷨��
* @Description: TODO
* 
����: [1,2,3]
���:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
* @author msdumin@gmail.com
* @date 2019��4��10�� ����8:53:24
*/
public class Solution46 {
	
	ArrayList<List<Integer>> res;
	boolean[] used;
	
	//����p�б�����һ����index��Ԫ�ص�����
	//������������е�ĩβ��ӵ�index+1��Ԫ�أ����һ����index+1��Ԫ�ص�����
	@SuppressWarnings("unchecked")
	private void generatePermute(int[] nums , int index , LinkedList<Integer> p){
		//�ݹ���ֹ����
		if(index == nums.length){
			//������һ�����壬���ֱ��add(p)�Ļ����൱�ڴ������ָ��p����������p�����ı�ʱres���洢������Ҳ����Ÿı�
			//���Դ˴�Ҫʹ��add((LinkedList<Integer>) p.clone)  ǳ����(shallow copy)����ֻ�ǽ�ԭ�����ÿ���ֶε�ֵ��������¡����
			res.add((List<Integer>) p.clone());
			return ;
		}
		//�ݹ麯����
		for(int i = 0 ; i < nums.length ; i ++)
			if(!used[i]){
				p.addLast(nums[i]);
				used[i] = true;
				generatePermute(nums, index + 1, p);
				//�ù�nums[i]֮�����ڳ�����ݵ�������
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
