package over;

public class overloading2 {

	public static void main(String[] args) {
		overloading2 tall = new overloading2();
		tall.tom(1000);
		
		tall.tom(200, 300);
		overloading2.tom("My name is Nasrin");
		overloading2.tom(100.50);
		overloading2.tom(500, 50.50, " Nasrin Akter ", 'n');
	}
public void tom(int a) {
	System.out.println(a);
	
	
}
public void tom(int a, int b) {
	int c = a+b;
System.out.println(c);	
		
}
public static void tom(String a) {
System.out.println(a);	
	
}	
	
public static void tom(double a) {
	
	System.out.println(a);
}		
	public static void tom(int a, double b, String c, char d) {
	System.out.println(a+b+c+d);	
		
		
	}
}
