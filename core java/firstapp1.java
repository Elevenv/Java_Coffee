import java.applet.*;
import java.awt.*;
/*
<applet code="firstapp1"widyh="200"height="200">
</applet>
*/
public class firstapp1 extends Applet
{
        public void paint(Graphics g)
        {
                g.drawString("This is my first applet", 50, 100);
                g.drawString("Welcome to applet", 30, 40);

        }
}