package september08;

public class TestReflection {
	
	String name;
	String color;
	int year;
	
	private void method1(String value) {
		System.out.println(" I am method 1, I have got value:"+value);
	}
	public void method2() {
		System.out.println(" I am method 2");
	}
	private static void method3(String value) {
		System.out.println(" I am method 3, I have value:" + value);
	}

}
