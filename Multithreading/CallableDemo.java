
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;



public class CallableDemo implements Callable<String>{

	public String call() throws Exception{

		return "finished executing";
	}

	public static void main(String args []) throws Exception{

		CallableDemo cd = new CallableDemo();
		ExecutorService es = Executors.newSingleThreadExecutor();

		Future<String> ft = es.submit(cd);
		System.out.println("task submitted");

		String result = ft.get();

		System.out.println("result from callable :"+result);
		es.shutdown();
	}
}