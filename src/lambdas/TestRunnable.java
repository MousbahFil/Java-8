package lambdas;

public class TestRunnable {
	
	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello guys!");
			}
		};
//new Thread(runnable).start();

new Thread(() -> System.out.println("Hello guys")).start();;

	}
}
    