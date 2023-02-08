
public abstract class Player {

    protected String instruction;

    public Player() {
        
    }

    public Player(String instruction) {
        this.instruction = instruction;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

}
