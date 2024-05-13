import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    MyFrame() {
        ImageIcon image = new ImageIcon("GUI/Buttons/360_F_463789305_btam3pcroXs2A3fMhDsHH1yDPIIoPoE5.jpg");
        ImageIcon image2 = new ImageIcon("/home/smayan/Desktop/Java/GUI/Buttons/360_F_203250153_gYJH96UPlNrNwpR56ABJWi7k5HRvPaGw.jpg");
        button = new JButton();
        label = new JLabel();   
        label.setIcon(image);
        button.setText("Click me");
        button.setHorizontalTextPosition(JButton.CENTER); 
        button.setVerticalTextPosition(JButton.BOTTOM); 
        button.setIcon(image2);
        button.setIconTextGap(-10);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.addActionListener(this);
        button.setBounds(50,100,75,75);
        button.setFocusable(false);
        button.setFont(new Font("Comic Sans", Font.BOLD, 20));
        button.setForeground(Color.BLACK);
        button.setBackground(Color.cyan);
       

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);

    }

    public void ActionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)
        {
            System.out.println("poo");
        }
    }
}


