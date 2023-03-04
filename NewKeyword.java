
public class NewKeyword {
	int a =10;
	
	public NewKeyword() {
		System.out.println("Constructor");
	}
	
	public void Method() {
		System.out.println("Method");
	}
	
	public static void main(String[] args) {
		NewKeyword ref = new NewKeyword();
		System.out.println(ref.a);
		
		ref.Method();
		
	}

}
