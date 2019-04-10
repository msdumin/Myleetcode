/**  
* @Title: Solution451.java——
* @Package MiddleCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月25日 下午8:42:40
* @version V1.0  
*/
package MiddleCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @ClassName: Solution451——根据字符出现频率排序  给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年3月25日 下午8:42:40
*/
public class Solution451 {
	public static String frequencySort(String s) {
		
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
       
        for(char c : s.toCharArray()){
        	list.add(c);
        	map.put(c, map.getOrDefault(c, 0) + 1);
        }
        //利用comparator对list中的字符排序
        //Comparable如果返回值>,则交换数据，<0或者=0，保持不变。下面这句lambda表达式的解释就是：如果a的频次==b的频次，则返回a-b=0.保持顺序不变。
        //如果不等，则返回b的频次-a的频次，如果是>0的，说明b的频次比较高，则进行交换。
        list.sort((a,b) -> map.get(a) == map.get(b) ? a-b : map.get(b) - map.get(a));
        StringBuilder sb = new StringBuilder();
        for(char c : list)
        	sb.append(c);
        return sb.toString();
	}

	public static void main(String[] args) {
		String s = "aaAbbb";
		System.out.println(frequencySort(s));
	}
	
}

