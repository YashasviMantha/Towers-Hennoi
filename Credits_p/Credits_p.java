package Credits_p;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
//import java.net.URIConnection;


public class Credits_p extends JFrame implements ActionListener
{
    public Credits_p()
    {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);

        GridBagConstraints gbc = new GridBagConstraints();

        JButton TW = new JButton("Chess");
        TW.setToolTipText("Click to open Chess handle");
        TW.setPreferredSize(new Dimension(300, 60));
        TW.setFont(new Font("Arial", Font.PLAIN, 28));
        TW.setActionCommand("CH");
        TW.addActionListener(this);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets = new Insets(10, 10, 10, 10);

        add(TW,gbc);


        JButton GT = new JButton("Github");
        GT.setToolTipText("Click to open Github handle");
        GT.setPreferredSize(new Dimension(300, 60));
        GT.setFont(new Font("Arial", Font.PLAIN, 28));
        GT.setActionCommand("GT");
        GT.addActionListener(this);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(10, 10, 10, 10);

        add(GT,gbc);

        JButton LD = new JButton("LinkedIN ");
        LD.setToolTipText("Click to open LinkiedIN handle");
        LD.setPreferredSize(new Dimension(300, 60));
        LD.setFont(new Font("Arial", Font.PLAIN, 28));
        LD.setActionCommand("LD");
        LD.addActionListener(this);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.insets = new Insets(10, 10, 10, 10);

        add(LD,gbc);


        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent AE)
    {
        System.out.println("Called");
        String Action = AE.getActionCommand();
        if (Action.equals("CH")) {
            try {
                Desktop desktop = java.awt.Desktop.getDesktop();
                URI oURI = new URI("https://www.chess.com/member/dump7");
                desktop.browse(oURI);
            } catch (Exception e) {
                System.out.println("Exe");
            }
        }

        if (Action.equals("GT"))
        {
            try {
                Desktop desktop = java.awt.Desktop.getDesktop();
                URI oURI = new URI("https://github.com/YashasviMantha/Towers-Hennoi");
                desktop.browse(oURI);
            } catch (Exception e) {
                System.out.println("Exe");
            }
        }
        if (Action.equals("LT"))
        {
            try {
                Desktop desktop = java.awt.Desktop.getDesktop();
                URI oURI = new URI("https://www.linkedin.com/in/yashasvi-mantha-2b964616b/");
                desktop.browse(oURI);
            } catch (Exception e) {
                System.out.println("Exe");
            }
        }
    }

    public static void main(String[] ARGS)
    {
        new Credits_p();
    }

}