import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;

public class TOH extends JFrame implements MouseListener{

//        JFrame Paper = new JFrame("SIM");
        boolean Dragging = false;
        int MouseX = 115;
        int MouseY = 750;
        int curX = 100,curY = 50;
        int flag = 0;
        int Limit_Rect[] = {115,750,100,50};
        TOH()
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
        if(CurrentMouseX>=Limit_Rect[0] && CurrentMouseY>=Limit_Rect[1] && CurrentMouseX<(Limit_Rect[0]+80) && CurrentMouseY<Limit_Rect[1]+50)
        {
            System.out.println("Dragging is true now");
            Dragging = true;
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
            if(Dragging)
            {
//                System.out.println("Called");
                g.setColor(Color.green);
                g.fillRect(MouseX,MouseY,80,50);
                System.out.println(MouseX + "  " +MouseY );
                Limit_Rect[0] = MouseX;
                Limit_Rect[1] = MouseY;
                Dragging = false;
            }
            g.setColor(Color.black);
            g.fillRect(150,300,25,500);
            g.fillRect(385,300,25,500);
            g.fillRect(610,300,25,500);

//            g.fillRect(115,750,100,50);
            if(!Dragging)
            {
                g.setColor(Color.green);
                g.fillRect(Limit_Rect[0],Limit_Rect[1],Limit_Rect[2],Limit_Rect[3]);
                flag = 1;
            }
        }

    public static void main(String Main[])
    {
        TOH test = new TOH();
    }

}