
public class Bat extends Mammal {
	public Bat(int energyLevel) {
		super(energyLevel);
	}
    public int fly() {
        energyLevel -= 50;
        System.out.println("frash frash");
        return energyLevel;
    }

    public int eatHuman() {
        this.energyLevel +=25;
        System.out.println ("the bat is eating humans");
        return energyLevel;
    }
    public int attackTown() {
        energyLevel -=100;
        System.out.println ("Aaaaaah!!");
        return energyLevel;
    }
}
	
	

