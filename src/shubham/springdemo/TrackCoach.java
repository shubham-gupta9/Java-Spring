package shubham.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(){
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: "+ fortuneService.getFortune();
	}
	
	
	//add an init method
	public void doMyStartupStuff(){
		System.out.println("doMyStartupStuff: You Spring Beautiful");
	}
	
	//add destroy method
	public void doMyCleanUpStuffYoYo(){
		System.out.println("Bean Executes Completely");
	}
}
