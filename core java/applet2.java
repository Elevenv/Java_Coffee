import java.applet.*;
import java.awt.*;
/*
<applet code="applet2" width='200' height="200">
</applet>
*/
public class applet2 extends Applet
{
        public void init()
        {
                setBackground(Color.red);
                setForeground(Color.white);

        }
        public void paint(Graphics g)
        {
                g.drawString("Welcome to my applet", 100,70);
        }
} 