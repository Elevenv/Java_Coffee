import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="key1.class" width=500 height=500>
</applet>*/

public class key1 extends Applet implements KeyListener
{
    String msg="";
    public void init()
    {
        addKeyListener(this);
    }
    public void keyPressed(KeyEvent ke)
    {
        showStatus("Key Pressed");
        int key=ke.getKeyCode();
        switch(key)
        {
            case KeyEvent.VK_F1:msg="F1 Pressed";
            break;
            case KeyEvent.VK_F2:msg="F2 Pressed";
            break;
            case KeyEvent.VK_F3:msg="F3 Pressed";
            break;
            case KeyEvent.VK_F4:msg="F4 Pressed";
            break;
            case KeyEvent.VK_F5:msg="F5 Pressed";
            break;
            case KeyEvent.VK_F6:msg="F6 Pressed";
            break;
            case KeyEvent.VK_F7:msg="F7 Pressed";
            break;
            case KeyEvent.VK_F8:msg="F8 Pressed";
            break;
            case KeyEvent.VK_F9:msg="F9 Pressed";
            break;
            case KeyEvent.VK_F10:msg="F10 Pressed";
            break;
            case KeyEvent.VK_F11:msg="F11 Pressed";
            break;
            case KeyEvent.VK_F12:msg="F2 Pressed";
            break;
            case KeyEvent.VK_UP:msg="UP Pressed";
            break;
            case KeyEvent.VK_DOWN:msg="DOWN Pressed";
            break;
            case KeyEvent.VK_LEFT:msg="LEFT Pressed";
            break;
            case KeyEvent.VK_RIGHT:msg="RIGHT Pressed";
            break;
        }
        repaint();

    }
    public void keyReleased(KeyEvent ke)
    {
        showStatus("Key Released");
    }
    public void keyTyped(KeyEvent ke)
    {
        msg+=ke.getKeyChar();
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString(msg,100,100);
    }
}