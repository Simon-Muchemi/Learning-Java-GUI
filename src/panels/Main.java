package panels;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main (String [] args){

        var label = new JLabel();
        var frame = new JFrame();
        var redpanel = new JPanel();
        var bluepanel = new JPanel();
        var greenpanel = new JPanel();
        var image = new ImageIcon("photos.png");
        var icon = new ImageIcon("coding.png");

        label.setText("Coding...");
        label.setIcon(icon);

        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0,250,500,250);

        bluepanel.setBackground(Color.BLUE);
        bluepanel.setBounds(250,0,250,250);

        redpanel.setBackground(Color.red);
        redpanel.add(label);
        redpanel.setBounds(0,0,250,250);

        frame.setIconImage(image.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        frame.add(redpanel);
        frame.add(greenpanel);
        frame.add(bluepanel);

    }
}
