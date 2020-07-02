package min;

public class StBufferTest {
	public static void main(String[] args) {
		//String ->고정
		//StringBuffer ->동기화
		//StringBuilder ->동기화를 제공하지 않는다
		
		//동기화 : 순서(멀티스레드)  / 단점:임계구역
		String str="";
		
		//StringBuffer 변경 추가삭제 가능 >> 단, 단일에서듣 오버헤드유발,, 멀티스레드 아니면 잘 사용안한다.
		StringBuffer buf= new StringBuffer("Nice Day!");
		System.out.println(buf.toString());
		System.out.println(buf.length());
		System.out.println(buf.capacity());
		buf.ensureCapacity(100);
		System.out.println(buf.capacity());
		buf.insert(0, "Hi! ");
		System.out.println(buf);
		buf.insert(13, " Everybody^^");
		System.out.println(buf);
		buf.delete(0,4);
		System.out.println(buf);
		
		System.out.println("=====================================");
		
		//StringBuilder 
		//immutable String은 원래 불변
		String javastr1= new String("java");
		//처음 객체 인스턴스화시 메모리 값
		System.out.println("javastr의 문자열 주소 : " + System.identityHashCode(javastr1));
		//String으로부터 StringBuilder의 객체를 생성
		
		StringBuilder buffer=new StringBuilder(javastr1);
		//연산이 이루어지기 전 원본 hash값
		System.out.println("연산 전 buffer의 메모리 주소 : " + System.identityHashCode(buffer));
		buffer.append(" and ");
		buffer.append("android");
		buffer.append(" programming is fun!");
		System.out.println(buffer);
		System.out.println("연산 후 buffer의 메모리 주소 : " + System.identityHashCode(buffer));
		//버퍼에서는 연산전후 주소가 같다 왜냐하면,, 
		
		javastr1=buffer.toString();  //이걸 안쓰면 javastr1의 문자열과 새로만들어진 문자열 주소가 같았는데
									//toString이용한 이코드 한줄 넣으니깐 문자열 주소가 변경되었다..
									//왜? String은 불변인데 내용이 바뀌었음,, 그래서 주소도 변경
		System.out.println("새로만들어진 javastr의 문자열 주소 : " + System.identityHashCode(javastr1));
	
	}
}
