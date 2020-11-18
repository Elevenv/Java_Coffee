import java.applet.*;
import java.awt.*;
/*
<applet code="firstapp" width="200" height="200">
</applet>
*/
public class firstapp extends Applet
{
        public void paint(Graphics g)
        {
                g.drawString("This is my first applet", 50, 100);
                g.drawString("Welcome to applet", 30, 40);

        }
}