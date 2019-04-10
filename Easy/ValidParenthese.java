package EasyCode;

import java.util.Stack;

public class ValidParenthese {
	public static void main(String[] args) {
		Stack<Character> stack = new Stack<>();
		String s = "(([]{}))";
		for(int i = 0 ; i < s.length() ; i++){
			char ch = s.charAt(i);
			if(ch == '(' || ch == '[' || ch =='{')
				stack.push(ch);
			else{
				if(stack.isEmpty())
					System.out.println("false");
			
			char topstack = stack.pop();
			if(ch == ')' && topstack != '(')	System.out.println("false");
			else if(ch == ']' && topstack != '[')	System.out.println("false");
			else if(ch == '}' && topstack != '{')	System.out.println("false");
			}
		}
		System.out.println(stack.isEmpty());
	}
//		if(s.isEmpty() || s.length() == 0)	System.out.println("True");
//		ArrayStack stack = new ArrayStack(20);
//		stack.push(s.charAt(0));
//		System.out.println(isValid(s));
//	}
//	public static boolean isValid(String s) {
//        if(s == "" || s.length() == 0)
//            return true;
// 
//        Stack<Character> stack = new Stack<Character>();
//        stack.push(s.charAt(0));
// 
//        for(int i=1; i<s.length(); i++){
//            if(!stack.isEmpty()){
//                if(stack.peek().equals((char)(s.charAt(i)-1)) || stack.peek().equals((char)(s.charAt(i)-2))){
//                    stack.pop();
//                }else {
//                    stack.push(s.charAt(i));
//                }
//            }else {
//                stack.push(s.charAt(i));
//            }
//        }
//        if(stack.isEmpty())
//            return true;
//        return false;

}
//写一个基于zifu的顺序栈
class ArrayStack{
	private char [] tmps;
	private int count;
	private int n;
	//构造函数
	public ArrayStack(int n){
		this.tmps = new char [n];
		this.n = n;
		this.count = 0;
	}
	//入栈操作
	public boolean push(char c){
		if(count == n)	return false;
		tmps[count] = c;
		++count;
		return true;
	}
	//出栈操作
	public char pop(){
		if(count == 0)	return ' ';
		char c = tmps[count - 1];
		--count;
		return c;
	}
}
