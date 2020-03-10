import java.awt.*;

import javax.swing.*;

public class Screen extends  JPanel implements  Runnable{

    public Thread THR= new Thread(this);

    public Screen(){
       // setBackground(Color.lightGray);
        THR.start();
    }


    public void paintComponent(Graphics g)
    {

    }


    public static int fpsFrame=0 , fps=10000000;

    public void run() {

        while (true) {
                repaint();

            try {
                Thread.sleep(1);

            } catch (Exception e) {
            }
        }
    }
}
