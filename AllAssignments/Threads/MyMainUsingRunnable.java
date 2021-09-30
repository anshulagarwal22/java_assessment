
/*
 * Write a program to illustrate creation of threads using runnable
class.(start method start each of the newly created thread. Inside the run
method there is sleep() for suspend the thread for 5000 milliseconds).
 */
package Threads;

//First class
class TableOfTwo implements Runnable{

	public void run() {
		try {
			int num=2;
			for(int i=1;i<=10;i++) {
				System.out.println("Thread 1 "+num+"*"+i+"="+(num*i));
				Thread.sleep(5000);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
				
	}
	
}

//second class
class TableOfThree implements Runnable{

	public void run() {
		try {
			int num=3;
			for(int i=1;i<=10;i++) {
				System.out.println("Thread 2 "+num+"*"+i+"="+(num*i));	
				Thread.sleep(5000);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}

public class MyMainUsingRunnable {
	
	public static void main(String args[]) {
		Thread thread=new Thread(new TableOfTwo());
		Thread thread2=new Thread(new TableOfThree());
		
		thread.start();
		thread2.start();
	}

}
