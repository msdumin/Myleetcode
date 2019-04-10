package EasyCode;

public class SerchForLocat {
	public static void main(String[] args) {
		int [] nums = {1,3,5,7,9};
		int target = 5;
	     for(int i = 0 ; i < nums.length ; i++){
	    	 if(target == nums[i])
	            	System.out.println(i);
	         else{
	        	 if(i+1 < nums.length && target > nums[i] && target <= nums[i+1]){
	                    System.out.println(i+1);
	                }
	            }
	        }
	}
}
