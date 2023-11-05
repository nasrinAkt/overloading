package over;

public class overloading1 {

	public static void main(String[] args) {
		overloading1 obj = new overloading1();
		obj.pig(1000);
		
		obj.pig(100.50);
		obj.pig(400, 500.50);
		obj.pig(50, 50.50, " This is my rent for house.", 'm');
	}
public void pig(int a) {

System.out.println(a);	
	
}
	
public void pig(double b) {
	
	System.out.println(b);
	
	
}
public void pig(int a, double b) {
System.out.println(a+b);
	
}	
public void pig(int a, double b, String c, char d) {
System.out.println(a*b+c+d);
	
	
	
}
	
	
	
	
	
	
	
}
