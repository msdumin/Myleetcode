/**  
* @Title: Solution122.java����
* @Package EasyCode_02
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019��4��13�� ����4:11:19
* @version V1.0  
*/
package EasyCode_02;


/**
* @ClassName: Solution122����������Ʊ�����ʱ��
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019��4��13�� ����4:11:19
*/
public class Solution122 {
/*	//�Լ�д�������ⷨ����������
    public static int maxProfit(int[] prices) {
    	
    	int res = 0;
        if(prices.length == 0 || prices.length == 1)
        	return 0;
        int price_pre = prices[0];//ǰһ��ļ۸�
        int cur_price = prices[1];//��ǰ��ļ۸�
        
        if(prices.length == 2)
        	return cur_price - price_pre > 0 ? cur_price - price_pre : 0;
        
        int sub = 0;
        for (int i = 2; i < prices.length; i++) {
			if(price_pre >= cur_price){
				price_pre = cur_price;
				cur_price = prices[i];
			}
			else{
				
				if(prices[i] <= cur_price){
					sub = cur_price - price_pre;
					res += sub;
					price_pre = cur_price;
					cur_price = prices[i];
				}else{
					if(i == prices.length - 1){
						sub = prices[i] - price_pre;
						res += sub;
					}else{
						sub = cur_price - price_pre;
						res += sub;
						price_pre = cur_price;
						cur_price = prices[i];
					}
				}
			}
		}
        return res;
    }*/
	
    public static void main(String[] args) {
		int[] prices = {2,1,4};
		System.out.println(maxProfit(prices));
	}
}