package min;

public class Classclass {
	public static void main(String[] args) throws ClassNotFoundException {
		
		Person p=new Person();//object의 getclass메소드를 사용
		//객체생성해서 객체를 통해 받는 방법
		Class pClass1=p.getClass();
		System.out.println(pClass1.getName());
		//객체생성하지 않고 클래스 이름을 획득
		Class pClass2=Person.class;
		System.out.println(pClass2.getName());
		//클래스 이름으로 가져오기
		Class pClass3=Class.forName("min.Person");
		System.out.println(pClass3.getName());

	}
}
