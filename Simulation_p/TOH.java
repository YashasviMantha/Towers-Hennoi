package Simulation_p;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;

public class TOH extends JFrame implements MouseListener{

//        JFrame Paper = new JFrame("SIM");
        boolean Dragging_1 = false, Dragging_2 = false, Dragging_3 = false;
        int MouseX = 115,MouseY = 750;
        int curX = 100,curY = 50;
        int flag = 0;

        int Limit_Rect_1[] = {90,760,150,30};
        int Limit_Rect_2[] = {100,710,125,30};
        int Limit_Rect_3[] = {110,660,100,30};
       public TOH()
        {

            setSize(800, 800);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setVisible(true);
            addMouseListener(this);

        }

//    public void mousePressed(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseClicked(MouseEvent e){ }
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e) {
//        System.out.println( "Clicked");
        int CurrentMouseX = e.getX();
        int CurrentMouseY = e.getY();
        System.out.println("Clicked - "+MouseX+"  "+MouseY);
        if(CurrentMouseX>=Limit_Rect_1[0] && CurrentMouseY>=Limit_Rect_1[1] && CurrentMouseX<(Limit_Rect_1[0]+80) && CurrentMouseY<Limit_Rect_1[1]+50)
        {
            System.out.println("Dragging_1 is true now");
            Dragging_1 = true;
        }
        if(CurrentMouseX>=Limit_Rect_2[0] && CurrentMouseY>=Limit_Rect_2[1] && CurrentMouseX<(Limit_Rect_2[0]+80) && CurrentMouseY<Limit_Rect_2[1]+50)
        {
            System.out.println("Dragging_2 is true now");
            Dragging_2 = true;
        }
        if(CurrentMouseX>=Limit_Rect_3[0] && CurrentMouseY>=Limit_Rect_3[1] && CurrentMouseX<(Limit_Rect_3[0]+80) && CurrentMouseY<Limit_Rect_3[1]+50)
        {
            System.out.println("Dragging_3 is true now");
            Dragging_3 = true;
        }
    }

    public void mouseReleased(MouseEvent e)
    {
        MouseX = e.getX();
        MouseY = e.getY();
        repaint();
//        Dragging = false;
//        System.out.println("Unclicked");
    }



//    @Override


        public void paint(Graphics g)
        {
            super.paint(g);


//            if(MouseX>Limit_Rect[0] && MouseY>Limit_Rect[1] && MouseX<(Limit_Rect[0]+80) && MouseY<(Limit_Rect[1]+50))
            if(Dragging_1)
            {
//                System.out.println("Called");
                g.setColor(Color.green);
//                if(MouseX>120 && MouseX<200)
//                {
                    g.fillRect(MouseX, MouseY, 150, 30);
                    System.out.println(MouseX + "  " + MouseY);
                    Limit_Rect_1[0] = MouseX;
                    Limit_Rect_1[1] = MouseY;
                    Dragging_1 = false;
//                }
            }
            if(Dragging_2)
            {
//                System.out.println("Called");
                g.setColor(Color.blue);
                g.fillRect(MouseX,MouseY,125,30);
                System.out.println(MouseX + "  " +MouseY );
                Limit_Rect_2[0] = MouseX;
                Limit_Rect_2[1] = MouseY;
                Dragging_2 = false;
            }
            if(Dragging_3)
            {
//                System.out.println("Called");
                g.setColor(Color.blue);
                g.fillRect(MouseX,MouseY,100,30);
                System.out.println(MouseX + "  " +MouseY );
                Limit_Rect_3[0] = MouseX;
                Limit_Rect_3[1] = MouseY;
                Dragging_3 = false;
            }
            g.setColor(Color.black);
            g.fillRect(150,300,25,500); // Thresh = 135,190
            g.fillRect(385,300,25,500);
            g.fillRect(610,300,25,500);

//            g.fillRect(115,750,100,50);
            if(!Dragging_1 || !Dragging_2 || !Dragging_3)
            {
                g.setColor(Color.green);
                g.fillRect(Limit_Rect_1[0],Limit_Rect_1[1],Limit_Rect_1[2],Limit_Rect_1[3]);
                g.setColor(Color.blue);
                g.fillRect(Limit_Rect_2[0],Limit_Rect_2[1],Limit_Rect_2[2],Limit_Rect_2[3]);
                g.setColor(Color.red);
                g.fillRect(Limit_Rect_3[0],Limit_Rect_3[1],Limit_Rect_3[2],Limit_Rect_3[3]);
                flag = 1;
            }
        }

    public static void main(String Main[])
    {
        TOH test = new TOH();
    }

}