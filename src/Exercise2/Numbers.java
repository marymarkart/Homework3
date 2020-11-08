package Exercise2;

public class Numbers {
    int redNumber;
    int greenNumber;
    int blueNumber;

    GraphView gView;

    public Numbers(int n1, int n2, int n3){
        this.redNumber = n1;
        this.greenNumber = n2;
        this.blueNumber = n3;


    }
    //attach GraphView object
    public void attach(GraphView gView){
        this.gView = gView;
    }


    public void updateValues(int n1, int n2, int n3){
        this.redNumber = n1;
        this.greenNumber = n2;
        this.blueNumber = n3;
        //update attached graph
        gView.updateGraph(redNumber, greenNumber, blueNumber);
    }

}
