import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    void myframe(){
           this.setTitle("My First Frame");
           this.setResizable(false);
           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.setSize(400,400);
           this.setVisible(true);

           var image = new ImageIcon("photos.png");
           this.setIconImage(image.getImage());
           this.getContentPane().setBackground(new Color(25,62,100));
            
    }
}
