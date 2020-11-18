import java.awt.*;

class first extends Frame
{
    
    first()
    {
        Button b=new Button("Click");
        b.setBounds(100,100,80,40);
        add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String args[])
    {
        first f=new first();
    }
}