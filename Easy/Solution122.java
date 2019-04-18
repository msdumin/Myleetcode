/**  
* @Title: Solution122.java——
* @Package EasyCode_02
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年4月13日 下午4:11:19
* @version V1.0  
*/
package EasyCode_02;

import java.security.Principal;

/**
* @ClassName: Solution122——买卖股票的最佳时间
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年4月13日 下午4:11:19
*/
public class Solution122 {
/*	//自己写的垃圾解法！！还不对
    public static int maxProfit(int[] prices) {
    	
    	int res = 0;
        if(prices.length == 0 || prices.length == 1)
        	return 0;
        int price_pre = prices[0];//前一天的价格
        int cur_price = prices[1];//当前天的价格
        
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
	
	public static int maxProfit(int[] prices){
		
		if(prices.length == 0 || prices.length == 1)
			return 0;
		
		int totalProfit = 0;
		int onceProfit = 0;
		int buyIn = prices[0];
		for(int i = 1 ; i < prices.length ; i ++ ){
			if(prices[i] > buyIn){
				onceProfit = prices[i] - buyIn;
				totalProfit += onceProfit;
				onceProfit = 0;
				buyIn = prices[i];
			}else{
				buyIn = prices[i];
			}	
		}
		return totalProfit;
	}
    public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}
}
