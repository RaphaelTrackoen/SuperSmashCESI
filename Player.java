import java.util.Scanner;

public class Player {
	
	static int characterchoice = 0;
	
	static int playerHP;
	static int playerAP;
	
	Scanner lvlchoice = new Scanner(System.in);
	public Player()	{
		System.out.println("Please choose a character\n1. Heal\n2. DPS\n3. Tank");
		while (characterchoice != 1 && characterchoice != 2 && characterchoice != 3){
			characterchoice = lvlchoice.nextInt();
			if (characterchoice == 1){
				System.out.println("You chose Healer'");
				playerHP = Healer.getHealthPoint();
				playerAP = Healer.getAttackPoint();
			}
			if (characterchoice == 2){
				System.out.println("You chose 'DPS'");
				playerHP = Damager.getHealthPoint();
				playerAP = Damager.getAttackPoint();
			}
			if(characterchoice == 3) {
				System.out.println("You chose 'Tank'");
				playerHP = Tank.getHealthPoint();
				playerAP = Tank.getAttackPoint();
			}
			if (characterchoice != 1 && characterchoice != 2 && characterchoice != 3){
				System.out.println("Select your character :\n1. Healer\n2. DPS\n3. Tank");
			}
		}
		System.out.println("You have "+playerHP+" HP and "+playerAP+" AP");
	}
	public static int getPlayerHP() {
		return playerHP;
	}
	public static int getPlayerAP() {
		return playerAP;
	}
	public static int getPlayerClass() {
		return characterchoice;
	}
}
