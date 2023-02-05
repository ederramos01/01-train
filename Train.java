
public class Train {

    Control control;
    Wagons wagons;

    public Train(Control control, Wagons wagons) {
        this.control = control;
        this.wagons = wagons;
    }

    public void actions(String instruction) {
        switch(instruction) {
            case "Advance":
                control.advance();
                break;
            case "Go Back":
                control.goBack();
                break;
            case "Stop":
                control.stop();
                break;
            case "Whistle":
                control.whistle();
                break;
        }
    }

    public void howManyWagons(int totalWagons) {
        wagons.addWagons(totalWagons);
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public Wagons getWagons() {
        return wagons;
    }

    public void setWagons(Wagons wagons) {
        this.wagons = wagons;
    }

}
