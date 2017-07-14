
public abstract class Character {
	
	public static int attack(int attackpoint, int hprestant, boolean block){
		
		if(block == true){
			hprestant = hprestant - 1;
		}
		if(block == false){
			hprestant = hprestant - attackpoint;
		}
		return hprestant;
	}
	static boolean block(){
		return true;
	}
}
