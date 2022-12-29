package labels;

import javax.swing.*;
import java.awt.*;

public class JavaLabels {
    public static void main(String[] args){

        var frame = new JFrame();
        var image = new ImageIcon("coding.png");
        var bgImage = new ImageIcon("photos.png");
        var label = new JLabel();
        var border = BorderFactory.createLineBorder(Color.green, 2);

        label.setText("I'm new here!!");
        label.setIcon(bgImage);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(20,202,222));
        label.setFont(new Font("MV Boli", Font.ITALIC,50));
        label.setIconTextGap(20);
        label.setBackground(new Color(25,82,100));
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0,0,250,250);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(25,62,100));
        frame.setVisible(true);
        frame.add(label);
        frame.pack();// This should be done last
    }
}
