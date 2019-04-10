/**  
* @Title: Solution447.java——
* @Package EasyCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月26日 下午8:56:51
* @version V1.0  
*/
package EasyCode;

import java.util.HashMap;
import java.util.Map;

/**
* @ClassName: Solution447——回旋镖的数量
* @Description: TODO
* 输入:
	[[0,0],[1,0],[2,0]]

	输出:
	2
* @author msdumin@gmail.com
* @date 2019年3月26日 下午8:56:51
*/
public class Solution447 {
	public int numberOfBoomerangs(int[][] points) {
        int res = 0;
		for (int i = 0; i < points.length; i++) {
			//建查找表   key存距离points[i]点的距离  value存有相同距离的点的个数
			Map<Integer, Integer> map = new HashMap<>();
			for(int j = 0 ; j < points.length ; j ++){
				if(j != i){
					//计算其他点到点i的距离值
					int dis = dis(points[i] , points[j]);
					if(map.containsKey(dis))
						map.put(dis, map.get(dis) + 1);
					else
						map.put(dis, 1);
				}
			}
			for(Integer dis : map.keySet())
				res += map.get(dis) * (map.get(dis) - 1);
		}
		return res;
    }
	private static int dis(int[] a , int[] b){
		return (((a[0] - b[0]) * (a[0] - b[0])) + ((a[1] - b[1]) * (a[1] - b[1])));
	}
}
