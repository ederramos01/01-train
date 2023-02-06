public class Main {
    public static void main(String[] args) {
        TrainTracks trainTracks = new OpenTracks();
        Train train = new Train(new Wagons());
        Player player = new Player();

        TrainGame trainGame = new TrainGame(trainTracks, player, train, 1);

        trainGame.prepareTrain();
        trainGame.startToPlay();
        
    }
}
