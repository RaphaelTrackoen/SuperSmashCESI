
public class Healer extends Character{
	
	static int healthpoint = 4;
	static int attackpoint = 1;
	
	public static int getHealthPoint() {
		return healthpoint;
	}
	public static int getAttackPoint() {
		return attackpoint;
	}
    public static void setHealthPoint(int healthpoint)
    {
    	Healer.healthpoint = healthpoint;
    }
    public void setAttackPoint(int attackpoint)
    {
    	Healer.attackpoint = attackpoint;
    }
	
    static int specialattack(int HPleft){
    	
    	int HPleftfinal = HPleft + 2;
    	
    	if(HPleftfinal > 4){
    		HPleftfinal = 4;
    	}
    	
		return HPleftfinal;
	}


}
