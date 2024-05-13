import java.util.*;
import javax.swing.*;
import java.awt.*;

class main{
    public static void main(String args[])
    {
        JOptionPane.showMessageDialog(null,"useless information", "title", JOptionPane.ERROR_MESSAGE); 
        JOptionPane.showMessageDialog(null,"useless information", "title", JOptionPane.INFORMATION_MESSAGE); 
        JOptionPane.showMessageDialog(null,"useless information", "title", JOptionPane.QUESTION_MESSAGE); 
        JOptionPane.showMessageDialog(null,"useless. information", "title", JOptionPane.WARNING_MESSAGE); 

        int ans = JOptionPane.showConfirmDialog(null, "bro what are u doing", "title", JOptionPane.YES_NO_CANCEL_OPTION);
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showConfirmDialog(null, "is your name really " +name +"?", "Confirmation  ", JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.println("Hello, "+name+"!");

        String responses[] = { "no, youre awesome", "thank you", "bro what"};
        ImageIcon image = new ImageIcon("/home/smayan/Desktop/Java/GUI/Buttons/360_F_203250153_gYJH96UPlNrNwpR56ABJWi7k5HRvPaGw.jpg");
        JOptionPane.showOptionDialog(null, "these are the options", 
            "secret message", JOptionPane.YES_NO_CANCEL_OPTION,         
            JOptionPane.INFORMATION_MESSAGE,
            image, responses, 0);

    }
}