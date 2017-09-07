package scjp;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Reader extends Thread{
	calculator c;
	public Reader (calculator  calc) {
		c = calc;
	}
	
	public void run() {
		synchronized(c){
			try{
				System.out.println("Waiting for calc...");
				c.wait();
			}
			catch (InterruptedException e) { }
			System.out.println("Total is" + Thread.currentThread().getName() +" " + c.Total);
		}
	}
	
	public static void main(String[] args) {
		calculator cal = new calculator();
		new Reader(cal).start();
		new Reader(cal).start();
		new Reader(cal).start();
		cal.start();
	}
}

class calculator extends Thread{
	int Total;
	
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0; i<100 ; i++)
				Total += i;
			notifyAll();
		}
	}
	
}