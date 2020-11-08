package Exercise2;

import javax.swing.*;
import java.awt.*;

public class Tester {
    public static void main(String[] args) {
        //initialize values
        int r = 0;
        int b = 0;
        int p = 0;

        //construct Number object with initial values
        Numbers nums = new Numbers(r, b, p);
        //Create GraphView object with initial values
        GraphView graph = new GraphView(r, b, p);

        //Create NumberView object from initial values
        NumberView numView = new NumberView(r, b, p);

        //display Frame + update values
        numView.createFrame(nums);

        //attach graph to (updated)Number object
        nums.attach(graph);

        //create GraphView Frame
        JFrame graphsView;
        graphsView = graph;
        graphsView.setLayout(new FlowLayout());
        graphsView.setPreferredSize(new Dimension(300, 300));
        graphsView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        graphsView.pack();
        graphsView.setVisible(true);
    }
}
