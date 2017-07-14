import java.util.Scanner;

public class Battle {
	
	public Battle(){
		
		boolean block = false;
		
		int HPplayer = Player.playerHP;
		int APplayer = Player.playerAP;
		
		int playeridentity = Player.characterchoice;
		
		int HPbot = IAcharacter.IAHP;
		int APbot = IAcharacter.IAAP;
		Scanner nextchoice = new Scanner(System.in);
		
		int nextmove = 0;
		
		while(HPplayer > 0 && HPbot > 0 ){  //Check if someone is dead
			System.out.println("What is your next move ? :\n1-->Attack\n2-->Block\n3-->Special Attack");
			int botdecision = IAcharacter.IAprocessing(playeridentity, HPplayer, HPbot); //Bot's decision making
			System.out.println(botdecision);
			while (nextmove != 1 && nextmove != 2 && nextmove != 3){
				nextmove = nextchoice.nextInt(); //Player's decision making
				if (nextmove == 1){
					HPbot = Character.attack(APplayer, HPbot, false);
					System.out.println("You dealt "+APplayer+"dmgs");
				}
				if (nextmove == 2){
					block = Character.block(); 
				}
				if(nextmove == 3){
					if(playeridentity == 1){
						HPplayer = Healer.specialattack(HPbot);
					}
					if(playeridentity == 2){
						int[] HP = Damager.specialattack(HPplayer, HPbot);
						HPplayer = HP[0];
						HPbot = HP[1];
						System.out.println("Special attack Damager player: "+HPplayer+"HP bot: "+HPbot);
					}
					if(playeridentity == 3){
						int[] HP = Tank.specialattack(HPplayer, HPbot);
						HPplayer = HP[0];
						HPbot = HP[1];
					}
				}
				if (nextmove != 1 && nextmove != 2 && nextmove != 3){ 
					System.out.println("Please type 1, 2 or 3 to select your next move");
				}
			}
			if (botdecision == 1){
				HPplayer = Character.attack(APbot, HPplayer, block);
			}
			if (botdecision == 2){
				if(IAcharacter.IAclass == 1){
					HPbot = Healer.specialattack(HPbot);
				}
				if(IAcharacter.IAclass == 2){
					int[] HP = Damager.specialattack(HPbot, HPplayer);
					HPbot = HP[0];
					HPplayer = HP[1];
				}
				if(IAcharacter.IAclass == 3){
					int[] HP = Tank.specialattack(HPbot, HPplayer);
					HPbot = HP[0];
					HPplayer = HP[1];
				}
			}
			nextmove = 0;
			block = false;
			System.out.println("You still have : "+HPplayer+"HP left\nYour opponent still has : "+HPbot+"HP");
		}
		if(HPplayer>=0 || HPbot<0){
			System.out.println("You Win !");
		}
		if(HPplayer<0 || HPbot>=0){
			System.out.println("You Loose...");
		}
		if(HPplayer<0 || HPbot<0){
			System.out.println("Equality ..!");
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.exit(0);
	}

}
