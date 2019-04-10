/**  
* @Title: Solution17.java����
* @Package MiddleCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��4��9�� ����9:28:38
* @version V1.0  
*/
package MiddleCode;

import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.StringHolder;

/**
* @ClassName: Solution17�����绰�������ĸ��ϣ����ݷ�����������
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��4��9�� ����9:28:38
*/
public class Solution17 {
	List<String> res ;
	
	public static String[] table = {
		"abc",	//2
		"def",	//3
		"ghi",	//4
		"jkl",
		"mno",
		"pqrs",
		"tuv",
		"wxyz"	//9
	};
	private void combination(String digits , int index , String s){
		//�ݹ��������
		if(index == digits.length()){
			//��һ���ٷ���
			res.add(s);
			return ;
		}
		
		char c = digits.charAt(index);
		String letters = table[(c - '2')];
		for(int i = 0 ; i < letters.length() ; i ++){
			combination(digits, index + 1, s + letters.charAt(i));
		}
		
		return ;
	}
	
    public List<String> letterCombinations(String digits) {
    	
    	res = new ArrayList<>();
    	
    	if(digits.equals(""))	//�ַ����п�
    		return res;
    	
        combination(digits, 0, "");
        return res;
    }
    public static void main(String[] args) {
//    	char c = '3';
//    	System.out.println(c - '0');
		String digits = "23";
		List<String> ans = new ArrayList<>();
		ans = new Solution17().letterCombinations(digits);
	}
}
