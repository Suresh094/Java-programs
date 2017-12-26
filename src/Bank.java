//import com.InSuffecientFundsException;
public interface Bank {
	public void deposite(double amount)throws InvalidAmountException;
	public double withDraw(double amount)throws InSuffecientFundsException;
	public void balanceEnquiry();
	//public void deposite(double amount);

}
