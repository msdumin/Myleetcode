/**  
* @Title: T711.java——
* @Package EasyCode
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月13日 上午10:27:04
* @version V1.0  
*/
package EasyCode;

/**
* @ClassName: T711——
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年3月13日 上午10:27:04
*/
public class T711 {
	
	public static void main(String[] args) {
		int[] bits = {0,0};
		System.out.println(isOneBitCharacter(bits));
	}
    public static boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while(i < bits.length - 1) {
            if(bits[i] == 1) i += 2;
            else i++;
        }
        return (i == bits.length - 1);
    }
}
