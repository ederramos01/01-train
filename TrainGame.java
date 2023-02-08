import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TrainGame {
    TrainTracks trainTracks;
    Train train;
    Player player;
    int totalWagons;
    int[] menuOption = {2, 3, 4, 5, 9};

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
        try (Scanner readNumber = new Scanner(System.in)) {
            int option = 0;
            int totalWagons = 0;
            while(option != 9){
                System.out.println("Digite una option (Press 9 to exit.)");
                System.out.println("1) Add Wagons");
                System.out.println("2) Advance");
                System.out.println("3) Go Back");
                System.out.println("4) Stop");
                System.out.println("5) Whistle");
                if(player.getClass().getName() == "Human") {
                    option = readNumber.nextInt();
                } else {
                    option = menuOption[new Random().nextInt(4+1)];
                }
                switch (option) {
                    case 1:
                        System.out.println("1) How many wagons do you want to add?");
                        totalWagons = readNumber.nextInt();
                        train.howManyWagons(totalWagons);
                        break;
                    case 2:
                        player.setInstruction("Advance");
                        train.action(player);
                        break;
                    case 3:
                        player.setInstruction("Go Back");
                        train.action(player);
                        break;
                    case 4:
                        player.setInstruction("Stop");
                        train.action(player);
                        break;
                    case 5:
                        player.setInstruction("Whistle");
                        train.action(player);
                        break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("¡Error!... You should type a number.");
        }
    }
}