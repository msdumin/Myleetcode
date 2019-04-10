package EasyCode;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class RomanToInteger {
	public static void main(String[] args) {
//		InputStream input = new InputStream() {
//			@Override
//			public int read() throws IOException {
//				return 0;
//			}
//		};
//		String s = null;
//		Scanner sc  = new Scanner(input);
//		while(sc.hasNext()){
//			s  = sc.nextLine();
//			System.out.println(s);
//		}
		
		String s = "MDLXX";
			
		char [] chars = s.toCharArray();
		
		for(char c : chars)
			System.out.print(c);
		
		int result = 0;
		for(int i  = 0 ; i < chars.length ; i++){
            switch (chars[i]){
                case 'M':
                    result+=1000;
                    break;
                case 'D':
                    result+=500;
                    break;
                case 'C':
                    if(chars[i+1] == 'D' && i+1 < chars.length){
                        result+=400;
                        i++;
                    }
                    else if(chars[i+1] == 'M' && i+1 < chars.length){
                        result+=900;
                        i++;
                    }
                    else 
                        result+=100;
                    break;
                case 'L':
                    result+=50;
                    break;
                case 'X':
                    if(chars[i+1] == 'L' && i+1 < chars.length){
                        result+=40;
                        i++;
                    }
                    else if(chars[i+1] == 'C' && i+1 < chars.length){
                        result+=90;
                        i++;
                    }
                    else 
                        result+=10;
                    break;
                case 'V':
                    result+=5;
                    break;
                case 'I':
                    if(i == chars.length - 1){
                        result+=1;
                        break;
                    }
                    if(chars[i+1] == 'V'){
                        result+=4;
                        i++;
                    }
                    else if(chars[i+1] == 'X'){
                        result+=9;
                        i++;
                    }
                    else
                        result+=1;
                    break;
                default:
                    break;
            }
        }
	}
}
