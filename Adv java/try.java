import javax.swing.*;
class try1 extends JFrame {
    try1(){
        setSize(500,500);
        setLayout(null);
        setVisible(true);
        JScrollBar s1=new JScrollBar(JScrollBar.VERTICAL,0,1,0,50);
        JScrollBar s2=new JScrollBar(JScrollBar.HORIZONTAL,0,1,0,50);
        add(s1);
        add(s2);
    }
    public static void main(String args[]){
        new try1();
    }
}