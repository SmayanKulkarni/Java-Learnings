import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

class labels {
    public static void main(String args[]) {   
        ImageIcon image = new ImageIcon("GUI/295675-large-anime-scenery-wallpaper-1920x1080.jpg");
        JLabel label = new JLabel();
        label.setText("This is the label");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.WHITE); // Change foreground color to white
        
        label.setBackground(Color.BLACK);
        label.setIconTextGap(10);
        
        label.setFont(new Font("Serif", Font.BOLD, 30));
        label.setOpaque(true);

        JFrame frame = new JFrame();
        frame.setTitle("1st Java GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(420, 420);
        frame.setResizable(false);
        ImageIcon icon = new ImageIcon("GUI/295675-large-anime-scenery-wallpaper-1920x1080.jpg");
        frame.setIconImage(icon.getImage());
        frame.getContentPane().setBackground(new Color(120, 120, 120));
        
        frame.add(label); // Add the label to the frame
    }
}
