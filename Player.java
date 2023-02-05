
public class Player {

    public void drive(Train train, int totalWagons, String instruction) {
        train.howManyWagons(totalWagons);
        train.actions(instruction);
    }

}
