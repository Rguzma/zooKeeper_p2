
public class Mammal {
    public int energyLevel = 300;
    public int displayEnergy() {
        System.out.println (energyLevel);
        return energyLevel;
    }
    // public int energyIncrease(int sum) {
    //     energyLevel += sum;
    //     System.out.println (energyLevel);
    //     return energyLevel;
    // }


    public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}
