package shubham.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	private String[] data = {
		"Fortune1",
		"Fortune2",
		"Fortune3"
			
	};
	
	private Random rand ;
	
	@Override
	public String getFortune() {
		rand = new Random();
		int val = rand.nextInt(data.length);
		System.out.println(data.length);
		return data[val];
	}

}
