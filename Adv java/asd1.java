import awt.java.*;
class asd1 extends Frame
{
    asd1
    {
        setLayout(null);
        setVisible(true);
        setSize(5500,500);
        Label l1=new Label("Name");
        l1.setBounds(100,100,50,20);
        add(l1);
        Button b1=new Button("Click Here");
        b1.setBounds(130,130,40,20);
        add(b1);
        TextField t1=new TextField();
        t1.setBounds(160,100,50,30);
        add(t1);
        CheckboxGroup ck1=new Che Chekboxgroup();
        Checkbox c1=new Checkbox("First",ck1,false);
        c1.setBounds(100,200,50,20);
        add(c1);
        Checkbox c2=new Checkbox("Second",ck1,false);
        c2.setBounds(100,250,50,20);
        add(c2);
        Checkbox c3=new Checkbox("Second",ck1,false);
        c2.setBounds(100,300,50,20);
        add(c3);
    }
        

        public static void main(string args[])
    {
        new asd1();
    }
}