
public class Train {

    TrainGoal trainGoal = new TrainGoal();
    Wagons wagons;

    public Train(Wagons wagons) {
        this.wagons = wagons;
    }

    public void action(Player player) {
        switch(player.getInstruction()) {
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
        wagons.setTotalWagons(totalWagons);
    }

    public TrainGoal getTrainGoal() {
        return trainGoal;
    }

    public void setTrainGoal(TrainGoal trainGoal) {
        this.trainGoal = trainGoal;
    }

}
