import java.util.Scanner;
import java.util.Random;

public class generateRandom{

	public static void main(String args[])
	{
		
		Scanner ref = new Scanner(System.in);
		System.out.println("Find Love % Between");
		
		
		System.out.println("Your Name: ");
		String name1=ref.nextLine();
		
		System.out.println("Partners Name: ");
		String name2=ref.nextLine();
		
		System.out.println("________________________");
		System.out.println("Percentage of love between\r"+name1+" & "+name2);
		Random rand = new Random();
		
		int rand_int1 = rand.nextInt(95,100);
		System.out.println("- "+rand_int1+"%");

	}
}
