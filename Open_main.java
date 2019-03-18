import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Open_main
{
    Open_main()
    {
       JFrame MenuFrame = new JFrame("Menu - Towers Of Hennoi");
        MenuFrame.setSize(500, 800);
        GridBagLayout layout = new GridBagLayout();
        MenuFrame.setLayout(layout);


        GridBagConstraints gbc = new GridBagConstraints();


        JButton B1 = new JButton("Start Simulation!");
        B1.setToolTipText("Click to start simulation!");
        B1.setPreferredSize(new Dimension(300, 60));
        B1.setFont(new Font("Arial", Font.PLAIN, 28));
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets = new Insets(10,10,10,10);
        MenuFrame.add(B1,gbc);

        JButton B2 = new JButton("Rules");
        B2.setToolTipText("Click to understand the rules!");
        B2.setFont(new Font("Arial", Font.PLAIN, 28));
        B2.setPreferredSize(new Dimension(300, 60));
        gbc.gridx = 0;
        gbc.gridy = 1;
        MenuFrame.add(B2,gbc);

        JButton B3 = new JButton("Credits");
        B3.setToolTipText("Click for Credits!");
        B3.setFont(new Font("Arial", Font.PLAIN, 28));
        B3.setPreferredSize(new Dimension(300, 60));
        gbc.gridx = 0;
        gbc.gridy = 3;
        MenuFrame.add(B3,gbc);


        //MenuFrame.pack();                     //Packes the size of the frame just so that all the buttons fit.
        MenuFrame.setLocationRelativeTo(null);  //Places the frame to the middle of the screen
        MenuFrame.setVisible(true);
        //MenuFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }




    public static void main(String Args[])
    {
        new Open_main();
    }

}