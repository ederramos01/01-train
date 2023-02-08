
public class Wagons {

    int totalWagons;

    public int getTotalWagons() {
        return totalWagons;
    }

    public void setTotalWagons(int totalWagons) {
        if(totalWagons == 1) {
            System.out.println("-> Main wagon has been set.\n");
        } else {
            System.out.println("-> " + totalWagons + " wagons have been added to the train.\n");
        }
    }

}
