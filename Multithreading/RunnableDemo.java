public class RunnableDemo implements Runnable{

	public void run(){

		for(int i=0; i<2; i++){
			System.out.println("Hi from runnable user thread");
			System.out.println(Thread.currentThread());
		}
	}

	public static void main(String [] args){

		RunnableDemo rd = new RunnableDemo();
		System.out.println(Thread.currentThread());
		Thread td = new Thread(rd);
		
		td.start();
	}
}