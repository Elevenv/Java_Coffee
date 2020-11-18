import java.applet.*;
import java.awt.*;
/*
<applet code="eapp" height=300 width=300>

<param name="ename" value="asd"/>
<param name="pass" value="123456789"/>
</applet>
*/
public class eapp extends Applet
{
    TextField t1;
    Button b1;
    
    public void init()
    {
        t1=new TextField(20);
        b1=new Button("Click");
        add(t1);
        add(b1);
    }
}