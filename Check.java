
interface client{
	void webdesign();
	void webdevelop();
}

abstract class RajTech implements client{
	@Override
	public void webdesign() {
		
	}
}
class RahulTech extends RajTech{
	@Override
	public void webdevelop() {
		
	}
}

public class Check {
	public static void main(String[] args) {
		
	RahulTech ref = new RahulTech();
	ref.webdesign();
	ref.webdevelop();
	}

}
