import java.awt.*;

//import javafx.scene.control.cell.TextFieldListCell;
class first1 extends Frame
{
    
    first1()
    {
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    
       
        Label l=new Label("label1");
        l.setBounds(50,100,40,20);
        add(l);
        Button b=new Button("Click");
        b.setBounds(100,100,40,20);
        add(b);
        TextField t=new TextField();
        t.setBounds(75,150,40,20);
        add(t);
    }
    public static void main(String args[])
    {
       new first1();
    }
}