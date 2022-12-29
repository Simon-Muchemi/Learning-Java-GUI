import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        var frame = new JFrame();
        frame.setTitle("My first frame");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);

        var image = new ImageIcon("icon.ico");
        frame.setIconImage(image.getImage());

    }
}