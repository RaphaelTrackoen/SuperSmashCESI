
public class Tank extends Character {
	
	static int healthpoint = 5;
	static int attackpoint = 1;
	
	public static int getHealthPoint() {
		return healthpoint;
	}
	public static int getAttackPoint() {
		return attackpoint;
	}
    public static void setHealthPoint(int healthpoint)
    {
      Tank.healthpoint = healthpoint;
    }
    public void setAttackPoint(int attackpoint)
    {
      Tank.attackpoint = attackpoint;
    }
    
	static int[] specialattack(int HPleftself, int HPleftfow){
		
		int[] HP = new int [2];
		
		HPleftself = HPleftself - 1;
		HPleftfow = HPleftfow - 2;
		
		HP[0] = HPleftself;
		HP[1] = HPleftfow;
		
		return HP;
	}

	

}
