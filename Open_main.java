import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Open_main implements ActionListener
{
    Open_main()
    {
       JFrame MenuFrame = new JFrame("Menu - Towers Of Hennoi");
        MenuFrame.setSize(800, 800);
        GridBagLayout layout = new GridBagLayout();
        MenuFrame.setLayout(layout);


        GridBagConstraints gbc = new GridBagConstraints();


        JButton B1 = new JButton("Start Simulation!");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        B1.setToolTipText("Click to start simulation");
        B1.setActionCommand("Sim_St");
//        B1.addActionListener(this);
        //gbc.gridx = 0;
//        gbc.weightx = 1.0;
//        gbc.weighty = 1.0;
//        gbc.gridy = 2;
        MenuFrame.add(B1,gbc);



        MenuFrame.setVisible(true);
        //MenuFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }




    public static void main(String Args[])
    {
        new Open_main();
    }

}