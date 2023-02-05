public class Main {
    public static void main(String[] args) {
        TrainTracks trainTracks = new OpenTracks();
        Train train = new Train(new Control(), new Wagons());
        Player player = new Player();

        TrainGame trainGame = new TrainGame(trainTracks, train, player, 15, "Go Back");

        trainGame.prepareTrain();
        trainGame.startToPlay();
        
    }
}
