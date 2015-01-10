import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class ExcecTest {
	
	private static final int LOOP_COUNT = 10; 

	public static void main(String[] args) throws Exception {
		CountDownLatch latch = new CountDownLatch(LOOP_COUNT);
		long initialtime = System.currentTimeMillis();
		ExecutorService executors = Executors.newFixedThreadPool(10);
		for(int i = 0; i< LOOP_COUNT; i++){
			int j =i;
	executors.execute(new Runnable() {
		@Override
		public void run() {
			System.out.println(String.format("Thread %s is executing", j));
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(String.format("Thread %s finished executing", j));
			latch.countDown();
		}
	});
		}
	
	executors.shutdown();
	latch.await();
	long finaltime = System.currentTimeMillis();
		System.out.println(String.format("Execution of threads completed in %s ms", finaltime - initialtime));
	}	
}
