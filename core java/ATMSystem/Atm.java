import java.awt.*;
import java.awt.Color;
import javax.swing.*;
import javax.swing.AbstractButton.*;
import java.awt.event.*;
import java.awt.event.MouseListener;
import java.awt.event.ItemEvent;
import java.text.*;
import java.util.*;

class Atm extends JFrame implements ActionListener,MouseListener
{ 
	JPanel enquiry,options,fastpanel,withdrawal,withdrawal1,depositpanel,transferpanel,transferpanel1,ministatement,exit;
	 static int z=1;String k="",q="";static int wd=0;static int keystate=0;
	 static int cnt1=0,cnt2=0,cnt3=0,cnt4=0,cnt5=0,cnt6=0;
	String user;
	int usr,pass,cnt=2,accno,tacc,tamt,deposi;
JLabel msg1,fast,balance,cash,deposit,mini,transfer;
JPanel pan1,pan0,pantop,panmiddle,loginpanel,mainpanel,accountpanel,adpanel;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bclear,bcancel,bok,but1,but2,
but3, but4, but5, but6,but7,but8,but9 ;
JTextField loginfield,textamt,textamt1;
JTextArea textarea;
                private JPasswordField pwordfield;
                CardLayout cardlay,cardlay1;
 Container c;
JLabel labb,label,label2,label3,label4,label4a,label5,label6,label6a,label7;
BorderLayout blo;
Color c1,c2;
	OptionButtonHandler handler=new OptionButtonHandler();
public void Atmmain()
{
	Container c = getContentPane();
					  
                  	c = getContentPane() ;
                    c.setLayout(null) ;


		        but1 = new JButton(">>>") ;
		        but1.setPreferredSize( new Dimension(100,30) ) ;
		        but1.setSize( but1.getPreferredSize() ) ;
		        but1.setLocation(50,50) ;
		        //but1.addActionListener(this) ;
		        c.add(but1) ;

                      but2 = new JButton(">>>") ;
                      but2.setPreferredSize( new Dimension(100,30) ) ;
                      but2.setSize( but2.getPreferredSize() ) ;
                      but2.setLocation(50,100) ;
                      
                      c.add(but2) ;

					but3=new JButton(">>>");
              		but3.setPreferredSize(new Dimension(100,30));
              		but3.setSize(but3.getPreferredSize());
              		
             	 	but3.setLocation(50,150);
              		c.add(but3);

                      but4 = new JButton("<<<");
                      but4.setPreferredSize(new Dimension(100,30));
                      but4.setSize(but4.getPreferredSize());
                     // but4.addActionListener(this);
                      but4.setLocation(575,50);
                      c.add(but4);

              		but5 = new JButton("<<<");
              		but5.setPreferredSize(new Dimension(100,30));
              		but5.setSize(but5.getPreferredSize());
              		but5.setLocation(575,100);
              		//but5.addActionListener(this);
              		c.add(but5);

                      but6 = new JButton("<<<");
                      but6.setPreferredSize(new Dimension(100,30));
                      but6.setSize(but6.getPreferredSize());
                      but6.setLocation(575,150);
                      //but6.addActionListener(this);
					  c.add(but6);

             	
	b1=new JButton("1");//b1.setSize(300,300);
	b2=new JButton("2");//b1.setSize(300,300);
	b3=new JButton("3");//b1.setSize(300,300);
	b4=new JButton("4");//b1.setSize(300,300);
	b5=new JButton("5");//b1.setSize(300,300);
	b6=new JButton("6");//b1.setSize(300,300);
	b7=new JButton("7");//b1.setSize(300,300);
	b8=new JButton("8");//b1.setSize(300,300);
	b9=new JButton("9");//b1.setSize(300,300);
	b0=new JButton("0");//b1.setSize(300,300);
	
	
	bclear= new JButton("CLEAR");
	bcancel= new JButton("CANCEL");
	bok= new JButton("OK");
		
	pan1 = new JPanel();
    pan1.setLayout(new GridLayout(4,2,10,10 ));
    pan1.setSize(260,150);
    
    
    pan1.add(b1);
    pan1.add(b2);
    pan1.add(b3);
    pan1.add(b4);
    pan1.add(b5);
    pan1.add(b6);
    pan1.add(b7);
    pan1.add(b8);
    pan1.add(b9);
    pan1.add(b0);
    pan1.add(bclear);
    pan1.add(bcancel);
    
    
    
    
    
    
    
    pan1.setLocation(225,300);
    pan1.setBackground(Color.ORANGE);
    
    
    
   
                c.add(pan1);
             
       cardlay = new CardLayout();
		 blo = new BorderLayout();
         panmiddle = new JPanel();
         panmiddle.setSize(402,250); 
         panmiddle.setLocation(160,30);
         panmiddle.setLayout(cardlay);
                 
         panmiddle.setBackground(Color.WHITE); 
         
          adpanel = new JPanel();
          loginpanel=new JPanel();
          mainpanel=new JPanel();
          accountpanel= new JPanel();
          
         
		
		
		 
         
         mainpanel.setBackground(Color.WHITE);
         panmiddle.add(adpanel,"ad");
         panmiddle.add(loginpanel,"login");
         panmiddle.add(mainpanel,"main");
         panmiddle.add(accountpanel,"account");
         
         adpanel.setBackground(Color.PINK);
         
          
          startanimation();
         c.add(panmiddle);
                  
               
                
                
                setTitle("Main Atm");
                setSize(730, 520);
                setBackground(Color.WHITE);
                
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(true);
     }


		public void Password()
		{
                 	 loginpanel.setSize(200,200);
    	  c1= new Color(255,100,100);
    	  c2= new Color(255,50,50);
    	 loginpanel.setBackground(c1);  
    	 loginpanel.setLayout(blo);
    	 
    	 JPanel p1=new JPanel();
    	 p1.setLayout(new GridLayout(3,2,10,10));
    	 p1.setSize(100,50);
    	 p1.setBackground(c2);
    	 
    	    String wel1="                     	W E L C O M E!   \n "+
                        "             	Please write your login and password:\n"+
                        "         	 -------------------------------------------\n";   
        
        JTextArea welcome1= new JTextArea(wel1);
        welcome1.setBackground(c1);
        welcome1.setEditable(false);
        
        loginpanel.add(welcome1,blo.NORTH);
        
         
         // inside panel p1 (grid)
         
         JLabel login= new JLabel("CUSTOMER ID");
               		     JLabel pass=  new JLabel("PIN CODE");
               		     loginfield = new JTextField (4);
               		     
               		     p1.add(login);
               		     p1.add(loginfield);
               		     p1.add(pass);
               		     
               		     pwordfield=new JPasswordField(4);
                         p1.add(pwordfield);

                         but8=new JButton("OK");
                         but8.setPreferredSize(new Dimension(90,25));
                         but8.setSize(but8.getPreferredSize());
                         
                         p1.add(but8);

                         but9=new JButton("CANCEL");
                         but9.setPreferredSize(new Dimension(90,25));
                         but9.setSize(but9.getPreferredSize());
                         
                         p1.add(but9);
                         //-----Informations about the program-----
                         String sttr="	----------------------------------------------\n"+
                         	     "            	This product is a\n"+
                         	     "       	guarenteed trade mark of\n"+
                                     " 	'SYMBIOSIS COMPUTER SYSTEMS INC.\n"+
                                     
                                     "	----------------------------------------------\n"+
                                     "       	Producer:  Parthav & Priyanka";

                         //-----set up textarea----------------
                         textarea = new JTextArea(sttr);
                        loginpanel.add(textarea,blo.SOUTH);
                        textarea.setBackground(c1);
                        textarea.setEditable(false);
                        
         loginpanel.add(p1,blo.EAST);           
						
               		    loginfield.requestFocus();
                        
                        but8.addActionListener(this);
                        but9.addActionListener(this);
                        
                        }

        
       
       
        public void startanimation()
        {
        	LogoAnimatorJPanel animation = new LogoAnimatorJPanel();
               adpanel.add( animation ); // add panel to frame
 
 			   //  panmiddle.pack();  // make window just large enough for its GUI
	      	adpanel.setVisible( true );   // display window

     		animation.startAnimation();  // begin animation  
     		animation.addMouseListener(this);
     		
     		
        }
        
        
        public void getchoice()
        {
        	JPanel choice= new JPanel();
        	choice.setLayout(blo);
        	String wel2="                     W E L C O M E   "+user+" \n "+
                        "             	Please select your account \n"+
                        "         	 -------------------------------------------\n";   
        
        JTextArea welcome2= new JTextArea(wel2);
        welcome2.setBackground(c1);
        welcome2.setEditable(false);
        
        choice.add(welcome2,blo.NORTH);
        
        JPanel p2= new JPanel();
        p2.setLayout(new GridLayout(2,1,30,40));
        
        JLabel saving = new JLabel("SAVING");
        JLabel current=new JLabel("CURRENT");
        
        p2.add(saving);
        p2.add(current);
        
        choice.add(p2,blo.EAST);
        
        mainpanel.add(choice);
        
        but5.addActionListener(this) ;
        but6.addActionListener(this);
			         	
        }
        
        
	public void  getaccountscreen()
        {
        	
        	
        	cardlay1=new CardLayout();
        	accountpanel.setBackground(c1);
        	accountpanel.setLayout(cardlay1);
        	
        	 options=new JPanel();
          	 enquiry=new JPanel();
        	 fastpanel =  new JPanel();
        	 withdrawal=new JPanel();
        	 withdrawal1=new JPanel();
        	 ministatement=new JPanel();
        	 depositpanel=new JPanel();
        	 transferpanel=new JPanel();
        	 transferpanel1=new JPanel();
        	 exit=new JPanel();
        	 
        	
        	     	
     	       	        	
        	String acc= "  \n \n"+
        				"FAST CASH			BALANCE ENQUIRY \n"+
        				"                                 \n  \n"+     				
        				"CASH WITHDRAWAL		DEPOSIT \n " +
        				"						\n	\n "+
        				"MINI STATEMENT		TRANSFER ";
        				
        
        	
        	JTextArea account = new JTextArea(acc);
        	account.setBackground(c1);
       	    account.setEditable(false);
       	    
       	    options.add(account);      	    
       	  
       	    
       	    String dispbal="\n\n\n  Dear "+user+"\n Select your choice "+ "\n   on your Account NO "+accno;
       	    
       	    
       	    JTextArea bal= new JTextArea(dispbal);
       	    bal.setBackground(c1);
       	    bal.setEditable(false);
       	    options.add(bal);
       	   
       	    
       	    accountpanel.add(options,"options");
        	
        	accountpanel.add(enquiry,"enquiry");
        	accountpanel.add(fastpanel,"fast");
        	accountpanel.add(withdrawal,"withdrawal");
        	accountpanel.add(withdrawal1,"withdrawal1");	
        	accountpanel.add(ministatement,"ministatement");
        	accountpanel.add(depositpanel,"deposit");
        	accountpanel.add(transferpanel,"transfer");
        	accountpanel.add(transferpanel1,"transfer1");
        	accountpanel.add(exit,"exit");
        	
        	options.setBackground(c1);
       	    
       	    cardlay1.show(accountpanel,"options");
       	  
       	    System.out.println("start ");
        	System.out.println(cnt6);  
        	
                	   	      	
        	        	
        	but1.addActionListener(handler) ;
        	but2.addActionListener(handler) ;
        	but3.addActionListener(handler) ;
        	but4.addActionListener(handler);
        	but5.addActionListener(handler) ;
            but6.addActionListener(handler);	
        	
          }
          
         
         
         
         private class OptionButtonHandler implements ActionListener
         {
         
         			public void actionPerformed(ActionEvent event)
        			{ boolean a=false;
        				
        				if(event.getSource()==but1 && cnt1==0 && a==false)
        				{	cnt1=1; a=true;
        					cnt4=-1;cnt2=-1;cnt3=-1;cnt5=-1;cnt6=-1;a=true;
        					cardlay1.show(accountpanel,"fast");
        					getfastpanel();
        					
        			    }
        			    else if(event.getSource()==but1 && cnt1==1 && a==false)
        			    {	cnt1=2; a=true;
        			    	wd=100;	
         					Withdrawal w=new Withdrawal(accno,wd);
         					cardlay1.show(accountpanel,"enquiry");         				      			
         					showprintoptions();
         						
        			    }	
        				else if(event.getSource()==but2 && cnt==1 && a==false)
        			    {	cnt1=2; a=true;
        			    	wd=1000;	
         					Withdrawal w=new Withdrawal(accno,wd);
         					cardlay1.show(accountpanel,"enquiry");         				      			
         					showprintoptions();
         						
        			    }		
       	   				else if(event.getSource()==but3 && cnt1==1 && a==false)
        			    {	cnt1=2; a=true;
        			    	wd=10000;	
         					Withdrawal w=new Withdrawal(accno,wd);
         					cardlay1.show(accountpanel,"enquiry");         				      			
         					showprintoptions();
         						
        			    }						 
       	   				else if(event.getSource()==but4 && cnt1==1 && a==false)
        			    {	cnt1=2; a=true;
        			    	wd=500;	
         					Withdrawal w=new Withdrawal(accno,wd);
         					cardlay1.show(accountpanel,"enquiry");         				      			
         					showprintoptions();
         						
        			    }							 
       	   				else if(event.getSource()==but5 && cnt1==1 && a==false)
        			    {	cnt1=2; a=true;
        			    	wd=5000;	
         					Withdrawal w=new Withdrawal(accno,wd);
         					cardlay1.show(accountpanel,"enquiry");         				      			
         					showprintoptions();
         						
        			    }						
        				else if(event.getSource()==but6 && cnt1==1 && a==false)
        			    {	cnt1=2; a=true;
        			    	wd=15000;	
         					Withdrawal w=new Withdrawal(accno,wd);
         					cardlay1.show(accountpanel,"enquiry");         				      			
         					showprintoptions();
         						
        			    }			
					 	
					 	
					 	else if(event.getSource()==but4  && cnt1==2 && a==false )
					        	{
					        		cnt1=3;a=true;
					        					printslip();
					        					cardlay1.show(accountpanel,"exit");
					             				exitpanel();
					        	}
					     else if(event.getSource()==but5  && cnt1==2 && a==false )
					        	{
					        		cnt1=3;a=true;
					        		//do not print slip and   go to exit panel 
					             		cardlay1.show(accountpanel,"exit");
					             		exitpanel();
					        	}
					        	
					     else if(event.getSource()==but5  && cnt1==3 && a==false ) //next 2 options for exit screen
					        	{   
					        		a=true;cnt1=0;cnt2=0;cnt3=0;cnt4=0;cnt5=0;cnt6=0;
					        		cardlay1.show(accountpanel,"options");
					        			
					        	}
					     else if (event.getSource()==but4 && cnt1==3 && a==false)
					        	{	a=true;
					        		System.exit(0);
					        	}       				    
					        	      
					      
					      	
					        	
        				// Cash withdrawal     					
        					
        				
        				else if(event.getSource()==but2 && cnt2==0 && a==false)
        				{	
        					cnt2=1; a=true;
        					cnt4=-1;cnt1=-1;cnt3=-1;cnt5=-1;cnt6=-1;
        					
        					withdrawal.setBackground(c1);
        					withdrawal.setLayout(blo);
        					cardlay1.show(accountpanel,"withdrawal");
        					
        					showWithrawalOptions();
        				}
        				else if(event.getSource()==but5 && cnt2==1 && a==false)
        				{		
        						cnt2=2; a=true;k="";
		        				wd=Integer.parseInt(textamt.getText());
		         				Withdrawal w=new Withdrawal(accno,wd);
		         				
		         				cardlay1.show(accountpanel,"enquiry");
		         				System.out.println(w.current_abal);
		         				
		         				showprintoptions();
        				}
        				else if(event.getSource()==but4 && cnt2==2 && a==false)
        				{
					        	cnt2=3;a=true;
					        					printslip(); wd=0;
					        					cardlay1.show(accountpanel,"exit");
					             				exitpanel();
					        	}
					     else if(event.getSource()==but5  && cnt2==2 && a==false )
					        	{
					        		cnt2=3;a=true; wd=0;
					        		//do not print slip and   go to exit panel 
					             		cardlay1.show(accountpanel,"exit");
					             		exitpanel();
					        	}
					        	
					     else if(event.getSource()==but5  && cnt2==3 && a==false ) //next 2 options for exit screen
					        	{   
					        		a=true;
					        		cardlay1.show(accountpanel,"options");
					        		cnt1=0;cnt2=0;cnt3=0;cnt4=0;cnt5=0;cnt6=0;	
					        	}
					     else if (event.getSource()==but4 && cnt2==3 && a==false)
					        	{	a=true;
					        		System.exit(0);
					        	}       				    	
        							
        				// mini statement
        				
        				else if(event.getSource()==but3 && cnt3==0 && a==false)
        				{	
        					cnt3=1; a=true;
        					cnt1=-1;cnt2=-1;cnt4=-1;cnt5=-1;cnt6=-1;a=true;
        					//ministatement.setBackground(c1);
        					//cardlay1.show(accountpanel,"ministatement");
        					
        					printmini();
        						
					        		//do not print slip and   go to exit panel 
					             		cardlay1.show(accountpanel,"exit");
					             		exitpanel();
        					
        					
        				}
        				else if(event.getSource()==but5  && cnt3==1 && a==false ) //next 2 options for exit screen
					        	{   
					        		a=true;cnt1=0;cnt2=0;cnt3=0;cnt4=0;cnt5=0;cnt6=0;	
					        		cardlay1.show(accountpanel,"options");
					        		cnt1=0;cnt2=0;cnt3=0;cnt4=0;cnt5=0;cnt6=0;	
					        	}
					     else if (event.getSource()==but4 && cnt3==1 && a==false)
					        	{	a=true;
					        		System.exit(0);
					        	}       				    
        				
        				
        				// Balance Enquiry
        				
        				else if(event.getSource()==but4 && cnt4==0 && a==false )
        				{   
        				    cnt4=1;cnt1=-1;cnt2=-1;cnt3=-1;cnt5=-1;cnt6=-1;a=true;
        				   	
					        					BalanceEnquiry be=new BalanceEnquiry(accno);
					        					enquiry.setBackground(c1);
					        					cardlay1.show(accountpanel,"enquiry");
					        					        					
					        					System.out.println(be.abal);
					        					        					
					        				    showprintoptions();
					        		
					     }
					        	
					     else if(event.getSource()==but4  && cnt4==1 && a==false )
					        	{
					        		cnt4=2;a=true;
					        					printslip();
					        					cardlay1.show(accountpanel,"exit");
					             				exitpanel();
					        	}
					     else if(event.getSource()==but5  && cnt4==1 && a==false )
					        	{
					        		cnt4=2;a=true;
					        		//do not print slip and   go to exit panel 
					             		cardlay1.show(accountpanel,"exit");
					             		exitpanel();
					        	}
					        	
					     else if(event.getSource()==but5  && cnt4==2 && a==false ) //next 2 options for exit screen
					        	{   
					        		a=true;
					        		cardlay1.show(accountpanel,"options");
					        		cnt1=0;cnt2=0;cnt3=0;cnt4=0;cnt5=0;cnt6=0;	
					        	}
					     else if (event.getSource()==but4 && cnt4==2 && a==false)
					        	{	a=true;
					        		System.exit(0);
					        	}       				    
					        				    
        				
        				//Deposit
        				else if(event.getSource()==but5 && cnt5==0  && a==false)
        				{	
        					cnt5=1; a=true;
        					cnt1=-1;cnt2=-1;cnt3=-1;cnt4=-1;cnt6=-1;a=true;
        					
        					withdrawal.setBackground(c1);
        					withdrawal.setLayout(blo);
        					cardlay1.show(accountpanel,"withdrawal");
        					
        					showWithrawalOptions();
        				}
        				else if(event.getSource()==but5 && cnt5==1 && a==false)
        				{		
        						cnt5=2; a=true;
		        				deposi=Integer.parseInt(textamt.getText());
		         				Deposit d=new Deposit(accno,deposi);
		         				k="";
		         				cardlay1.show(accountpanel,"enquiry");
		         			//	System.out.println(w.current_abal);
		         				
		         				showprintoptions();
        				}
        				else if(event.getSource()==but4 && cnt5==2 && a==false)
        				{
					        	cnt5=3;a=true;
					        					printslipdeposit();
					        					cardlay1.show(accountpanel,"exit");
					             				exitpanel();
					        	}
					     else if(event.getSource()==but5  && cnt5==2 && a==false )
					        	{
					        		cnt5=3;a=true;
					        		//do not print slip and   go to exit panel 
					             		cardlay1.show(accountpanel,"exit");
					             		exitpanel();
					        	}
					        	
					     else if(event.getSource()==but5  && cnt5==3 && a==false ) //next 2 options for exit screen
					        	{   
					        		a=true;cnt1=0;cnt2=0;cnt3=0;cnt4=0;cnt5=0;cnt6=0;
					        		cardlay1.show(accountpanel,"options");
					        		cnt1=0;cnt2=0;cnt3=0;cnt4=0;cnt5=0;cnt6=0;
					        			
					        	}
					     else if (event.getSource()==but4 && cnt5==3 && a==false)
					        	{	a=true;
					        	printslipdeposit();
					        		System.exit(0);
					        	}  
        					
        					
        				
        				    					      					
        					
        					
        						       					
        			// Transfer	       					
          				
        				
        				else if(event.getSource()==but6 && cnt6==0 && a==false)
        				{
        					cnt6=1; a=true;
        					cnt1=-1;cnt2=-1;cnt3=-1;cnt4=-1;cnt5=-1;a=true;
        					transferpanel.setBackground(c1);
        					transferpanel.setLayout(blo);
        					
        					cardlay1.show(accountpanel,"transfer");
        					gettransfer();
        					System.out.println("transfer");    				      				
        				        					      					
        					
        				}
        				else if(event.getSource()==but5 && cnt6==1 && a==false)
        				{
        					cnt6=2; a=true;keystate=2;
        						
		        				tacc=Integer.parseInt(textamt.getText());
		        				textamt1.requestFocus();
		        				k="";
		        				
		         				
		         				System.out.println(tacc);
		         				
		         				
		         				
		         				
        				}
        				else if(event.getSource()==but5 && keystate==2 && cnt6==2 && a==false)
        				{
        					cnt6=3; a=true;keystate=-1;
		        				        				
		        				
		        				tamt=Integer.parseInt(textamt1.getText());
		        				
		        				System.out.println(" cnt is three obj created ");
        					    Withdrawal w=new Withdrawal(accno,tamt);
        					    Deposit d=new Deposit(tacc,tamt);
        					    cardlay1.show(accountpanel,"enquiry");
		         				
		         				
		         				showprintoptions();
        					    
        					    
        				}
        				
        			/*	else if(event.getSource()==but4 && cnt6==3 && a==false)
        				{
					        	cnt6=4;a=true;
					        					printslip();
					        					cardlay1.show(accountpanel,"exit");
					             				exitpanel();
					        	}
					     /*else if(event.getSource()==but5  && cnt6==3 && a==false )
					        	{
					        		cnt6=4;a=true;
					        		//do not print slip and   go to exit panel 
					             		cardlay1.show(accountpanel,"exit");
					             		exitpanel();
					        	}
					        	
					     else if(event.getSource()==but5  && cnt6==4 && a==false ) //next 2 options for exit screen
					        	{   
					        		a=true;cnt1=0;cnt2=0;cnt3=0;cnt4=0;cnt5=0;cnt6=0;
					        		cardlay1.show(accountpanel,"options");
					        		cnt1=0;cnt2=0;cnt3=0;cnt4=0;cnt5=0;cnt6=0;
					        			
					        	}
					     else if (event.getSource()==but4 && cnt6==4 && a==false)
					        	{	a=true;
					        		System.exit(0);
					        	}  
        				*/		
        				
        			}
        		
         }
         
         public void gettransfer()
         {
         	JLabel ook= new JLabel("		OK	");
         	
         	
         	JLabel withamt1=new JLabel(" 	Enter the account no   ");
         	JLabel withamt2=new JLabel(" 	Enter the amount     ");
         	
         	
         	 textamt=new JTextField(4);textamt1=new JTextField(4);
         	
         	JPanel pp=new JPanel();
         	pp.setLayout(new FlowLayout(50));
         	pp.setBackground(c2);
         	
         	
         	pp.add(withamt1);
            pp.add(textamt);
         	
         	pp.add(withamt2);
         	pp.add(textamt1);
         	pp.add(ook);
         
         
         	transferpanel.add(pp,blo.EAST);
         	
         	
         	textamt.requestFocus();
         	keystate=1;
         	
         	
         	initkeypad();
         	
         }
         
        
         
         public void printmini()
         {
         	Query mini=new Query();
         	String sta[]=new String [10];
         	
         		
   							    
         	sta=mini.ministatement(accno);
         	
                 			 
             JOptionPane.showMessageDialog(null,sta);     			 
                 			 
                 			 
         	
         	
         	
         }
         
         public void getfastpanel()
         {
         	fastpanel.setBackground(c1);
        					
        					
        							String acc= "  \n \n"+
        							"INR 100		    	INR 500 \n"+
        							"                                 \n  \n"+     				
        							"INR 1000		    	INR 5000 \n " +
        							"						\n	\n "+
        							"INR 10000	     		INR 15000 ";
        				
        
        	
        							JTextArea account = new JTextArea(acc);
        							account.setBackground(c1);
       	    						account.setEditable(false);
       	    
       	   							 fastpanel.add(account);      	    
       	  
       	    
       	  						  String dispbal="\n\n\n  Dear "+user+"\n Select your option ";
       	    
       	    
       	    							JTextArea bal= new JTextArea(dispbal);
       	   								 bal.setBackground(c1);
       	    							bal.setEditable(false);
       	   								 fastpanel.add(bal);
         }
         
         public void showWithrawalOptions()
         {
         	
         	
         	
         	
         	JLabel ook= new JLabel("		OK	");
         	JLabel withamt=new JLabel(" 	Enter the amount     ");
         	 textamt=new JTextField(4);
         	
         	JPanel pp=new JPanel();
         	pp.setLayout(new FlowLayout(50));
         	pp.setBackground(c2);
         	
         	
         	pp.add(withamt);
         	pp.add(textamt);
         	pp.add(ook);
         
         	withdrawal.add(pp,blo.EAST);
         	textamt.requestFocus();
         	
         	
         	
         	initkeypad();
         
         	
         }
         
         


		public void initkeypad()
		{   KeyActionHandler key=new KeyActionHandler();
			
		
			b1.addActionListener(key); b2.addActionListener(key);
			b3.addActionListener(key); b4.addActionListener(key);
			b5.addActionListener(key); b6.addActionListener(key);
			b7.addActionListener(key); b8.addActionListener(key);
			b9.addActionListener(key); b0.addActionListener(key);
			bclear.addActionListener(key);
			bcancel.addActionListener(key);
			
			       				
		}
		
		private class KeyActionHandler implements ActionListener
         {
         			
         			public void actionPerformed(ActionEvent event)
        			{ 
        				
        				if(((JButton) event.getSource()).getText()=="CLEAR" )
        				{
        					textamt.setText("");
        					k="";
        				}
        				else if(((JButton) event.getSource()).getText()=="CANCEL")
        				{
        					cnt1=0;cnt2=0;cnt3=0;cnt4=0;cnt5=0;cnt6=0;k="";q="";
					        		cardlay1.show(accountpanel,"options");
					        		
        						
        				}
        				else
        				{
        				        				
        				String btntext = ((JButton) event.getSource()).getText();
        			
        				if(textamt.isFocusable() )
        				{	k=k+btntext;
        					textamt.setText(k);
        					textamt.setFocusable(true);
        				}
        				if(textamt1.isFocusable() )
        				{	q=q+btntext;
        					textamt1.setText(q);
        					textamt1.setFocusable(true);
        					System.out.println(" else ");
        				}
        			 		
        			 	
        				}
        			}
        			
        			
         }	
        				
        				
        				
        				
        				
        				
		         
         public void showprintoptions()
         {
         	 BalanceEnquiry be=new BalanceEnquiry(accno);
         	 BorderLayout blo1=new BorderLayout();
							enquiry.setLayout(blo1);
		
						String show= "\n\n\n\n\n  	    ACCOUNT BALANCE  "+
					 	"\n	    Available balance :"+be.abal+
					 	"\n	    Ledger    balance :"+be.lbal+
						 "\n\n 	      Print statement";
						JTextArea bal1= new JTextArea(show);
       	    			bal1.setBackground(c1);
       	   				 bal1.setEditable(false);
       	   					 enquiry.add(bal1,blo1.CENTER);
       	    
       	   					 JPanel print= new JPanel();
       	   					 print.setLayout(new GridLayout(4,1,10,14));
       	   					 print.setBackground(c1);
       	   					 JLabel yes = new JLabel("\nYES      ");
       	    				 JLabel no = new JLabel("NO        ");
       	   					 print.add(yes);
       	   					 print.add(no);
       	    
       	   					 enquiry.add(print,blo1.EAST);
       	    		        
       	    		
       	    				
       	    		
       	  }
         
         public void exitpanel()
         {
         	//BalanceEnquiry be=new BalanceEnquiry(accno);
         	 BorderLayout blo1=new BorderLayout();
							exit.setLayout(blo1);
		
						String show11= "\n\n\n\n\n 	Dear User  "+
					 	"\n	    Thank You!!  "+
					 	"\n	    Symbiosis Computers Inc Ltd:"+
						 "\n\n 	      @ copywrites Parthav,Priyanka";
						JTextArea bal11= new JTextArea(show11);
       	    			bal11.setBackground(c1);
       	   				 bal11.setEditable(false);
       	   					 exit.add(bal11,blo1.CENTER);
       	    
       	   					 JPanel print= new JPanel();
       	   					 print.setLayout(new GridLayout(4,1,10,14));
       	   					 print.setBackground(c1);
       	   					 JLabel yes = new JLabel("\nEXIT      ");
       	    				 JLabel no = new JLabel("   ");
       	   					 print.add(yes);
       	   					 print.add(no);
       	    
       	   					 exit.add(print,blo1.EAST);
       	    		        
       	    		
         	
         }
         
         public void printslip()
         {
         	BalanceEnquiry be=new BalanceEnquiry(accno);
        				  		//be.printbal(usr,be.accno,be.abal,be.lbal);
        				  		 
        				  		 Date today = new Date();
    							SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss aaa ");
   							    String date = formatter.format(today);
        				  		 
        				  		 
        				  		 String slip1="		  A/C NO : "+be.accno+        				     
                 			 "\n    Card no: "+usr +
                 			 "\n\n     "+date+
                 			 "\n\n  Withdrawal :"+wd+
                 			 "\n\n  Available Balance: "+be.abal+
                 			 "\n   Ledger Balance   : "+be.lbal+
                 			 "\n\n  Thank you \n"+
                 			 "-------------------------------\n";
                 			 
        				  		 
        				  		 JOptionPane.showMessageDialog(null,slip1);
        				  		
        				  		 
        				  		 
        				  		
         }
         public void printslipdeposit()
         {
         	BalanceEnquiry be=new BalanceEnquiry(accno);
        				  		//be.printbal(usr,be.accno,be.abal,be.lbal);
        				  		 
        				  		 Date today = new Date();
    							SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss aaa ");
   							    String date = formatter.format(today);
        				  		 
        				  		 
        				  		 String slip1="		  A/C NO : "+be.accno+        				     
                 			 "\n    Card no: "+usr +
                 			 "\n\n     "+date+
                 			 "\n\n  Deposit :"+deposi+
                 			 "\n\n  Available Balance: "+be.abal+
                 			 "\n   Ledger Balance   : "+be.lbal+
                 			 "\n\n  Thank you \n"+
                 			 "-------------------------------\n";
                 			 
        				  		 
        				  		 JOptionPane.showMessageDialog(null,slip1);
        				  		
         }
         
        public void mouseClicked(MouseEvent me)
        {   cardlay.show(panmiddle,"login");
        	Password();
        }
        public void mouseExited(MouseEvent me)
        {
        }
        public void mousePressed(MouseEvent me)
        {
        }
        
        public void mouseEntered(MouseEvent me)
        {
        }
        public void mouseReleased(MouseEvent me)
        {
        }
        
        public void actionPerformed(ActionEvent ae)
      {
      	if(ae.getSource()== but8)
      	{
      		Query q= new Query();
      		
        	 usr= Integer.parseInt(loginfield.getText());
      		 pass=Integer.parseInt(pwordfield.getText());
      		user=q.val_password(usr,pass);
      		
      		
      		if(user==null)
      		{
      			cnt--;
      			if(cnt>=0)
           		{    int opi=cnt+1;
           		     JOptionPane.showMessageDialog(null,"LOGIN ERROR!!\n You hav "+opi+" chances left");
           		     cardlay.show(panmiddle,"login");
           		}	
           		else
           		System.exit(0);
      		}
      		else 
      		{   System.out.println(user);
      			cardlay.show(panmiddle,"main");
      			getchoice();
      	    
      		}
      		
         }
      	if(ae.getSource()==but9)
      	{
      		cardlay.show(panmiddle,"ad");
      		getchoice();
      	}
        if(ae.getSource()==but5)
        {
        	cardlay.show(panmiddle,"account");
        	
        	Query q=new Query();
             accno=q.getacc(usr,"s");
        
        	getaccountscreen();
        }
        if(ae.getSource()==but6)
        {
        	cardlay.show(panmiddle,"account");
           Query q=new Query();
        	accno=q.getacc(usr,"c");
        	
        	getaccountscreen();
        	
        }
      }  
       
       
      public static void main(String[] args)
        {
               
               Atm a= new Atm();
               a.Atmmain();
               
               
               
               
        }
         
       
       
        
      
      
    
    }//end class Atm