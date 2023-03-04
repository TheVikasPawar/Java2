
public class Exception1 {
	
	
	public static void main(String[] args) {
		int a=10;
		int b=10;
		int c;
		
		try {
			c=a/b;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println(e.toString());
			System.out.println("Can't Divide by Zero");
		}
	}
}
