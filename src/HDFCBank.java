
public class HDFCBank implements Bank{
	private double balance;

	@Override
	public void deposite(double amount) throws InvalidAmountException {
		// TODO Auto-generated method stub
		if(amount<=0)
		{
			throw new InvalidAmountException(amount +"is invalid amount");
		}
		balance = balance+amount;
	}

	@Override
	public double withDraw(double amount) throws InSuffecientFundsException {
		// TODO Auto-generated method stub
		if(amount>balance)
		{
			throw new InSuffecientFundsException(amount +"is Invalid amount");
		}
		balance = balance-amount;
		return amount;
	}

	@Override
	public void balanceEnquiry() {
		// TODO Auto-generated method stub
		System.out.println("balance is "+ balance);
		
	}
	

}
