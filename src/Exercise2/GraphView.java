package Exercise2;

import com.sun.javafx.tools.ant.Info;
import org.w3c.dom.css.Rect;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class GraphView extends JFrame{
    int n1;
    int n2;
    int n3;

    public GraphView(int n1, int n2, int n3){
        //initialize variables
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public void updateGraph(int n1, int n2, int n3){
        //update values
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        //repaint graph
        repaint();
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;

        //Stick values to bottom of JFrame
        int y1 = getHeight() - n1 - 10;
        int y2 = getHeight() - n2 - 10;
        int y3 = getHeight() - n3 - 10;

        //Rectangle for n1
        g2.setColor(Color.RED);
        Rectangle rec1 = new Rectangle(10, y1, 50, n1);
        g2.draw(rec1);
        g2.fill(rec1);

        //Rectangle for n2
        g2.setColor(Color.BLUE);
        Rectangle rec2 = new Rectangle(110, y2, 50, n2);
        g2.draw(rec2);
        g2.fill(rec2);

        //Rectangle for n3
        g2.setColor(Color.MAGENTA);
        Rectangle rec3 = new Rectangle(210, y3, 50, n3);
        g2.draw(rec3);
        g2.fill(rec3);

    }
}