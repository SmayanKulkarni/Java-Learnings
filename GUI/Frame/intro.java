import javax.swing.JFrame;
import javax.swing.plaf.ColorUIResource;
import java.awt.Color;
import javax.swing.ImageIcon;

class intro
{
    public static void main(String args[])
    {
        JFrame frame = new JFrame();
        frame.setTitle("1st Java GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(420,420);
        frame.setResizable(false);
        ImageIcon icon = new ImageIcon("GUI/295675-large-anime-scenery-wallpaper-1920x1080.jpg");
        frame.setIconImage(icon.getImage());
        frame.getContentPane().setBackground(new Color(120,120,120));
    }
}