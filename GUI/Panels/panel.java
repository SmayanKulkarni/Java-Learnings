import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

class panel
{
    public static void main(String args[])
    {
        ImageIcon image = new ImageIcon("/home/smayan/Desktop/Java/GUI/Labels/295675-large-anime-scenery-wallpaper-1920x1080.jpg");
        Border border = BorderFactory.createLineBorder(Color.green,3);
        JLabel label = new JLabel();
        label.setText("hi");
        label.setIcon(image);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setBounds(0,0,75,75);


        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0, 0, 250,250);
        JPanel bluepanel = new JPanel(); 
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250, 0, 250,250);
        JPanel greenpanel = new JPanel(); 
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0, 0, 250,250);
        

        
        JFrame frame = new JFrame();
        frame.setTitle("1st Java GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(750,750);
        frame.setResizable(true);
        frame.getContentPane().setBackground(new Color(120,120,120));
        greenpanel.add(label);
        frame.add(bluepanel);
        frame.add(greenpanel);
        frame.add(redpanel);
    }
}