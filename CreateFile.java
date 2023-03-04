import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\File.txt");
		
		if(f.exists()) {
			System.out.println("File Name: "+f.getName());
			System.out.println("File Name: "+f.length());
			System.out.println("File Name: "+f.canWrite());
			System.out.println("File Name: "+f.canRead());
			System.out.println("File Name: "+f.getAbsolutePath());
			
		}else {
			System.out.println("File Dosen't Exits.");
		}
	}

}
