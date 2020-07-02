package min;

public class StringTest {
	public static void main(String[] args) {
		//객체 인스천스는 각각의 heap 메모리에 저장됨
		String str1=new String("abc");  
		String str2=new String("abc");         
		
		System.out.println(str1==str2);  //false
		System.out.println(str1.equals(str2));  //true
		
		
		//문자열은 상수값으로 데이터영역에 고정된 주소를 사용 >>상수풀에 저장
		String str3="abc";
		String str4="abc";
		System.out.println(str3==str4);  //true
		System.out.println(str3.equals(str4));  //true
		
		
		String javastr=new String("JAVA");
		String androidstr=new String(" and android");

		//원래의 주소 System.identityHashCode()  , 힙메모리는 >> hashcode로 보는거
		System.out.println("처음 문자열 주소 값 : "+System.identityHashCode(javastr));
		
		javastr=javastr.concat(androidstr);
		System.out.println(javastr);
		
		
		System.out.println("연결된 문자열 주소 값 : "+System.identityHashCode(javastr));
		
	
		
	}
}
