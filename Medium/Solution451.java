/**  
* @Title: Solution451.java����
* @Package MiddleCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��3��25�� ����8:42:40
* @version V1.0  
*/
package MiddleCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @ClassName: Solution451���������ַ�����Ƶ������  ����һ���ַ������뽫�ַ�������ַ����ճ��ֵ�Ƶ�ʽ������С�
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��3��25�� ����8:42:40
*/
public class Solution451 {
	public static String frequencySort(String s) {
		
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
       
        for(char c : s.toCharArray()){
        	list.add(c);
        	map.put(c, map.getOrDefault(c, 0) + 1);
        }
        //����comparator��list�е��ַ�����
        //Comparable�������ֵ>,�򽻻����ݣ�<0����=0�����ֲ��䡣�������lambda���ʽ�Ľ��;��ǣ����a��Ƶ��==b��Ƶ�Σ��򷵻�a-b=0.����˳�򲻱䡣
        //������ȣ��򷵻�b��Ƶ��-a��Ƶ�Σ������>0�ģ�˵��b��Ƶ�αȽϸߣ�����н�����
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

