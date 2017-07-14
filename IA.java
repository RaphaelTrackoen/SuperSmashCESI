import java.util.Scanner; 



public class IA {
	static int IAlvl = 0;
	Scanner lvlchoice = new Scanner(System.in);
	public IA()	{
		System.out.println("Choose a difficulty :\n1. Easy\n2. Hard");
		while (IAlvl != 1 && IAlvl != 2){
			IAlvl = lvlchoice.nextInt();
			if (IAlvl == 1){
				System.out.println("You chose easy mode");
			}
			if (IAlvl == 2){
				System.out.println("You chose hard mode");
			}
			if (IAlvl != 1 && IAlvl != 2){
				System.out.println("Please type 1 or 2");
			}
		}
	}
}
