public class TrainGame {
    TrainTracks trainTracks;
    Train train;
    Player player;
    int totalWagons;
    String instruction;

    public TrainGame(TrainTracks trainTracks, Train train, Player player, int totalWagons, String instruction) {
        this.trainTracks = trainTracks;
        this.train = train;
        this.player = player;
        this.totalWagons = totalWagons;
        this.instruction = instruction;
    }

    public void prepareTrain() {
        trainTracks.addTracks();
    }

    public void startToPlay() {
        player.drive(train, totalWagons, instruction);
    }
    
}