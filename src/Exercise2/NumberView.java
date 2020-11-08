package Exercise2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberView extends JFrame {
    int n1;
    int n2;
    int n3;

    //initial constructor
    public NumberView(int n1, int n2, int n3){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    //display NumberView
    public void createFrame( Numbers nums){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;

        NumberView numView = new NumberView(n1, n2, n3);
        //initialize variables

        //create JFrame
        JFrame numsView = new JFrame();
        numsView.setLayout(new GridLayout(4,2));
        numsView.setSize(500, 100);


        final int FIELD_WIDTH = 5;
        //Create update button
        JButton update = new JButton("Click to Update");
        //3 text fields + labels
        JLabel label1 = new JLabel("Red:");
        JLabel label2 = new JLabel("Blue:");
        JLabel label3 = new JLabel("Purple:");
        JTextField textField1 = new JTextField(FIELD_WIDTH);
        JTextField textField2 = new JTextField(FIELD_WIDTH);
        JTextField textField3 = new JTextField(FIELD_WIDTH);

        //create a String out of the integer values
        String num1 = String.valueOf(n1);
        String num2 = String.valueOf(n2);
        String num3 = String.valueOf(n3);
        textField1.setText(num1);
        textField2.setText(num2);
        textField3.setText(num3);

        //add elements to JFrame
        numsView.add(label1);
        numsView.add(textField1);
        numsView.add(label2);
        numsView.add(textField2);
        numsView.add(label3);
        numsView.add(textField3);
        numsView.add(update);

        //add ActionListener to the update button to update values
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //parse testfields for integers
                int new1 = Integer.parseInt(textField1.getText());
                int new2 = Integer.parseInt(textField2.getText());
                int new3 = Integer.parseInt(textField3.getText());
                //update NumberView and Number object
                numView.updateNumberView(new1, new2, new3, nums);
            }
        });

        numsView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        numsView.pack();
        numsView.setVisible(true);
    }

    public void updateNumberView(int n1, int n2, int n3, Numbers num){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        //call method to update Number and attached GraphView object
        num.updateValues(n1,n2,n3);
    }

}
