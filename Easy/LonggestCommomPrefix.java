package EasyCode;

public class LonggestCommomPrefix {
	public static void main(String[] args) {
		
		String [] strs = {"hello" , "heispig" , "hellyeah"};
		String tmp = strs[0];
		for(int i = 1 ; i < strs.length ; i++){
			while(strs[i].indexOf(tmp)!=0){
				tmp = tmp.substring(0, tmp.length() - 1);
				if(tmp.isEmpty())
					System.out.println("²»´æÔÚ");
			}
		}
		System.out.println(tmp.toUpperCase());
	}
}
