/**  
* @Title: Solution1002.java����
* @Package EasyCode_02
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��4��8�� ����8:49:58
* @version V1.0  
*/
package EasyCode_02;

import java.util.ArrayList;
import java.util.List;

/**
* @ClassName: Solution1002�������ҳ����ַ�
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��4��8�� ����8:49:58
*/
public class Solution1002 {
    public static List<String> commonChars(String[] A) {
        //�������¼ÿ��Сд��ĸ���ֵĴ���    ��Ŀ����ֻ����Сд��ĸ
    	int[] table = new int[26];
    	String first = A[0];
    	//���ַ��������е�ÿ���ַ�������ĸ���ִ���ͳ�ƽ�����
    	for (int i = 0; i < first.length(); i++) {
			table[first.charAt(i) - 'a'] ++ ;
		}
    	
    	List<String> res = new ArrayList<>();
    	
    	for(int i = 1 ; i < A.length ; i++){
    		int[] compare = new int[26];
    		for(int j = 0 ; j < A[i].length() ; j ++){
    			compare[A[i].charAt(j) - 'a']++;
    		}
    		for(int m = 0 ; m < 26 ; m ++){
    			table[m] = Math.min(table[m], compare[m]);
    		}
    	}
    	
    	for(int m = 0 ; m < 26 ; m ++){
    		if(table[m] > 0){
    			for(int n = 0 ; n < table[m] ; n ++){
    				res.add(String.valueOf((char) ('a' + m)));
    			}
    		}
    	}
    	return res;
    }
    public static void main(String[] args) {
		String[] A = {"cool","lock","cook"};
		List<String> res = new ArrayList<>();
		res = commonChars(A);
		System.out.println(res);
	}
}
