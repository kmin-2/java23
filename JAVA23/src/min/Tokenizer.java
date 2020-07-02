package min;

import java.util.StringTokenizer;

public class Tokenizer {
	public static void main(String[] args) {
		//문자열분해 tokenizer
		String str="오늘은 목요일 얼른 주말이 왔으면 좋겠다..";
		StringTokenizer tk=new StringTokenizer(str, " ",false);
							//자르고싶은 문자열, 자르는 기준문자의 집합, 자르는기준넣을지말지 
		
		int n=tk.countTokens();
		System.out.println(n);
		
		while (tk.hasMoreTokens()) {			
			String t=tk.nextToken();
			System.out.println(t);
		}
		
	}
}
