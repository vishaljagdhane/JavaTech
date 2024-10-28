import javax.swing.*;

public class BasicoFjava {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Basic Java Desktop Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Create a label to display a message
        JLabel label = new JLabel("Welcome to my Java Application!", SwingConstants.CENTER);
        frame.add(label);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
