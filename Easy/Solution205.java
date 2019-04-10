/**  
* @Title: Solution205.java����
* @Package EasyCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��3��25�� ����8:40:01
* @version V1.0  
*/
package EasyCode;

import java.util.HashMap;
import java.util.HashSet;

/**
* @ClassName: Solution205����ͬ���ַ���
* ���������ַ��� s �� t���ж������Ƿ���ͬ���ġ�
��� s �е��ַ����Ա��滻�õ� t ����ô�������ַ�����ͬ���ġ�
���г��ֵ��ַ�����������һ���ַ��滻��ͬʱ�����ַ���˳��
�����ַ�����ӳ�䵽ͬһ���ַ��ϣ����ַ�����ӳ���Լ�����
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��3��25�� ����8:40:01
*/
public class Solution205 {
	public static boolean isIsomorphic(String s, String t) {
		
        if(s.length() != t.length())
        	return false;
        
        if(s == null && t == null)
        	return true;
        
        if(s == null && t != null)
        	return false;
        
        if(s != null && t == null)
        	return false;
        HashSet<Character> set = new HashSet<>(s.length());
        HashMap<Character, Character> map = new HashMap<>(s.length());
        
        for(int i = 0; i < s.length() ; i ++){
        	//�����ڼ�ֵ���ͽ���ӳ��
        	if(!map.containsKey(s.charAt(i))){
        		//���Ҫ����ļ������ڣ����Ƕ�Ӧ��ֵȴ�Ѿ������ˣ�ֱ�ӷ���false
        		if(set.contains(t.charAt(i)))	return false;
        		else{
        			map.put(s.charAt(i) , t.charAt(i));
        			set.add(t.charAt(i));
        		}
        	}
        	else{//���ڼ�ֵ�ˣ���t�ַ����е��ַ��Ƿ�ͼ��д洢��ֵ���
        		if(map.get(s.charAt(i)) != t.charAt(i))
        			return false;
        	}
        }
        return true;
    }
	
	public static void main(String[] args) {
		String s = "ab";
		String t = "aa";
		System.out.println(isIsomorphic(s, t));
	}
}
