public class TrainGame {
    TrainTracks trainTracks;
    Train train;
    Player player;
    int totalWagons;

    public TrainGame(TrainTracks trainTracks, Player player, Train train, int totalWagons) {
        this.trainTracks = trainTracks;
        this.player = player;
        this.train = train;
        this.totalWagons = totalWagons;
    }

    public void prepareTrain() {
        trainTracks.addTracks();
    }

    public void startToPlay() {
        train.howManyWagons(totalWagons);
        train.action(player.getInstruction());
    }
    
}