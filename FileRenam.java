import java.io.*;
public class FileRenam {
	public static void main(String[] args) {
		File f = new File("D:\\File.txt");
		File r = new File("D:\\FileFile.txt");
		
		f.renameTo(r);
		System.out.println("Rename Successfully.");
	}

}
