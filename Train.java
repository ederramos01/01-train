
public class Train {

    TrainGoal trainGoal = new TrainGoal();
    Wagons wagons;

    public Train(Wagons wagons) {
        this.wagons = wagons;
    }

    public void action(String instruction) {
        switch(instruction) {
            case "Advance":
                trainGoal.advance();
                break;
            case "Go Back":
                trainGoal.goBack();
                break;
            case "Stop":
                trainGoal.stop();
                break;
            case "Whistle":
                trainGoal.whistle();
                break;
        }
    }

    public void howManyWagons(int totalWagons) {
        wagons.addWagons(totalWagons);
    }

    public Wagons getWagons() {
        return wagons;
    }

    public void setWagons(Wagons wagons) {
        this.wagons = wagons;
    }

    public TrainGoal getTrainGoal() {
        return trainGoal;
    }

    public void setTrainGoal(TrainGoal trainGoal) {
        this.trainGoal = trainGoal;
    }

}
