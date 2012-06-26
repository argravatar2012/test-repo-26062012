package ex;

public class FlowControl {

	public void testBreak() {

		int num = 0;
		do {
			num = (int) (Math.random() * 100);

			if (num == 0) {
				System.out.println("Got 0");
				break;
			}
			System.out.println("Will never run if num=45 ::: " + (10000 / num));

		} while (num < 90);
		System.out.println("--------");
	}

	public void testContinue() {
		
		outer:for (int j = 0; j < 5; j++) {
			System.out.println("Starting main loop j="+j);
			for (int i = 0; i < 10000; i++) {
				int num = (int) (Math.random() * 100);
				if (num == 0) {
					System.out.println("********** Got 0");
					break outer;
				}
				System.out.println(i / num);
			}
		}
	}

	public static void main(String[] args) {
		FlowControl fc = new FlowControl();
		fc.testContinue();
	}
}
