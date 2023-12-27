package classes;

import javax.swing.*;
import java.awt.*;

public class config_defineButtonProperties{
    public static void setBGColor(JButton button)
    {
        button.setBackground(Color.BLACK);
        button.setBorderPainted(false);
    }
    public static void setFGColor(JButton button)
    {
        button.setForeground(Color.WHITE);
    }
    public static void removeBorder(JButton button)
    {
        
        button.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    }
}