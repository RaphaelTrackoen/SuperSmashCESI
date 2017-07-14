
public class IAcharacter {
	
	static int IAHP;//bot's HP
	static int IAAP;//bot's AP
	static int IAclass;//Bot's class
	
	public IAcharacter()	{
			if (IA.IAlvl == 1){
				if (Player.characterchoice == 1) { //Easy mode = same class as you
					System.out.println("The bot chose 'the Healer'");
					IAHP = Healer.getHealthPoint();
					IAAP = Healer.getAttackPoint();
					IAclass = 1;
					}
				if (Player.characterchoice == 2) {
					System.out.println("The bot chose 'the Damager'");
					IAHP = Damager.getHealthPoint();
					IAAP = Damager.getAttackPoint();
					IAclass = 2;
					}
				if(Player.characterchoice == 3) {
					System.out.println("The bot chose 'the Tank'");
					IAHP = Tank.getHealthPoint();
					IAAP = Tank.getAttackPoint();
					IAclass = 3;
				}
			}
			if (IA.IAlvl == 2){
				if (Player.characterchoice == 1) { //Hard mode = bot chooses your counter
					System.out.println("The bot chose 'the Damager'");
					IAHP = Damager.getHealthPoint();
					IAAP = Damager.getAttackPoint();
					IAclass = 2;
					}
				if (Player.characterchoice == 2) {
					System.out.println("The bot chose 'the Tank'");
					IAHP = Tank.getHealthPoint();
					IAAP = Tank.getAttackPoint();
					IAclass = 3;
					}
				if(Player.characterchoice == 3) {
					System.out.println("The bot chose 'the Healer'");
					IAHP = Healer.getHealthPoint();
					IAAP = Healer.getAttackPoint();
					IAclass = 1;
				}	
			}
		System.out.println("The bot now have "+IAHP+" HealthPoint or 'HP' and "+IAAP+" AttackPoint or 'AP'");
	}
	static int IAprocessing(int playeridentity, int HPplayer, int HPbot){
		int decision = 0;
		if(IA.IAlvl == 1){
			double A = Math.random()+1;
			decision = (int) Math.round(A);
		}
		if(IA.IAlvl == 2){
			if(playeridentity == 1){
				decision = 1;
			}
			if(playeridentity == 2){
				if(HPplayer == 3){
					decision = 2;
				}
				if(HPplayer == 2){
					decision = 2;
				}
				if(HPplayer == 1){
					decision = 1;
				}
			}
			if(playeridentity == 3){
				if(HPbot >= 3){
					decision = 1;
				}
				if(HPbot < 3){
					decision = 2;
				}
			}
		}
		return decision;

	}

}
