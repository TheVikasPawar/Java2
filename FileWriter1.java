import java.io.*;
public class FileWriter1 {
	public static void main(String[] args) {
		
		try {
			FileWriter f = new FileWriter("D:\\\\File.txt");
			try {
				f.write("A paragraph is a series of sentences \n "
						+ "that are organized and coherent, and \n "
						+ "are all related to a single topic. \n "
						+ "Almost every piece of writing you do\n "
						+ "that is longer than a few sentences \n "
						+ "should be organized into paragraphs.");
				System.out.println("Writing Successfully.");
			}
			finally {
				f.close();
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
