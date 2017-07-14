
public class Damager extends Character {
	
	static int healthpoint = 3;
	static int attackpoint = 2;
	
	public static int getHealthPoint() {
		return healthpoint;
	}
	public static int getAttackPoint() {
		return attackpoint;
	}
    public static void setHealthPoint(int healthpoint)
    {
    	Damager.healthpoint = healthpoint;
    }
    public void setAttackPoint(int attackpoint)
    {
    	Damager.attackpoint = attackpoint;
    }
    static int[] specialattack(int HPleftself, int HPleftfow){
		
		int[] HP = new int [2];
		
		System.out.println("In HP[0]: "+HP[0]+" and in HP[1]: "+HP[1]);
		
		double A = Math.random();
		int HPheal = (int) Math.round(A);
		
		HPleftself = HPleftself + HPheal;
		HPleftfow = HPleftfow - 1;
		
		HP[0] = HPleftself;
		HP[1] = HPleftfow;
		
		return HP;
    }
}
