package Rules_p;

import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

public class Rules_p extends JFrame
{
    public BufferedImage image;
    public Rules_p()
    {
        setSize(1200, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            image = ImageIO.read(new File("Rules.png"));
        } catch (IOException ex) {
            System.out.println("IMAGE ");
        }
//        image = ImageIO.read(new File("Rules.png"));
        setLocationRelativeTo(null);
        setVisible(true);
    }


    public void paint(Graphics g)
    {
        super.paint(g);
        String Rules_Message_1 = "The goal of the puzzle is to move all the disks from the leftmost peg to the rightmost peg, adhering to the following rules:\n";
        String Rules_Message_2 = "1. Move only one disk at a time.\n";
        String Rules_Message_3 = "2. A larger disk may not be placed ontop of a smaller disk.";
        String Rules_Message_4 = "3. All disks, except the one being moved, must be on a peg.";
        g.setFont(new Font("Arial", Font.PLAIN, 20));
        g.drawString(Rules_Message_1,15,60);
        g.drawString(Rules_Message_2,40,100);
        g.drawString(Rules_Message_3,40,130);
        g.drawString(Rules_Message_4,40,160);
        g.drawString("Pictorial Representation:-",400,200);
        g.drawImage(image,400,220,this);

    }

    public static void main(String[] ARGS)
    {
        new Rules_p();
    }

}