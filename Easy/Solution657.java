/**  
* @Title: Solution657.java——
* @Package EasyCode_02
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年4月3日 下午9:31:44
* @version V1.0  
*/
package EasyCode_02;

/**
* @ClassName: Solution657——机器人能否返回原点
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年4月3日 下午9:31:44
*/
public class Solution657 {
    public static boolean judgeCircle(String moves) {
        char[] arr = moves.toCharArray();
        int[] table = new int[4];
        for(int i = 0 ; i < arr.length ; i ++){
        	if(arr[i] == 'D')
        		table[arr[i] - 'D'] ++;
        	else if(arr[i] == 'U')
        		table[arr[i] - 'U' + 1] ++;
        	else if(arr[i] == 'R')
        		table[arr[i] - 'R' + 2] ++;
        	else
				table[arr[i] - 'L' + 3] ++;
        }
        if(table[0] == table[1] && table[2] == table[3])
        	return true;
        return false;
    }
    public static void main(String[] args) {
		String moves = "UD";
		System.out.println(judgeCircle(moves));
	}
}
