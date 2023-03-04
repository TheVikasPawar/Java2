import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;

public class CopyFile {
	public static void main(String[] args) throws IOException {
		FileInputStream f = new FileInputStream("D:\\File.txt");
		FileOutputStream w = new FileOutputStream("D:\\FileFile.txt");
		
		int i;
		while((i=f.read())!=-1) {
			w.write((char)i);
		}
		System.out.println("Copied Successfully.");
		
	}

}
