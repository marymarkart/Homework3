package Exercise2;

import javax.swing.*;
import java.awt.*;

public class Tester {
    public static void main(String[] args) {
        //initialize values
        int redNum = 0;
        int blueNum = 0;
        int purpleNum = 0;

        //construct Number object with initial values
        Numbers nums = new Numbers(redNum, blueNum, purpleNum);
        //Create GraphView object with initial values
        GraphView graph = new GraphView(redNum, blueNum, purpleNum);

        //Create NumberView object from initial values
        NumberView numView = new NumberView(redNum, blueNum, purpleNum);

        //display Frame + update values
        numView.createFrame(nums);

        //attach graph to (updated)Number object
        nums.attach(graph);

        //create GraphView Frame
        JFrame graphsView;
        graphsView = graph;
        graphsView.setTitle("Graph View");
        graphsView.setLayout(new FlowLayout());
        graphsView.setPreferredSize(new Dimension(270, 500));
        graphsView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        graphsView.pack();
        graphsView.setVisible(true);
    }
}
