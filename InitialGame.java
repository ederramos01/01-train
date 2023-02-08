import java.util.Scanner;

public class InitialGame {
    Player player;
    
    public void firstMenu() {
        try (Scanner readNumber = new Scanner(System.in)) {
            int option = 0;
            while(option != 9) {
                System.out.println("Greetings!! Do you want to play or want to watch the computer?");
                System.out.println("1) I want to play!");
                System.out.println("2) Watch the computer to play!");
                option = readNumber.nextInt();
                if (option == 1) {
                    System.out.println("elegiste 1");
                    player = new Human();
                    setGame();
                    option = 9;
                } else {
                    System.out.println("elegiste 2");
                    player = new Computer();
                    setGame();
                    option = 9;
                }
            }
        }
        
    }

    public void setGame() {
        TrainTracks trainTracks = new OpenTracks();
        Train train = new Train(new Wagons());

        TrainGame trainGame = new TrainGame(trainTracks, player, train, 1);

        trainGame.prepareTrain();
        trainGame.startToPlay();
    }
}
