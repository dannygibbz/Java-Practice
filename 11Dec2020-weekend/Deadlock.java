package hw.ss.weekend;

import hw.ss.weekend.Band

import com.ss.basics.three.Movie;

public class Deadlock {

	public static void main(String[] args) {
		Band b1 = new Band(2009, "Feel The Steel", 10);
		Band b2 = new Band(2019, "All You Can Eat", 9);
		System.out.println("Start Program");
		Runnable t1 = new Runnable() {
			@Override
			public void run() {
				try {
					synchronized (b1) {
						Thread.sleep(100);
						synchronized (b2) {
							System.out.println("Thread One Run");
						}
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		Runnable t2 = new Runnable() {
			@Override
			public void run() {
				try {
					synchronized (b2) {
						Thread.sleep(100);
						synchronized (b1) {
							System.out.println("Thread One Run");
						}
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		};
		new Thread(t1).start();
		new Thread(t2).start();
		System.out.println("End Program");
	}
	
	

}
