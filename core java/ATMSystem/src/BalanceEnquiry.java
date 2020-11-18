
import java.util.*;
import javax.swing.*;
import java.awt.*;
class BalanceEnquiry extends JFrame
{
	public int accno,abal,lbal;
	
	Container c1;	
	BalanceEnquiry(int acc)
	{
		this.accno=acc;
		Query q=new Query();
		this.abal=q.getacc(acc,"abal");
		this.lbal=q.getacc(acc,"lbal");
			
	}
	
	public void printbal(int cno,int accno,int abal,int lbal)
	{
					 c1= new Container();
					 c1 = getContentPane();
					                   
                    c1.setLayout(null) ;
                 //Date today = new Date();
     			//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy hh:mm:ss z ");
   			    //String date = formatter.format(today);   
                 //System.out.println(date);
                 
                 
                 String slip1="		A/C NO : "+accno+
                 			 "\n    Card no: "+cno +
                 			 //"\n    "+date+
                 			 "\n\n Available Balance: "+abal+
                 			 "\n   Ledger Balance   : "+lbal;
                 			 
                 JTextArea slip= new JTextArea(slip1);
                 slip.setEditable(false);
                 //slip.setLocation(30,30);
                 
                 JLabel l=new JLabel("hi");
                 
                 			      
                 
                 JPanel p=new JPanel();
                 p.setLocation(30,30);
                 p.add(slip);
                 p.add(l);
                 p.setVisible(true);
                 p.enable();
                 c1.add(p);
                    
                  System.out.println("yes");  
                    
				
				setTitle("Transaction slip");
                setSize(300, 400);
                
                //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(true);
	}
}