package EasyCode;

import java.util.Arrays;
import java.util.Random;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.E);
		float f = 2.34e-23f;    		 //编译器通常会将指数作为double类型处理，所以后面要加上f
		Random rand = new Random(47);
		
		int a[] = new int[10];
		for(int i = 0 ; i < 10 ; ++i){
			a[i] = rand.nextInt(100);  
		}
		for(int i : a)
		System.out.println(i);
		for(char c : "this is a foreach test!".toCharArray())
			System.out.print(c + " ");
		
		int b[] ;
		b = new int[rand.nextInt(20)];
		System.out.println("\n" + Arrays.toString(b));
		
	}
	
	public int[] twoSum(int[] nums , int target) {
		for(int i = 0; i < nums.length; ++i){
			for(int j = i + 1; j < nums.length; ++j){
				if(nums[j] == target - nums[i])
					return new int [] {i,j};
			}
		}
		throw new IllegalArgumentException("No Two sum solution");
	}
}
