package min;

import java.util.StringTokenizer;

public class Tokenizer {
	public static void main(String[] args) {
		//���ڿ����� tokenizer
		String str="������ ����� �� �ָ��� ������ ���ڴ�..";
		StringTokenizer tk=new StringTokenizer(str, " ",false);
							//�ڸ������ ���ڿ�, �ڸ��� ���ع����� ����, �ڸ��±��س��������� 
		
		int n=tk.countTokens();
		System.out.println(n);
		
		while (tk.hasMoreTokens()) {			
			String t=tk.nextToken();
			System.out.println(t);
		}
		
	}
}
