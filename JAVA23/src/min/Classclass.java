package min;

public class Classclass {
	public static void main(String[] args) throws ClassNotFoundException {
		
		Person p=new Person();//object�� getclass�޼ҵ带 ���
		//��ü�����ؼ� ��ü�� ���� �޴� ���
		Class pClass1=p.getClass();
		System.out.println(pClass1.getName());
		//��ü�������� �ʰ� Ŭ���� �̸��� ȹ��
		Class pClass2=Person.class;
		System.out.println(pClass2.getName());
		//Ŭ���� �̸����� ��������
		Class pClass3=Class.forName("min.Person");
		System.out.println(pClass3.getName());

	}
}
