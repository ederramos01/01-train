public class TrainGoal {

    private static int kilometer;

    public void advance() {
        kilometer++;
        System.out.println("-> The train is moving foward "+kilometer+" kilometers.\n");
        return;
    }

    public void goBack() {
        if(kilometer <=0 ) {
            System.out.println("-> Sorry you do not move foward.");
        } else {
            kilometer--;
            System.out.println("-> The train is going back "+kilometer+" kilometers.\n");
        }
        return;
    }

    public void stop() {
        System.out.println("-> The train stopped and traveled "+kilometer+" kilometers.\n");
        return;
    }

    public void whistle() {
        System.out.println("-> The train whistled.\n");
        return;
    }
}
