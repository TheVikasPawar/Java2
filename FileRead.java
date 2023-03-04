import java.io.*;
public class FileRead {
	public static void main(String[] args) {
		
		//FileReader f = new FileReader("D:\\File.txt");
		try {
			FileReader f = new FileReader("D:\\File.txt");
			try {
				int i;
				while((i=f.read())!=-1)    
			          System.out.print((char)i);    
			             
			}finally {
				f.close();
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
