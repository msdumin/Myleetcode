/**  
* @Title: Solution438.java����
* @Package EasyCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��3��25�� ����10:48:23
* @version V1.0  
*/
package EasyCode;

import java.util.ArrayList;
import java.util.List;

/**
* @ClassName: Solution438�����ҵ��ַ�����������ĸ��λ��  ���������ڣ�
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��3��25�� ����10:48:23
*/
public class Solution438 {
	public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ls = new ArrayList<>();
      
        if(s.length() < p.length() || s == null || p == null)
        	return ls;
        //������p�ǿգ�ֻ����Сд��ĸ
        //�����ұ�   
        int[] freq = new int[26];
        for(int i = 0 ; i < p.length() ; i ++){
        	freq[p.charAt(i) - 'a'] ++;
        }
        
        int[] sfreq = new int[26];
        int l = 0 , r = -1;
        //���ڵ���߽���໬����(s.length() - p.length()) + 1
        while(l <= s.length() - p.length()){
        	//����С��p.length()ʱ���󴰿�
        	if(r-l+1 < p.length() && r < s.length()){
        		++r;
        		sfreq[s.charAt(r) - 'a'] ++;
        	}//�ƶ�����
        	else{
        		int i = 0;
            	for( ; i < 26 ; i++){
            		if(freq[i] != sfreq[i])	break;
            	}
            	if(i == 26) ls.add(l);
            	//��һ������Խ���ж�
            	if(r + 1  == s.length())	break;
            	
            	sfreq[s.charAt(++r) - 'a'] ++;
            	sfreq[s.charAt(l++) - 'a'] --;
            	
        	}
        }
        return ls;
    }
	
	public static void main(String[] args) {
		String s = "abab";
		String p = "ab";
		List<Integer> list = new ArrayList<>();
		list = findAnagrams(s, p);
		for(int i : list)
			System.out.print(i + " ");
	}
}
