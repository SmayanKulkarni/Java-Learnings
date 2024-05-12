import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;


class labels {
    public static void main(String args[]) {   
        
        JLabel label = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.green,3);
        label.setText("This is the label");
        ImageIcon image = new ImageIcon("138564278.jpeg");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.GREEN); // Change foreground color to white
        label.setFont(new Font("Serif", Font.BOLD, 20));
    
        label.setBorder(border);
        label.setBackground(Color.BLACK);
        label.setIconTextGap(20);
        
        label.setFont(new Font("Serif", Font.BOLD, 30));
        label.setOpaque(true);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(100,0,250,250);

        label.setBounds(0,0,250,250);
        JFrame frame = new JFrame();
        frame.setTitle("1st Java GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(420, 420);
        frame.setResizable(true);
        frame.setLayout(null);
        ImageIcon icon = new ImageIcon("138564278.jpeg");
        frame.setIconImage(icon.getImage());
        frame.getContentPane().setBackground(new Color(120, 120, 120));
        
        frame.add(label); // Add the label to the frame
    }
}
