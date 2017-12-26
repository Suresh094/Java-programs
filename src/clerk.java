import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class clerk extends HDFCBank {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Bank acc = new HDFCBank();
			String option="";
			do {
				System.out.println("1 deposit");
				System.out.println("2 withdraw");
				System.out.println("3 balance Enquiry");
				System.out.println("enter option: ");
				option = br.readLine();
				switch(option)
				{
				case "1":
				{
					System.out.println("eneter the Deposit Amount");
					String s = br.readLine();
					double amount = Double.parseDouble(s);
					acc.deposite(amount);
					acc.balanceEnquiry();
					break;
				}
				case "2":
				{
					System.out.println("eneter the withdrawel Amount");
					String s = br.readLine();
					double amount = Double.parseDouble(s);
					acc.withDraw(amount);
					acc.balanceEnquiry();
					break;
				}
				case "3":
				{
					acc.balanceEnquiry();
					break;
				}
				default :
					System.out.println("enter a valid option");
					option= br.readLine();
				}
				System.out.println("do you want to continue(yes/no)");
				option = br.readLine();
			}while(option.equalsIgnoreCase("yes"));
			
			
		}
		catch(InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
		catch(InSuffecientFundsException e1) {
			
			System.out.println(e1.getMessage());
		}
		catch(NumberFormatException e2) {
			System.out.println(e2.getMessage());
		}
		catch(IOException e) {
			e.printStackTrace();
		}

		finally {
			System.out.println("Thank You");;
		}

	}

}
