public abstract class Entity {
    private final int ID;
    private int energy;
    private final int startEnergy;
    private XY position;

    public Entity(int id, int energy, XY position) {
        ID = id;
        startEnergy = energy;
        this.energy = energy;
        this.position = position;
    }

    public abstract void nextStep();

    public XY getPosition() {
        return position;
    }

    public int getEnergy() {
        return energy;
    }

    public int getID() {
        return ID;
    }

    public void UpdateEnergy(int value){
        energy += value;
    }

}
