package EasyCode;

public class RemovRepeatInSrotedArray {
	public static void main(String[] args) {
		int nums[] = {1,1,1,3,3,3,3,4,4,5};
//        int len = nums.length;
//        if(len == 0)
//            System.out.println("0");
//        if(len == 1)
//            System.out.println("1");
//        int tmp = nums[0];
//        int i = 1;
//        int count = 0;
//        while(i < len){
//            if(tmp == nums[i])
//                count++;
//            else{
//                tmp = nums[i];
//                nums[i - count] = tmp;
//            }
//            i++;
//        }
//        System.out.println(len - count);
		//看到一个更好的算法
	int index = 0;
	for(int i = 0 ; i < nums.length ; i++){
		if(i != 0 && nums[i] == nums[i-1])	continue;
		nums[index++] = nums[i];
		}
	System.out.println(index);
	}
}
