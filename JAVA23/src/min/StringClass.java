package min;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClass {
	public static void main(String[] args) throws ClassNotFoundException {
		//String
		Class strClass=Class.forName("java.lang.String");
		Constructor[] cons=strClass.getConstructors();
		for (Constructor i : cons) {
			System.out.println(i);}
			System.out.println();
		
		
		Method[] methods=strClass.getMethods();
		for (Method i : methods) {
			System.out.println(i);}
			System.out.println();
		 
		Field[] fields=strClass.getFields();
		for (Field i : fields) {
			System.out.println(i);}
			System.out.println();
		
			
		//person
		Class peClass=Class.forName("min.Person");
	
		Method[] methods1=peClass.getMethods();
		for (Method i : methods1) {
			System.out.println(i);}
		System.out.println();
		
	}
}
