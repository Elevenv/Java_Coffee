import java.applet.*;
import java.awt.*;
/*
<applet code="applet12" height=500 width=500>
</applet>*/
public class applet12 extends Applet
{
    public void paint(Graphics g)
    {
            for(int i=0;i<100;i++)
            {
                g.drawOval(20+i,20+i,10,10);
                try
                {
                    Thread.sleep(100);

                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
    }
}