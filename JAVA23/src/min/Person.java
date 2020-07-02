package min;
/*
class Test{
	private int code;  //private는 같은 클래스 내에서만 사용가능
	
	public setter(int code) {
		this.code=code;}
	public getter(){  //이미 세팅되어있는걸 가져오기만 하면 되는거
		return code;}}

class Sample{
	Test test=new Test();
	test.setter(100);
	test.getter();}
*/


public class Person {
	private String name;
	private int age;
	//생성자를 사용하지 않고 private를 사용할수 없을까?  >>get,setter
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
