/**  
* @Title: Solution_EasyArray.java——
* @Package EasyCode_01
* @Description: TODO
* @author msdumin@gmail.com  
* @date 2019年3月27日 下午5:14:36
* @version V1.0  
*/
package EasyCode_01;

import java.util.Arrays;

/**
* @ClassName: Solution_EasyArray——
* @Description: TODO
* @author msdumin@gmail.com
* @date 2019年3月27日 下午5:14:36
*/
public class Solution_EasyArray {
	//977
    public int[] sortedSquares(int[] A) {
    	int twice ;
    	for (int i = 0; i < A.length; i++) {
			twice = A[i] * A[i];
			A[i] = twice;
		}	
    	Arrays.sort(A);
    	return A;
    }
    //832
    public static int[][] flipAndInvertImage(int[][] A) {
    	//暴力循环
//        int res[][] = new int[A.length][];
        for (int i = 0; i < A.length; i++) {
        	int len = A[i].length;
			for(int j = 0 ; j < len / 2 ; j ++){
				int tmp = A[i][j];
				A[i][j] = A[i][len - 1 - j];
				A[i][len - 1 - j] = tmp;
			}
			for(int j = 0 ; j < len ; j++){
				if(A[i][j] == 0)
					A[i][j] = 1;
				else {
					A[i][j] = 0;
				}
			}
		}
        return A;
    }
 /*   //925  其实建表这个方法是行不通的....
    public boolean isLongPressedName(String name, String typed) {
        //建个表
    	int[] table_name = new int[26];
    	int[] table_typed = new int[26];
    	char[] arr1 = name.toCharArray();
    	char[] arr2 = typed.toCharArray();
    	for (int i = 0; i < arr1.length; i++) {
    		table_name[arr1[i] - 'a'] ++ ;
    	}
    	for (int i = 0; i < arr2.length; i++) {
    		table_typed[arr2[i] - 'a'] ++ ;
    	}
    	
    	for(int i = 0 ; i < table_name.length ; i ++){
    		if(table_name[i] != 0){
    			if(table_typed[i] < table_name[i])
    				return false;
    		}
    	}
    	return true;
    }*/
    //925
    public boolean isLongPressedName(String name, String typed){
            for(int i = 0, j=0; i < name.length(); ){
                if(j >= typed.length()){
                    return false;
                }
                if(name.charAt(i) == typed.charAt(j)){
                    i++;
                    j++;
                }else if(i >= 1 && name.charAt(i - 1) == typed.charAt(j)) {
                    j++;
                }else{
                    return false;
                }
            }
            return true;
    }
    
    public static void main(String[] args) {
		int[][] A = {{1,1,0},{1,0,1},{0,0,0}};
		A = flipAndInvertImage(A);
		System.out.println(" d ");
	}
}
