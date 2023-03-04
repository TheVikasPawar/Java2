
public class StringMethods {
	public static void main(String[] args) {
	String a = "LEARN";
	String b = "java";
	String c = "	Eclipse		";
	String d = "";
	
	System.out.println(b.toUpperCase());
	System.out.println(a.toLowerCase());
	
	System.out.println(a.concat(" "+b));
	System.out.println(b.length());
	
	System.out.println(c.trim());
	System.out.println(d.isEmpty());
	
	System.out.println(a.charAt(3));
	System.out.println(a.indexOf('N'));
	
	System.out.println(a.equals(b));
	System.out.println(b.replace('j', 'v'));
	
	}
}
