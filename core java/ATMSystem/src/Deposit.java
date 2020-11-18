import java.util.*;
import java.text.*;

public class Deposit
{
	int accno,amount,current_lbal,prev_lbal;
	
	Deposit(int accno,int amount)
	{
		this.accno=accno;
		this.amount=amount;
		Query q=new Query();
		
		
		this.prev_lbal=q.getacc(accno,"lbal");
		
		
			
			this.current_lbal=this.prev_lbal+amount;
			
			q.update_deposit(this.current_lbal,accno,amount);
			q.update_deposit_trans(this.current_lbal,accno,amount);
	
		
		
	}
	
	

}