package min;

public class StringTest {
	public static void main(String[] args) {
		//��ü �ν�õ���� ������ heap �޸𸮿� �����
		String str1=new String("abc");  
		String str2=new String("abc");         
		
		System.out.println(str1==str2);  //false
		System.out.println(str1.equals(str2));  //true
		
		
		//���ڿ��� ��������� �����Ϳ����� ������ �ּҸ� ��� >>���Ǯ�� ����
		String str3="abc";
		String str4="abc";
		System.out.println(str3==str4);  //true
		System.out.println(str3.equals(str4));  //true
		
		
		String javastr=new String("JAVA");
		String androidstr=new String(" and android");

		//������ �ּ� System.identityHashCode()  , ���޸𸮴� >> hashcode�� ���°�
		System.out.println("ó�� ���ڿ� �ּ� �� : "+System.identityHashCode(javastr));
		
		javastr=javastr.concat(androidstr);
		System.out.println(javastr);
		
		
		System.out.println("����� ���ڿ� �ּ� �� : "+System.identityHashCode(javastr));
		
	
		
	}
}
