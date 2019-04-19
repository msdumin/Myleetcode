/**  
* @Title: Solution455.java����
* @Package EasyCode_02
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��4��19�� ����10:27:59
* @version V1.0  
*/
package EasyCode_02;

import java.util.Arrays;
import java.util.Collections;

/**
* @ClassName: Solution455�����ַ����� (̰���㷨)
* @Description: TODO ��������һλ�ܰ��ļҳ�����Ҫ����ĺ�����һЩС���ɡ����ǣ�ÿ���������ֻ�ܸ�һ����ɡ���ÿ������ i ��
* ����һ��θ��ֵ gi ���������ú���������θ�ڵı��ɵ���С�ߴ磻����ÿ����� j ������һ���ߴ� sj ��
* ��� sj >= gi �����ǿ��Խ�������� j ��������� i ��������ӻ�õ����㡣
* ���Ŀ���Ǿ���������Խ�������ĺ��ӣ��������������ֵ��
* ע��(����Լ���θ��ֵΪ��,һ��С�������ֻ��ӵ��һ����ɡ�)
* @author msdumin@gmail.com
* @date 2019��4��19�� ����10:27:59
*/
public class Solution455 {
    public static int findContentChildren(int[] g, int[] s) {
    	//�ȶ������������������Ϊÿ����Ҫȡ���ֵ
    	//����ʱ�临�Ӷ�ΪO(nlogn)�����������㷨��ʱ�临�Ӷ�ΪO(nlogn)
    	Arrays.sort(g);
    	Arrays.sort(s);
    	
        int gi = g.length - 1;
        int si = s.length - 1;
        int res = 0;
        while(gi >= 0 && si >= 0){
        	if(g[gi] <= s[si]){
        		gi--;
        		si--;
        		res++;
        	}else{
        		gi--;
        	}
        }
        return res;
    }
    public static void main(String[] args) {
		int[] g = {1,2,3};
		int[] s = {1,1};
		System.out.println(findContentChildren(g, s));
	}
}
