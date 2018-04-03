public abstract class Entity {
    protected final int ID;
    protected int energy;
    protected final int startEnergy;
    protected XY position;

    public Entity(int id, int energy, XY position) {
        ID = id;
        startEnergy = energy;
        this.energy = startEnergy;
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

    public String toString(){
        return "Pos: " + position.X + ", " + position.Y + "; Energy: " + energy + "/" + startEnergy;
    }

}
