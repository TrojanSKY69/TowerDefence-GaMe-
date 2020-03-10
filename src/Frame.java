import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public static  String title = "Welcome to Sha-Tower Game!!";

    public static Dimension size=new Dimension(700,650);


    public Frame() {

        setTitle(title);

        setSize(size);

        setResizable(false);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        init();

    }

    public void init()
    {
        setLayout(new GridLayout(1,1,0,0));

        Screen SCR=new Screen();

        add(SCR);

        setVisible(true);
    }
    public static void main(String args[])
    {
        Frame FR= new Frame();
    }

}
