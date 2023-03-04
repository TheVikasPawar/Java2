public class Exception3 {
	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		}
		catch(AbstractMethodError e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Catch 3");
		}
	}
}