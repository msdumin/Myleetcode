/**  
* @Title: Solution202.java����
* @Package EasyCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��3��25�� ����8:36:47
* @version V1.0  
*/
package EasyCode;

/**
* @ClassName: Solution202������дһ���㷨���ж�һ�����ǲ��ǡ�����������

һ����������������Ϊ������һ����������ÿһ�ν������滻Ϊ��ÿ��λ���ϵ����ֵ�ƽ���ͣ�Ȼ���ظ��������ֱ���������Ϊ 1��
Ҳ����������ѭ����ʼ�ձ䲻�� 1��������Ա�Ϊ 1����ô��������ǿ�������
С֪ʶ����������ʼ�ձ䲻��1ʱ����������ѭ��ʱ�õ������ս������4
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��3��25�� ����8:36:47
*/
public class Solution202 {
	//��������ʼ�ձ䲻��1ʱ����������ѭ��ʱ�õ������ս������4
	  public boolean isHappy(int n) {
		  if(n < 0)
			  return false;
		  while(n != 1){
			  n = num(n);
			  if(n == 4)
				  return false;
		  }
		  return true;
	  }
	  
	  //��һ������ÿһλ�ϵ����ֵ�ƽ���ĺ�
	  public static int num(int x){
		  int ret = 0;
		  while(x!=0){
			  ret += (x%10)*(x%10);
			  x/=10;
		  }
		  return ret;
	  }
}
