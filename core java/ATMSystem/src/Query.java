import java.sql.*;
import java.text.*;
import java.util.*;

public class Query 
{	int ac;
	String user=null;
	ResultSet rs,rs1; 
	static String dbsource="jdbc:odbc:atmdb";
    Connection connection=null;
	Statement statement=null;
	static String driver= "sun.jdbc.odbc.JdbcOdbcDriver";
	public void mydata()
	{
	
	try
	{
		
    Class.forName(driver);
    connection = DriverManager.getConnection(dbsource, "", "");
    
    statement=connection.createStatement();
    
    rs=statement.executeQuery("select cno,name from customers");
    
    ResultSetMetaData metadata=rs.getMetaData();
    int cols= metadata.getColumnCount();
    
    for ( int i = 1; i <= cols; i++ )
            System.out.printf( "%-8s\t", metadata.getColumnName( i ) );
         System.out.println();
         
         while ( rs.next() ) 
         {
            for ( int i = 1; i <= cols; i++ )
               System.out.printf( "%-8s\t", rs.getObject( i ) );
            System.out.println();
         } // end while
      }  // end try
      catch ( SQLException sqlException ) 
      {
         sqlException.printStackTrace();
         System.exit( 1 );
      } // end catch
      catch ( ClassNotFoundException classNotFound ) 
      {
         classNotFound.printStackTrace();            
         System.exit( 1 );
      } // end catch
      finally // ensure statement and connection are closed properly
      {                                                             
         try                                                        
         {                                                          
            statement.close();                                      
            connection.close();                                     
         } // end try                                               
         catch ( Exception exception )                        
         {                                                          
            exception.printStackTrace();                                     
            System.exit( 1 );                                       
         } // end catch                                             
      } // end finally                  
   } // end mydata
   
   
   public String val_password(int usr,int pass)
   {
   	
   	try
   	{
   	   	Class.forName(driver);
    	connection = DriverManager.getConnection(dbsource, "", "");
    
    	statement=connection.createStatement();
    
    	rs1=statement.executeQuery("select name from customers where cno="+usr+" AND pin="+pass);
    	
    	ResultSetMetaData metadata=rs1.getMetaData();
    	int cols= metadata.getColumnCount();
    
    		         
         while ( rs1.next() ) 
         {
            for ( int i = 1; i <= cols; i++ )
               user= rs1.getString( i ) ;
           
         } // end while
         rs1.close();
    
    	       	               
                
       }//end try
       catch(Exception e)
       {
       	System.out.println(e);
       }
       finally // ensure statement and connection are closed properly
      {                                                             
         try                                                        
         {                                                          
            statement.close();                                      
            connection.close();                                     
         } // end try                                               
         catch ( Exception exception )                        
         {                                                          
            exception.printStackTrace();                                     
            System.exit( 1 );                                       
         } // end catch                                             
      } // end finally        
       	
    	
    	
    	
    		return user;
    	
           
   } 
   
   
   
   public int getacc(int usr,String choice)
   {
   	try
   	{
   	   	Class.forName(driver);
    	connection = DriverManager.getConnection(dbsource, "", "");
    
    	statement=connection.createStatement();
    if(choice=="s")
    	rs1=statement.executeQuery("select accno from account where cno="+usr+ "AND accno>1000 and accno<2000");
    else if(choice=="c")	
    	rs1=statement.executeQuery("select accno from account where cno="+usr+ "AND accno>2000 and accno<3000");
    else if(choice=="abal")
    	rs1=statement.executeQuery("select availablebal from account where accno="+usr);
    else if(choice=="lbal")
    	rs1=statement.executeQuery("select ledgerbal from account where accno="+usr);
    	
    		
    	ResultSetMetaData metadata=rs1.getMetaData();
    	int cols= metadata.getColumnCount();
    
    		         
         while ( rs1.next() ) 
         {
            for ( int i = 1; i <= cols; i++ )
              user= rs1.getString( i ) ;
             
             ac=Integer.parseInt(user);
         } // end while
         rs1.close();
    
    	       	               
                
       }//end try
       catch(Exception e)
       {
       	System.out.println(e);
       }
       finally // ensure statement and connection are closed properly
      {                                                             
         try                                                        
         {                                                          
            statement.close();                                      
            connection.close();                                     
         } // end try                                               
         catch ( Exception exception )                        
         {                                                          
            exception.printStackTrace();                                     
            System.exit( 1 );                                       
         } // end catch                                             
      } // end finally        
       
    		return ac;
    	
        
   } 
   
   
    public void  update_withdrawal(int abal,int lbal,int accno,int amount)
   {
   	try
   	{							java.util.Date today = new java.util.Date();
    							SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss aaa ");
   							    String date = formatter.format(today);
   							    
   	   	Class.forName(driver);
    	connection = DriverManager.getConnection(dbsource, "", "");
    
    	statement=connection.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE);
    
    	statement.executeQuery("update account set availablebal="+abal+",ledgerbal="+lbal+" where accno="+accno);
    	//statement.executeQuery("insert into transactions  values (' ',' ',"+amount+",'  ',"+date+","+accno+")");
    
       	    
         //rs1.close();
              	               
                
       }//end try
       catch(Exception e)
       {
       	System.out.println(e);
       }
       finally // ensure statement and connection are closed properly
      {                                                             
         try                                                        
         {                                                          
            statement.close();                                      
            connection.close();                                     
         } // end try                                               
         catch ( Exception exception )                        
         {                                                          
            exception.printStackTrace();                                     
            System.exit( 1 );                                       
         } // end catch                                             
      } // end finally        
       
    	
    	
        
   } 
   
   public void  update_deposit(int lbal,int accno,int amount)
   {
   	try
   	{	
   	
   								java.util.Date today = new java.util.Date();
    							SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss aaa ");
   							    String date = formatter.format(today);
   							    
   	   	Class.forName(driver);
    	connection = DriverManager.getConnection(dbsource, "", "");
    
    	statement=connection.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE);
    
    	statement.executeQuery("update account set ledgerbal="+lbal+" where accno="+accno);
    	//statement.executeQuery("insert into transactions  values ( , , ,"+amount+","+date+","+accno+");");
    	
       	    
                     	               
                
       }//end try
       catch(Exception e)
       {
       	System.out.println(e);
       }
       finally // ensure statement and connection are closed properly
      {                                                             
         try                                                        
         {                                                          
            statement.close();                                      
            connection.close();                                     
         } // end try                                               
         catch ( Exception exception )                        
         {                                                          
            exception.printStackTrace();                                     
            System.exit( 1 );                                       
         } // end catch                                             
      } // end finally        
       
    	
    	
        
   } 
   
   public String[] ministatement(int accno)
	{
	String res[]=new String[20];
	try
	{
		
    Class.forName(driver);
    connection = DriverManager.getConnection(dbsource, "", "");
    
    statement=connection.createStatement();
    
    rs=statement.executeQuery("select * from transactions where accno="+accno);
    
    ResultSetMetaData metadata=rs.getMetaData();
    int cols= metadata.getColumnCount();
    
    for ( int i = 1; i <= cols; i++ )
           res[0]= metadata.getColumnName( 1 )+"     	DEBIT  .     			"+ "           "+"	 CREDIT  .  		"+"       "+"	DATE ";
         
         
         int i=1;
         while ( rs.next() ) 
         {
            
               res[i]= rs.getInt( 1 )+"     	INR. " +rs.getInt(3)+"  "+ "        "+"						     INR. " +rs.getInt(4) +"        			  "+ rs.getInt(6)+"/"+rs.getInt(7)+"/2007\n" ;
               i++;
           
         } // end while
      }  // end try
      catch ( SQLException sqlException ) 
      {
         sqlException.printStackTrace();
         
      } // end catch
      catch ( ClassNotFoundException classNotFound ) 
      {
         classNotFound.printStackTrace();            
         
      } // end catch
      finally // ensure statement and connection are closed properly
      {                                                             
         try                                                        
         {                                                          
            statement.close();                                      
            connection.close();                                     
         } // end try                                               
         catch ( Exception exception )                        
         {                                                          
            exception.printStackTrace();                                     
            System.exit( 1 );                                       
         } // end catch 
         
                                                   
      } // end finally 
      
      return res;                   
   } // end ministatement
   
   
   
   public void  update_withdrawal_trans(int abal,int lbal,int accno,int amount)
   {
   	try
   	{							java.util.Date today = new java.util.Date();
    							SimpleDateFormat formatter = new SimpleDateFormat("dd");
   							    String dd = formatter.format(today);
   							    int ddd=Integer.parseInt(dd);
   							    
   							    
   							    
   							    SimpleDateFormat formatter1 = new SimpleDateFormat("MM");
   							    String mm = formatter1.format(today);
   							    int mmm=Integer.parseInt(mm);
   							    
   							    //Float date=Float.parseFloat(date1);
   							    //System.out.println(date);
   							    
   							    
   	   	Class.forName(driver);
    	connection = DriverManager.getConnection(dbsource, "", "");
    
    	statement=connection.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE);
    
    	String stm="insert into transactions (withdrawal,accno,dd,mm) VALUES ("+amount+","+accno+","+ddd+","+mmm+")";
    	statement.executeQuery(stm);
    
       	    
         //rs1.close();
              	               
                
       }//end try
       catch(Exception e)
       {
       	System.out.println(e);
       }
       finally // ensure statement and connection are closed properly
      {                                                             
         try                                                        
         {                                                          
            statement.close();                                      
            connection.close();                                     
         } // end try                                               
         catch ( Exception exception )                        
         {                                                          
            exception.printStackTrace();                                     
            System.exit( 1 );                                       
         } // end catch                                             
      } // end finally        
       
    	
    	
        
   } 
   
    public void  update_deposit_trans(int lbal,int accno,int amount)
   {
   	try
   	{							java.util.Date today = new java.util.Date();
    							SimpleDateFormat formatter = new SimpleDateFormat("dd");
   							    String dd = formatter.format(today);
   							    int ddd=Integer.parseInt(dd);
   							    
   							    
   							    
   							    SimpleDateFormat formatter1 = new SimpleDateFormat("MM");
   							    String mm = formatter1.format(today);
   							    int mmm=Integer.parseInt(mm);
   							    
   							    //Float date=Float.parseFloat(date1);
   							    //System.out.println(date);
   							    
   							    
   	   	Class.forName(driver);
    	connection = DriverManager.getConnection(dbsource, "", "");
    
    	statement=connection.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE);
    
    	String stm="insert into transactions (deposit,accno,dd,mm) VALUES ("+amount+","+accno+","+ddd+","+mmm+")";
    	statement.executeQuery(stm);
    
       	    
         //rs1.close();
              	               
                
       }//end try
       catch(Exception e)
       {
       	System.out.println(e);
       }
       finally // ensure statement and connection are closed properly
      {                                                             
         try                                                        
         {                                                          
            statement.close();                                      
            connection.close();                                     
         } // end try                                               
         catch ( Exception exception )                        
         {                                                          
            exception.printStackTrace();                                     
            System.exit( 1 );                                       
         } // end catch                                             
      } // end finally        
       
    	
    	
        
   } 
}  // end class



    
    
