
public class Withdrawal 
{
	int accno,amount,current_abal,prev_abal,current_lbal,prev_lbal;
	
	Withdrawal(int accno,int amount)
	{
		this.accno=accno;
		this.amount=amount;
		Query q=new Query();
		
		this.prev_abal=q.getacc(accno,"abal");
		this.prev_lbal=q.getacc(accno,"lbal");
		
		if(this.prev_abal>= amount )
		{
			this.current_abal=this.prev_abal-amount;
			this.current_lbal=this.prev_lbal-amount;
			
			q.update_withdrawal(this.current_abal,this.current_lbal,accno,amount);
			q.update_withdrawal_trans(this.current_abal,this.current_lbal,accno,amount);
		}
		
		
		
		
	}
	
	
}