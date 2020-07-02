package min;

public class StBufferTest {
	public static void main(String[] args) {
		//String ->����
		//StringBuffer ->����ȭ
		//StringBuilder ->����ȭ�� �������� �ʴ´�
		
		//����ȭ : ����(��Ƽ������)  / ����:�Ӱ豸��
		String str="";
		
		//StringBuffer ���� �߰����� ���� >> ��, ���Ͽ����� �����������,, ��Ƽ������ �ƴϸ� �� �����Ѵ�.
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
		//immutable String�� ���� �Һ�
		String javastr1= new String("java");
		//ó�� ��ü �ν��Ͻ�ȭ�� �޸� ��
		System.out.println("javastr�� ���ڿ� �ּ� : " + System.identityHashCode(javastr1));
		//String���κ��� StringBuilder�� ��ü�� ����
		
		StringBuilder buffer=new StringBuilder(javastr1);
		//������ �̷������ �� ���� hash��
		System.out.println("���� �� buffer�� �޸� �ּ� : " + System.identityHashCode(buffer));
		buffer.append(" and ");
		buffer.append("android");
		buffer.append(" programming is fun!");
		System.out.println(buffer);
		System.out.println("���� �� buffer�� �޸� �ּ� : " + System.identityHashCode(buffer));
		//���ۿ����� �������� �ּҰ� ���� �ֳ��ϸ�,, 
		
		javastr1=buffer.toString();  //�̰� �Ⱦ��� javastr1�� ���ڿ��� ���θ������ ���ڿ� �ּҰ� ���Ҵµ�
									//toString�̿��� ���ڵ� ���� �����ϱ� ���ڿ� �ּҰ� ����Ǿ���..
									//��? String�� �Һ��ε� ������ �ٲ����,, �׷��� �ּҵ� ����
		System.out.println("���θ������ javastr�� ���ڿ� �ּ� : " + System.identityHashCode(javastr1));
	
	}
}
