interface C{
	 void show();
}
interface D{
	void Print();

}

class Inheritance_Interface implements C,D{

	@Override
	public void Print() {
		// TODO Auto-generated method stub
		System.out.println("Print Method()");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show Method()");
	}
	
}
public class MultipleInheritance_Interface{
	public static void main(String[] args) {
		Inheritance_Interface ref = new Inheritance_Interface();
		ref.Print();
		ref.show();
	}
}
