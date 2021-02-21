import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FastTyping {
	public static String[] Snacks = {"IceCream", "popCorn", 
									"RiceCake", "popTart", "Doritos", "Ramen", "cookies",
									"Sourpatch", "Orio"};
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("CountDown begins: ");
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("3");
		TimeUnit.SECONDS.sleep(1);
		
		System.out.println("2");
		TimeUnit.SECONDS.sleep(1);

		System.out.println("1");
		TimeUnit.SECONDS.sleep(1);
		
		Random rand = new Random();
		for (int i = 0; i < Snacks.length; i++) {
			System.out.print(Snacks[rand.nextInt(9)] +" ");
		}
		
		System.out.println();
		double start = LocalTime.now().toNanoOfDay();
		
		Scanner scan = new Scanner(System.in);
		String typedWords = scan.nextLine();
		
		double end = LocalTime.now().toNanoOfDay();
		double ElapsedTime = end - start;
		double seconds =  ElapsedTime /1000000000.0;
		
		int numChars = typedWords.length();
		int wpm = (int) ((((double) numChars /5) /seconds)* 60);
		
		System.out.println("Your words per minute " + wpm);
		
		scan.close();
		
		
	}

}
