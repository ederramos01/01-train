
public class OpenTracks extends TrainTracks{

    public OpenTracks() {
        this.lineTracks = 8;
    }

    @Override
    public void addTracks() {
        System.out.println("-> " + lineTracks + " lines have been add to the train tracks.");
        
    }

}
