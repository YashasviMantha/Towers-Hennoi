import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Open_main implements ActionListener
{
    JFrame MenuFrame = new JFrame("Menu - Towers Of Hennoi");
    JFrame TestF = new JFrame("This is a test!");
    JFrame RulesFrame = new JFrame("Rules - Towers Of Hennoi");
    JFrame Simulation = new JFrame("Simulation - Towers Of Hennoi");
    Open_main()
    {
        Menu();
    }

    public static void main(String Args[])
    {
        new Open_main();
    }


    public void Menu()
    {
        MenuFrame.setSize(500, 800);
        GridBagLayout layout = new GridBagLayout();
        MenuFrame.setLayout(layout);

        GridBagConstraints gbc = new GridBagConstraints();

//        Button 1 Start Simulation
        JButton B1 = new JButton("Start Simulation!");
        B1.setToolTipText("Click to start simulation!");
        B1.setPreferredSize(new Dimension(300, 60));
        B1.setFont(new Font("Arial", Font.PLAIN, 28));
        B1.setActionCommand("ST_SIM");
        B1.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets = new Insets(10, 10, 10, 10);
        MenuFrame.add(B1, gbc);

//        Button 2 Rules
        JButton B2 = new JButton("Rules");
        B2.setToolTipText("Click to understand the rules!");
        B2.setFont(new Font("Arial", Font.PLAIN, 28));
        B2.setPreferredSize(new Dimension(300, 60));
        B2.setActionCommand("RULES");
        B2.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 1;
        MenuFrame.add(B2, gbc);

//        Button 3 Credits
        JButton B3 = new JButton("Credits");
        B3.setToolTipText("Click for Credits!");
        B3.setFont(new Font("Arial", Font.PLAIN, 28));
        B3.setPreferredSize(new Dimension(300, 60));
        B3.addActionListener(this);
        gbc.gridx = 0;
        gbc.gridy = 3;
        MenuFrame.add(B3, gbc);


        //MenuFrame.pack();                                   //Packes the size of the frame just so that all the buttons fit.
        MenuFrame.setLocationRelativeTo(null);                //Places the frame to the middle of the screen
        MenuFrame.setVisible(true);
        //MenuFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    void TestFrame()
    {
        TestF.setSize(500, 800);
        TestF.setVisible(true);
        TestF.setLocationRelativeTo(null);
    }

    void RulesFrame()
    {

        String Rules_Message_1 = "The goal of the puzzle is to move all the disks from the leftmost peg to the rightmost peg, adhering to the following rules:\n";
        String Rules_Message_2 = "1. Move only one disk at a time.\n";
        String Rules_Message_3 = "2. A larger disk may not be placed ontop of a smaller disk.";
        String Rules_Message_4 = "3. All disks, except the one being moved, must be on a peg.";

        JTextField T1 = new JTextField(Rules_Message_1,5);
        RulesFrame.add(T1);

        RulesFrame.setSize(500, 800);
        RulesFrame.setVisible(true);
        RulesFrame.setLocationRelativeTo(null);
    }

    void Simulation_FUNC()
    {
        Simulation.setSize(800,800);



        Simulation.setLocationRelativeTo(null);                //Places the frame to the middle of the screen
        Simulation.setVisible(true);

    }

    //    @Override
    public void actionPerformed(ActionEvent AE)
    {
        System.out.println("Called");
        String Action = AE.getActionCommand();
        if (Action.equals("RULES"))
        {
            MenuFrame.setVisible(false);
            Simulation.setVisible(false);
            RulesFrame();
        }

        if (Action.equals("ST_SIM"))
        {
            MenuFrame.setVisible(false);
            RulesFrame.setVisible(false);
//            Simulation.setVisible(true);
            Simulation_FUNC();
        }
    }
}


//     https://www.cs.sfu.ca/~tamaras/recursion/Rules_Towers_Hanoi.html