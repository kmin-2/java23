package min;
/*
class Test{
	private int code;  //private�� ���� Ŭ���� �������� ��밡��
	
	public setter(int code) {
		this.code=code;}
	public getter(){  //�̹� ���õǾ��ִ°� �������⸸ �ϸ� �Ǵ°�
		return code;}}

class Sample{
	Test test=new Test();
	test.setter(100);
	test.getter();}
*/


public class Person {
	private String name;
	private int age;
	//�����ڸ� ������� �ʰ� private�� ����Ҽ� ������?  >>get,setter
	Person(String name){
		this.name=name;
	}
	Person(int age){
		this.age=age;
	}
	Person(){};
	public void setName(String name) {
		this.name = name;}
	public void setAge(int age) {
		this.age = age;}
	
	public String getName() {
		return name;}
	public int getAge() {
		return age;}

	
	
	
	//public setter(){}
	//public getter(){}
	
}
