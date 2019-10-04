package september08;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Execution {

	public static void main(String[] args) throws Exception, SecurityException {
		// TODO Auto-generated method stub
		
		TestReflection tr = new TestReflection();// class ka obj banaya tha
		
		Class cls = tr.getClass();
		Method[] methods = cls.getDeclaredMethods();
		
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		
		Field[] fields = cls.getDeclaredFields();
		
		for ( Field field : fields) {
			System.out.println(field.getName());
			
		}
		Method method = cls.getDeclaredMethod("method1",String.class);
		method.setAccessible(true);
		method.invoke(tr,"Pune");
		
		// class name.class karenge obj nai banaenge class ka 
		Method met=TestReflection.class.getDeclaredMethod("method3", String.class);
		met.setAccessible(true);
		met.invoke(TestReflection.class,"Mumbai");
		
	}

}
