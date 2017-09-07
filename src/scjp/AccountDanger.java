package scjp;

import javax.swing.plaf.synth.SynthSpinnerUI;

class Account {
	private int balance = 50;

	public int getBalance() {
		return balance;
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}
}

public class AccountDanger implements Runnable {
	private Account acc = new Account();

	public static void main(String[] args) {
		AccountDanger r = new AccountDanger();
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		one.setName("Fred");
		two.setName("Lucy");

		one.start();
		two.start();
	}

	public void run() {
		for (int x = 0; x < 5; x++) {
			makeWithdrawl(10);
			if(acc.getBalance()<0)
				System.out.println("account is overdrawn");
				/*RuntimeException r1 = new RuntimeException("from run");
				throw r1;
*/		}
	}

	private synchronized void makeWithdrawl(int amt) {
		if(acc.getBalance() >= amt){
			System.out.println(Thread.currentThread().getName() + "is going to withdraw");
			
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException e){ }
			acc.withdraw(amt);
			System.out.println(Thread.currentThread().getName() + "completes the withdrawal");
	}
		else{
			System.out.println("Not enought in accout for" 
					+ Thread.currentThread().getName() + "to withdraw" + acc.getBalance());
			
		}
}
}

