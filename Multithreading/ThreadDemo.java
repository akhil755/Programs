public class ThreadDemo extends Thread{

	public void run(){
	
		for(int i=0; i<2; i++){
			System.out.println("hi from user thread");
			System.out.println(currentThread());
		}
	
	}

	public static void main(String []args){

		ThreadDemo td = new ThreadDemo();
		 System.out.println(currentThread());
		Thread t = new Thread(td);

		t.start();
	}
}