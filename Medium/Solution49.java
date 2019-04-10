/**  
* @Title: Solution49.java����
* @Package MiddleCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��3��26�� ����4:54:02
* @version V1.0  
*/
package MiddleCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/**
* @ClassName: Solution49������ĸ��λ�ʷ���
* @Description: TODO
* ����: ["eat", "tea", "tan", "ate", "nat", "bat"],
	���:
	[
  		["ate","eat","tea"],
  		["nat","tan"],
  		["bat"]	
	]
* @author msdumin@gmail.com
* @date 2019��3��26�� ����4:54:02
*/
public class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
    	
        List<List<String>> res = new LinkedList<>();
        
        Map<String, List<String>> map = new HashMap<>();
        for(String string : strs){
        	String encode = enCode(string);
        	if(map.containsKey(encode)){
        		map.get(encode).add(string);
        	}else{
        		List<String> list = new LinkedList<>();
        		list.add(string);
        		map.put(encode, list);
        	}
        }
        for(Map.Entry<String, List<String>> entry : map.entrySet())
        	res.add(entry.getValue());
        
        return res;
    }
    //��ÿ���ַ���������
    public static String enCode(String string){
    	int[] freq = new int[26];
    	for (int i = 0; i < string.length(); i++) {
			freq[string.charAt(i) - 'a'] ++ ;
		}
    	StringBuilder sb = new StringBuilder();
    	for(int i = 0 ; i < freq.length ; i ++){
    		sb.append(freq[i]);
    	}
    	return sb.toString();
    }
    
/*    //�ж������ַ����Ƿ�����Ч��λ��
    public static boolean isAnagram(String s , String t){
    	//�����ұ�
    	int[] stable = new int[26];
    	int[] ttable = new int[26];
    	for (int i = 0; i < s.length(); i++) {
    		stable[s.charAt(i) - 'a'] ++;
		}
    	for(int i = 0 ; i < t.length() ; i ++){
    		ttable[t.charAt(i) - 'a'] ++ ;
    	}
    	int p = 0;
    	while(p < s.length()){
    		if(stable[p] != ttable[p])	break;
    		else
    			p++;
    	}
    	if(p == s.length())
    		return true;
    	return false;
    }*/
    
    public static void main(String[] args) {
		
    	
    	String s = "aeccdegfgrer";
    	String encode = enCode(s);
    	System.out.println(encode);
    	
    	
//    	StringBuilder sb = new StringBuilder();
//    	System.out.println(sb.append(arr).toString());
    	
	}
}
