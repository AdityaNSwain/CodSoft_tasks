import java.util.Scanner;
class BankAccount {
	private double balance;
	
	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void Deposite(double amt) {
		if(amt>0) {
			balance += amt;
		    System.out.println("Deposit Successful!! Current Balance: " + balance);
		}
		else {
			System.out.println("Invalid deposite amount!!");
		}
	}
	
	public void Withdraw(double amt) {
		if(amt>0 && amt<=balance) {
			balance -= amt;
			System.out.println("Withdrawal Successful!! /n Current Balance: " + balance);
		}
		else if(amt>balance) {
			System.out.println("Insufficient balance!!");
		}
		else {
            System.out.println("Invalid withdrawal amount!!");
        }
	}
	
	public void checkBalance() {
		System.out.println("Your current balance is: " + balance);
	}
}

class ATMmachine {
	private BankAccount account;
    private Scanner ref = new Scanner(System.in);
	
	public ATMmachine(BankAccount account) {
		this.account = account;	
	}
	
	public void start() {
		while(true) {
			System.out.println();
			System.out.println("   ATMINTERFACE   ");
			System.out.println();
			System.out.println("WELCOME TO THE ATM ");
			System.out.println("1.Check Balance ");
			System.out.println("2.Deposite Amount ");
			System.out.println("3.Withdraw Amount ");
			System.out.println("4.Exit ");
			System.out.println("Choose an Option: ");
			int choice = ref.nextInt();
			
			switch(choice) {
			case 1: account.checkBalance();
			    break;
			case 2: DepositeAmt();
			    break;
			case 3: WithdrawalAmt();
			    break;
			case 4:
				System.out.println("Thank you for using ATM machine.. GoodBye!!");
				return;
			default:
				System.out.println("Invaild option!! Please try again..");
			}
		}
	}
	
	private void DepositeAmt() {
		System.out.println("Enter amount to deposite: ");
		double amount = ref.nextDouble();
		account.Deposite(amount);
	}
	
	private void WithdrawalAmt() {
		System.out.println("Enter amount to withdraw: ");
		double amount = ref.nextDouble();
		account.Withdraw(amount);
	}
}
public class ATMInterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount(10000);
        ATMmachine atm = new ATMmachine(account);
        atm.start();
	}
}
