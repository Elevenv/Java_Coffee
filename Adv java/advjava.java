import javax.swing.*;
import java.awt.event.*;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

import java.awt.*;
class advjava extends JFrame implements MouseMotionListener {
    Label l1;
    advjava(){
        setSize(500,500);
        setVisible(true);
        setLayout(null);
        Button b1=new Button("Click");
        b1.setBounds(100,100,70,40);
        add(b1);
        l1=new Label("YO");
        l1.setBounds(200,200,200,40);
        add(l1);
        b1.addMouseMotionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }   
    public void mouseDragged(MouseEvent e){
        l1.setText("Mouse Dragged");
    }
    public void mouseMoved(MouseEvent e){
        l1.setText("Mouse Moved");
    }
    
    public static void main(String args[]){
        new advjava();
    }
}