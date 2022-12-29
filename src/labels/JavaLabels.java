package labels;

import javax.swing.*;
import java.awt.*;

public class JavaLabels {
    public static void main(String[] args){
        var label = new JLabel();
        label.setText("I am new here!!");

        var frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var image = new ImageIcon("coding.png");
        frame.setIconImage(image.getImage());
        frame.setSize(400,400);
        frame.getContentPane().setBackground(new Color(25,62,100));
        frame.setVisible(true);
    }
}
